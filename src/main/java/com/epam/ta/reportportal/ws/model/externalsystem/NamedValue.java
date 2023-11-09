package com.epam.ta.reportportal.ws.model.externalsystem;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents value that consists of id for making request and human readable name
 */
@Data
@NoArgsConstructor
public class NamedValue {

  private Long id;
  private String name;
}
