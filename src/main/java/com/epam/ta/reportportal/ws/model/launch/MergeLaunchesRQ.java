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

package com.epam.ta.reportportal.ws.model.launch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@JsonInclude(Include.NON_NULL)
public class MergeLaunchesRQ extends StartLaunchRQ {

    @NotNull
    @JsonProperty(value = "launches", required = true)
    @ApiModelProperty(required = true)
    private Set<String> launches;

    @JsonProperty(value = "extendSuitesDescription", required = true)
    private boolean extendSuitesDescription;

    @NotNull
    @JsonProperty(value = "end_time", required = true)
    @ApiModelProperty(required = true)
    private Date endTime;

    public boolean isExtendSuitesDescription() {
        return extendSuitesDescription;
    }

    public void setExtendSuitesDescription(boolean extendSuitesDescription) {
        this.extendSuitesDescription = extendSuitesDescription;
    }

    public void setLaunches(Set<String> values) {
        this.launches = values;
    }

    public Set<String> getLaunches() {
        return launches;
    }

    @Override
    public String toString() {
        return "MergeLaunchesRQ{" +
                "launches=" + launches +
                ", extendSuitesDescription=" + extendSuitesDescription +
                '}';
    }
}