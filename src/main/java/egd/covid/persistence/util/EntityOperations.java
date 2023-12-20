package egd.covid.persistence.util;

import java.math.BigDecimal;

public class EntityOperations {
	protected BigDecimal parse(Double d) {
		if (d == null) {
			return null;
		}
		return new BigDecimal(d);
	}
}
