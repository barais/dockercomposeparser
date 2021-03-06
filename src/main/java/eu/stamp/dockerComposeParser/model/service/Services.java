package eu.stamp.dockerComposeParser.model.service;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Services {

	private Map<String, Service> services = new HashMap<String, Service>();

	@JsonAnySetter
	public void setDynamicService(String name, Service s) {
		services.put(name, s);
	}

	@JsonAnyGetter
	public Map<String, Service> getService() {
		return services;
	}

}
