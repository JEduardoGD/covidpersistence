package egd.covid.persistence.component.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import egd.covid.persistence.component.PersonaEntityManager;
import egd.covid.persistence.entity.table.Persona;
import egd.covid.persistence.util.StaticValuesHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Component
public class PersonaEntityManagerImpl extends StaticValuesHelper implements PersonaEntityManager {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Persona> test(String nombre) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Persona> criteria = cb.createQuery(Persona.class);
		Root<Persona> root = criteria.from(Persona.class);
		criteria.where(cb.equal(root.get("nombre"), nombre));
		List<Persona> result = em.createQuery(criteria).getResultList();
		return result;
	}

	@Override
	public List<Persona> searchPersona(String nombre, String primerApellido, String segundoApellido) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Persona> criteria = cb.createQuery(Persona.class);
		Root<Persona> root = criteria.from(Persona.class);

		List<Predicate> predicateList = new ArrayList<>();

		Predicate p;

		if (nombre != null && !EMPTY_STRING.equals(nombre)) {
			p = cb.like(root.get(NOMBRE_FIELD), nombre);
			predicateList.add(p);
		}

		if (primerApellido != null && !EMPTY_STRING.equals(primerApellido)) {
			p = cb.like(root.get(PRIMER_APELLIDO_FIELD), primerApellido);
			predicateList.add(p);
		}

		if (segundoApellido != null && !EMPTY_STRING.equals(segundoApellido)) {
			p = cb.like(root.get(SEGUNDO_APELLIDO_FIELD), segundoApellido);
			predicateList.add(p);
		}

		Predicate[] predicateArray = new Predicate[predicateList.size()];
		for (int i = 0; i < predicateList.size(); i++) {
			predicateArray[i] = predicateList.get(i);
		}

		criteria.select(root).where(predicateArray);

		return em.createQuery(criteria).getResultList();
	}
}
