package com.epam.ta.reportportal.ws.model.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(Include.NON_NULL)
public class GoogleAnalyticsConfig implements Serializable{

    @NotNull
    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "enabled")
    private Boolean enabled;

    static final String TYPE = "google";


    public GoogleAnalyticsConfig() {
    }

    public GoogleAnalyticsConfig(String id, Boolean enabled) {
        this.id = id;
        this.enabled = enabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id).add("type", TYPE)
                .add("enabled", enabled).toString();
    }
}
