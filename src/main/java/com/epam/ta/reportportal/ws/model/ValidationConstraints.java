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

package com.epam.ta.reportportal.ws.model;

/**
 * Contains constants for defining validation constraints.
 *
 * @author Aliaksei_Makayed
 *
 */
//TODO review and move to API service
public class ValidationConstraints {

	private ValidationConstraints() {

	}

	/* 1 always exists as predefined type */
	public static final int MAX_ISSUE_SUBTYPES = 11;

	public static final int MIN_COLLECTION_SIZE = 1;
	public static final int MAX_NUMBER_OF_FILTER_ENTITIES = 20;
	public static final int MIN_WIDGET_LIMIT = 1;
	public static final int MAX_WIDGET_LIMIT = 150;
	public static final int MIN_FILTER_LIMIT = 1;
	public static final int MAX_FILTER_LIMIT = 150;
	public static final int MIN_LAUNCH_NAME_LENGTH = 1;
	public static final int MIN_NAME_LENGTH = 3;
	public static final int MAX_NAME_LENGTH = 256;
	public static final int MIN_DESCRIPTION_LENGTH = 0;
	public static final int MAX_DESCRIPTION_LENGTH = 65536;
	public static final int MAX_LAUNCH_DESCRIPTION_LENGTH = 1024;

	public static final int MAX_WIDGET_NAME_LENGTH = 128;
	public static final int MAX_DASHBOARD_NAME_LENGTH = 128;
	public static final int MAX_USER_FILTER_NAME_LENGTH = 128;

	public static final int MIN_PAGE_NUMBER = 1;
	public static final int MAX_PAGE_NUMBER = 1024;
	public static final int MAX_HISTORY_DEPTH_BOUND = 31;
	public static final int MIN_HISTORY_DEPTH_BOUND = 0;
	public static final int MAX_HISTORY_SIZE_BOUND = 31;

	public static final int MIN_LOGIN_LENGTH = 1;
	public static final int MAX_LOGIN_LENGTH = 128;

	public static final int MIN_PASSWORD_LENGTH = 4;
	public static final int MAX_PASSWORD_LENGTH = 25;

	public static final int TICKET_MIN_LOG_SIZE = 0;
	public static final int TICKET_MAX_LOG_SIZE = 50;

	public static final int MAX_CUSTOMER_LENGTH = 64;

	public static final int MIN_USER_NAME_LENGTH = 3;
	public static final int MAX_USER_NAME_LENGTH = 256;

	public static final int MAX_PHOTO_SIZE = 1024 * 1024;
	public static final int MAX_PHOTO_HEIGHT = 500;
	public static final int MAX_PHOTO_WIDTH = 300;

	public static final int MIN_DOMAIN_SIZE = 1;
	public static final int MAX_DOMAIN_SIZE = 255;

	public static final int MIN_SUBTYPE_SHORT_NAME = 1;
	public static final int MAX_SUBTYPE_SHORT_NAME = 4;

	public static final int MIN_SUBTYPE_LONG_NAME = 3;
	public static final int MAX_SUBTYPE_LONG_NAME = 55;

	public static final int MAX_FILTER_DESCRIPTION = 256;
	public static final int MIN_FILTER_DESCRIPTION = 1;

}