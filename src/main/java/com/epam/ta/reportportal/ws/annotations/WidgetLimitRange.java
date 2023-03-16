package com.epam.ta.reportportal.ws.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
@Documented
@Constraint(validatedBy = {WidgetLimitRangeValidator.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE,
    ElementType.PARAMETER})
public @interface WidgetLimitRange {

  String message() default "The provided limit is not allowed for the widget";

  Class<?>[] groups() default {};

  Class<?>[] payload() default {};

  String[] allowedValues() default {};
}
