package com.epam.ta.reportportal.ws.model.settings;

import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.google.common.base.MoreObjects;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class GoogleAnalyticsConfig implements Serializable{

    @NotNull
    @NotEmpty
    private String id;

    private Boolean enabled;

    private final static String type = "google";


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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id).add("type", type)
                .add("enabled", enabled).toString();
    }
}
