/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.externalsystem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Basic representation of single post ticket form field<br>
 * <p>
 * NOTE: representation based on JIRA post ticket form
 *
 * @author Andrei_Ramanchuk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class PostFormField implements Comparable<PostFormField>, Serializable {

  /**
   * Field name on JIRA form
   */
  @JsonProperty(value = "fieldName")
  private String fieldName;

  /**
   * Field ID for post ticket request in JIRA
   */
  @JsonProperty(value = "id", required = true)
  private String id;

  /**
   * Field type for UI representation for user
   */
  @JsonProperty(value = "fieldType")
  private String fieldType;

  /**
   * Is field required for ticket post
   */
  @JsonProperty(value = "required", required = true)
  private boolean isRequired;

  /**
   * Field value(s)
   */
  @JsonProperty(value = "value")
  private List<String> value;

  /**
   * id - name representation of value
   */
  @JsonProperty(value = "namedValue")
  private List<NamedValue> namedValue;

  /**
   * Values for fields with pre-defined set
   */
  @JsonProperty(value = "definedValues")
  private List<AllowedValue> definedValues;

  @Override
  public int compareTo(PostFormField field) {
    Boolean current = this.isRequired;
    Boolean byField = field.isRequired;
    return byField.compareTo(current);
  }
}