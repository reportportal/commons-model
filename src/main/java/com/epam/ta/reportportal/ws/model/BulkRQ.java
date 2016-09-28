package com.epam.ta.reportportal.ws.model;

import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BulkRQ<T> {

	@Valid
	@NotNull
	@JsonProperty(value = "entities", required = true)
	private Map<String, T> entities;

	public Map<String, T> getEntities() {
		return entities;
	}

	public void setEntities(Map<String, T> entities) {
		this.entities = entities;
	}

	@Override
	public String toString() {
		return "BulkRQ{" + "entities=" + entities + '}';
	}
}
