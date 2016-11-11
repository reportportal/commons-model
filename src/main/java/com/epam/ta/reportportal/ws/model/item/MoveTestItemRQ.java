package com.epam.ta.reportportal.ws.model.item;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveTestItemRQ {
    @NotEmpty
    @JsonProperty(value = "launchId")
    private String launchId;

    @NotEmpty
    @JsonProperty(value = "parentItemId")
    private String parentItemId;

    public String getLaunchId() {
        return launchId;
    }

    public String getParentItemId() {
        return parentItemId;
    }

    public void setLaunchId(String launchId) {
        this.launchId = launchId;
    }

    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId;
    }
}
