package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Size {

	@JsonProperty(value = "width")
	private int width;

	@JsonProperty(value = "height")
	private int height;

	public Size() {
	}

	public Size(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Size size = (Size) o;

		if (width != size.width) {
			return false;
		}
		return height == size.height;
	}

	@Override
	public int hashCode() {
		int result = width;
		result = 31 * result + height;
		return result;
	}
}
