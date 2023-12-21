package egd.covid.persistence.component;

import java.util.List;

import egd.covid.persistence.entity.table.Persona;

public interface PersonaEntityManager {

	List<Persona> test(String nombre);

	List<Persona> searchPersona(String nombre, String primerApellido, String segundoApellido);

}
