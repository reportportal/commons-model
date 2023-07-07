/*
 * Copyright 2023 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;

@JsonInclude(Include.NON_NULL)
public class SearchCriteria {

  @NotNull
  @JsonProperty(value = "filter_key", required = true)
  @ApiModelProperty(required = true)
  private String filterKey;

  @JsonProperty(value = "operation")
  @ApiModelProperty(allowableValues = "EQ, NE, CNT, NON_CNT, BTW, IN")
  private String operation;

  @NotNull
  @JsonProperty(value = "value", required = true)
  @ApiModelProperty(required = true)
  private String value;

  public SearchCriteria() {
  }

  public SearchCriteria(String filterKey, String operation, String value) {
    this.filterKey = filterKey;
    this.operation = operation;
    this.value = value;
  }

  public String getFilterKey() {
    return filterKey;
  }

  public void setFilterKey(String filterKey) {
    this.filterKey = filterKey;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
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
    SearchCriteria that = (SearchCriteria) o;
    return Objects.equals(filterKey, that.filterKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterKey);
  }
}