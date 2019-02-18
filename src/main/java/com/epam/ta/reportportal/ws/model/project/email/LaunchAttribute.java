package com.epam.ta.reportportal.ws.model.project.email;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_ATTRIBUTE_LENGTH;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class LaunchAttribute implements Serializable {

	@Size(max = MAX_ATTRIBUTE_LENGTH)
	private String key;

	@NotNull
	@NotEmpty
	@Size(max = MAX_ATTRIBUTE_LENGTH)
	private String value;

	public LaunchAttribute() {
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		LaunchAttribute that = (LaunchAttribute) o;

		if (key != null ? !key.equals(that.key) : that.key != null) {
			return false;
		}
		return value != null ? value.equals(that.value) : that.value == null;
	}

	@Override
	public int hashCode() {
		int result = key != null ? key.hashCode() : 0;
		result = 31 * result + (value != null ? value.hashCode() : 0);
		return result;
	}
}
