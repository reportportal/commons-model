package com.epam.ta.reportportal.ws.model.item;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

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
