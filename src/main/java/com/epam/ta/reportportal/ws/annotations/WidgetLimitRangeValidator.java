package com.epam.ta.reportportal.ws.annotations;

import com.epam.ta.reportportal.ws.model.SharableEntityRQ;
import com.epam.ta.reportportal.ws.model.widget.MaterializedWidgetType;
import com.epam.ta.reportportal.ws.model.widget.WidgetRQ;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_WIDGET_LIMIT;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_WIDGET_LIMIT;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
public class WidgetLimitRangeValidator implements ConstraintValidator<WidgetLimitRange, SharableEntityRQ> {

	@Override
	public boolean isValid(SharableEntityRQ value, ConstraintValidatorContext context) {
		if (value instanceof WidgetRQ) {
			WidgetRQ widgetRQ = (WidgetRQ) value;
			int limit = widgetRQ.getContentParameters().getItemsCount();
			if (Arrays.stream(MaterializedWidgetType.values()).anyMatch(it -> it.getType().equalsIgnoreCase(widgetRQ.getWidgetType()))) {
				return limit >= MIN_WIDGET_LIMIT;
			}
			updateValidationMessage("Widget item limit size must be between " + MIN_WIDGET_LIMIT + " and " + MAX_WIDGET_LIMIT, context);
			return limit >= MIN_WIDGET_LIMIT && limit <= MAX_WIDGET_LIMIT;
		}
		return false;
	}

	public void updateValidationMessage(String message, ConstraintValidatorContext context) {
		context.disableDefaultConstraintViolation();
		context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
	}
}
