package com.epam.ta.reportportal.ws.model.validation;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_WIDGET_LIMIT;
import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MIN_WIDGET_LIMIT;

import com.epam.ta.reportportal.ws.model.widget.ContentParameters;
import com.epam.ta.reportportal.ws.model.widget.MaterializedWidgetType;
import com.epam.ta.reportportal.ws.model.widget.WidgetRQ;
import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
public class WidgetRqValidatorTest {

  private static Validator validator;

  @BeforeClass
  public static void init() {
    validator = Validation.buildDefaultValidatorFactory().getValidator();
  }

  @Test
  public void validWidgetRQ() {
    WidgetRQ widgetRQ = basicWidgetRq();
    final Set<ConstraintViolation<WidgetRQ>> validate = validator.validate(widgetRQ);
    Assert.assertTrue(validate.isEmpty());
  }

  @Test
  public void invalidLimitWidgetRQ() {
    WidgetRQ widgetRQ = basicWidgetRq();
    widgetRQ.getContentParameters().setItemsCount(601);
    final Set<ConstraintViolation<WidgetRQ>> validate = validator.validate(widgetRQ);
    Assert.assertEquals(1, validate.size());
    Assert.assertEquals(
        "Widget item limit size must be between " + MIN_WIDGET_LIMIT + " and " + MAX_WIDGET_LIMIT,
        validate.stream().findFirst().get().getMessage()
    );
  }

  @Test
  public void validLimitMaterializedView() {
    WidgetRQ widgetRQ = basicWidgetRq();
    widgetRQ.setWidgetType(MaterializedWidgetType.COMPONENT_HEALTH_CHECK_TABLE.getType());
    widgetRQ.getContentParameters().setItemsCount(601);
    Set<ConstraintViolation<WidgetRQ>> validate = validator.validate(widgetRQ);
    Assert.assertTrue(validate.isEmpty());
  }

  private WidgetRQ basicWidgetRq() {
    WidgetRQ widgetRQ = new WidgetRQ();
    widgetRQ.setName("testWidget");
    widgetRQ.setWidgetType("componentHealthCheck");
    widgetRQ.setFilterIds(Collections.emptyList());
    widgetRQ.setDescription("testDescription");

    ContentParameters contentParameters = new ContentParameters();
    contentParameters.setContentFields(Collections.emptyList());
    contentParameters.setItemsCount(100);
    contentParameters.setWidgetOptions(Collections.emptyMap());

    widgetRQ.setContentParameters(contentParameters);

    return widgetRQ;
  }

}
