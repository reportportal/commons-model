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
package com.epam.ta.reportportal.ws.model.item;

import com.epam.ta.reportportal.ws.model.EntryCreatedAsyncRS;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Response Model for Start Test Item RQ
 *
 * @author Andrei Varabyeu
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemCreatedRS extends EntryCreatedAsyncRS {

  private String uniqueId;

  public ItemCreatedRS() {

  }

  public ItemCreatedRS(String id, String uniqueId) {
    super(id);
    this.uniqueId = uniqueId;
  }

  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

}
