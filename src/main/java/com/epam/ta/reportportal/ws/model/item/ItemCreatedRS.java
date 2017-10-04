/*
 * Copyright 2017 EPAM Systems
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

import com.epam.ta.reportportal.ws.model.EntryCreatedRS;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Response Model for Start Test Item RQ
 *
 * @author Andrei Varabyeu
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemCreatedRS extends EntryCreatedRS {

    public ItemCreatedRS() {

    }

    public ItemCreatedRS(String id, String uniqueId) {
        super(id);
        this.uniqueId = uniqueId;
    }

    private String uniqueId;

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }


}
