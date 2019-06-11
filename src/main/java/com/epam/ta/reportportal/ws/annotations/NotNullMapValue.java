package com.epam.ta.reportportal.ws.annotations;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = { NotNullMapValueValidator.class })
@Target({ ElementType.FIELD })
@Retention(value = RetentionPolicy.RUNTIME)
public @interface NotNullMapValue {

	String message() default "Map value should not be null.";

	Class<?>[] groups() default {};

	Class<?>[] payload() default {};
}
