package com.epam.ta.reportportal.ws.model.launch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;


@JsonInclude(NON_NULL)
public class DeepMergeLaunchesRQ extends MergeLaunchesRQ {
    @NotNull
    @JsonProperty("merge_type")
    private String mergeStrategyType;

    public String getMergeStrategyType() {
        return mergeStrategyType;
    }

    public void setMergeStrategyType(String mergeStrategyType) {
        this.mergeStrategyType = mergeStrategyType;
    }
}
