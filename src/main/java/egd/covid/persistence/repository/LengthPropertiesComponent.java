package egd.covid.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources({ @PropertySource("classpath:lengths.properties") })
@ConfigurationProperties(prefix = "length")
public class LengthPropertiesComponent {
	private Map<Integer, Integer> property = new HashMap<>();

	public Map<Integer, Integer> getProperty() {
		return property;
	}

}