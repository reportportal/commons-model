package com.epam.ta.reportportal.ws.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Map;

public class NotNullMapValueValidator implements ConstraintValidator<NotNullMapValue, Map<?, ?>> {

	@Override
	public void initialize(NotNullMapValue constraintAnnotation) {
	}

	@Override
	public boolean isValid(Map<?, ?> value, ConstraintValidatorContext context) {
		if (null == value) {
			return true;
		}
		for (Object obj : value.values()) {
			if (null == obj) {
				return false;
			}
		}
		return true;
	}
}
