/*
 * Copyright 2016 EPAM Systems
 *
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-model
 *
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.ta.reportportal.ws.model.item;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Artsiom_Tkachou
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergeTestItemRQ {
    @NotNull
    @JsonProperty(value = "items")
    private List<String> items;

    @NotEmpty
    @JsonProperty("merge_type")
    private String mergeStrategyType;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getMergeStrategyType() {
        return mergeStrategyType;
    }

    public void setMergeStrategyType(String mergeStrategyType) {
        this.mergeStrategyType = mergeStrategyType;
    }
}
