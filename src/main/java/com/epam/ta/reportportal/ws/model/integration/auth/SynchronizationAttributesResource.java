package com.epam.ta.reportportal.ws.model.integration.auth;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SynchronizationAttributesResource implements Serializable {

	@NotEmpty
	@JsonProperty(value = "email")
	private String email;

	@NotEmpty
	@JsonProperty(value = "fullName")
	private String fullName;

	@NotEmpty
	@JsonProperty(value = "photo")
	private String photo;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "SynchronizationAttributesResource{" + "email='" + email + '\'' + ", fullName='" + fullName + '\'' + ", photo='" + photo
				+ '\'' + '}';
	}
}
