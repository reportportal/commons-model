/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.attribute;

import com.epam.ta.reportportal.ws.annotations.In;
import com.epam.ta.reportportal.ws.model.BulkInfoUpdateRQ;

import javax.validation.Valid;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class UpdateItemAttributeRQ {

	@Valid
	private ItemAttributeResource from;

	@Valid
	private ItemAttributeResource to;

	@In(allowedValues = { "create", "update", "delete" })
	private BulkInfoUpdateRQ.Action action;

	public ItemAttributeResource getFrom() {
		return from;
	}

	public void setFrom(ItemAttributeResource from) {
		this.from = from;
	}

	public ItemAttributeResource getTo() {
		return to;
	}

	public void setTo(ItemAttributeResource to) {
		this.to = to;
	}

	public BulkInfoUpdateRQ.Action getAction() {
		return action;
	}

	public void setAction(BulkInfoUpdateRQ.Action action) {
		this.action = action;
	}
}
