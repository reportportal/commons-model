/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
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
 * Report Portal's exception list
 * 
 * @author Andrei Varabyeu
 * 
 */
public enum ErrorType {


	/**
	 * Access Denied
	 */
	ADDRESS_LOCKED(4004, "Address is locked due to several incorrect login attempts"),

	/**
	 * Access Denied
	 */
	ACCESS_DENIED(4003, "You do not have enough permissions. {}"),

	/**
	 * Incorrect Report Portal WS Request
	 */
	INCORRECT_REQUEST(4001, "Incorrect Request. {}"),

	/**
	 * Incorrect Report Portal WS Request
	 */
	BINARY_DATA_CANNOT_BE_SAVED(4002, "Binary data cannot be saved. {}"),

	/**
	 * If specified by id Project or by ProjectName not found
	 */
	PROJECT_NOT_FOUND(4040, "Project '{}' not found. Did you use correct project name?"),

	/**
	 * If specified by id Launch not found
	 */
	LAUNCH_NOT_FOUND(4041, "Launch '{}' not found. Did you use correct Launch ID?"),

	/**
	 * If specified by id TestSuite not found
	 */
	TEST_SUITE_NOT_FOUND(4042, "TestSuite Not Found. Did you use correct TestSuite ID?"),

	/**
	 * If specified by id Test not found
	 */
	TEST_ITEM_NOT_FOUND(4043, "Test Item '{}' not found. Did you use correct Test Item ID?"),

	/**
	 * If specified by id Log not found
	 */
	LOG_NOT_FOUND(4044, "Log '{}' not found. Did you use correct Log ID?"),

	/**
	 * If specified by id role not found
	 */
	ROLE_NOT_FOUND(4045, "Project role '{}' not found. Did you use correct Role Name?"),

	/**
	 * If specified by login User not found
	 */
	USER_NOT_FOUND(4046, "User '{}' not found. {}"),

	/**
	 * If specified by id Widget not found
	 */
	WIDGET_NOT_FOUND(4047, "Widget with ID '{}' not found. Did you use correct Widget ID?"),

	/**
	 * If specified by id Widget not found
	 */
	WIDGET_NOT_FOUND_IN_DASHBOARD(4048, "Widget with ID '{}' not found in dashboard '{}'. Did you use correct Widget ID?"),

	/**
	 * If specified by id Dashboard not found
	 */
	DASHBOARD_NOT_FOUND(4049, "Dashboard with ID '{}' not found. Did you use correct Dashboard ID?"),

	/**
	 * If specified by id UserFilter not found
	 */
	USER_FILTER_NOT_FOUND(40410, "User filter '{}' not found for user '{}'. Did you use correct User Filter ID?"),

	/**
	 * If specified by id Activity not found
	 */
	ACTIVITY_NOT_FOUND(40411, "Activity '{}' not found. Did you use correct Activity ID?"),

	/**
	 * Unable to create widget based on favorite link
	 */
	UNABLE_TO_CREATE_WIDGET(40412, "Unable to create or update widget. {}"),

	/**
	 * If specified by id ExternalSystem not found
	 */
	EXTERNAL_SYSTEM_NOT_FOUND(40413, "ExternalSystem with ID '{}' not found. Did you use correct ExternalSystem ID?"),

	/**
	 * If project not configured with ExternalSystems
	 */
	PROJECT_NOT_CONFIGURED(40414, "Project '{}' not configured with ExternalSystems."),

	/**
	 * If server settings for specified profile not found
	 */
	SERVER_SETTINGS_NOT_FOUND(40415, "Server Settings with '{}' profile not found."),

	/**
	 * If issue type not found (including custom project specific sub-types)
	 */
	ISSUE_TYPE_NOT_FOUND(40416, "Issue Type '{}' not found."),

	/**
	 * If project settings for specified project not found
	 */
	PROJECT_SETTINGS_NOT_FOUND(40417, "Project Settings for project '{}' not found."),

	/**
	 * If specified by id ExternalSystem not found
	 */
	TICKET_NOT_FOUND(40418, "Ticket with ID '{}' not found. Did you use correct Ticket ID?"),

	/**
	 * If provided filtering parameters are incorrect
	 */
	INCORRECT_FILTER_PARAMETERS(40011, "Incorrect filtering parameters. {}"),

	/**
	 * If specified by id Log not found
	 */
	INCORRECT_SORTING_PARAMETERS(40012, "Sorting parameter {} is not defined"),

	/**
	 * If it's impossible to use specified external system
	 */
	INCORRECT_EXTERNAL_SYSTEM_NAME(40013, "Incorrect external system name. {}"),

	/**
	 * Unable modify sharable resource
	 */
	UNABLE_MODIFY_SHARABLE_RESOURCE(40014, "Unable modify sharable resource. {}"),

	/**
	 * Unable to recognize provided authentication type
	 */
	INCORRECT_AUTHENTICATION_TYPE(40015, "Incorrect authentication type: {}"),

	/**
	 * Impossible post ticket to external system
	 */
	UNABLE_POST_TICKET(4030, "Impossible post ticket to external system. {}"),

	/**
	 * Impossible interact with external system
	 */
	UNABLE_INTERACT_WITH_EXTRERNAL_SYSTEM(4032, "Impossible interact with external system. {}"),

	/**
	 * "Unable assign/unassign user to/from project
	 * 
	 */
	UNABLE_ASSIGN_UNASSIGN_USER_TO_PROJECT(4034, "Unable assign/unassign user to/from project. {}"),

	/**
	 * Project update not allowed. This restriction is applied to Personal projects and internal EPAM's project type
	 */
	PROJECT_UPDATE_NOT_ALLOWED(4007, "Update/Delete of project with type {} is not allowed"),

	/**
	 * Unable to update yourself role
	 */
	UNABLE_TO_UPDATE_YOURSELF_ROLE(4008, "Unable to update yourself role."),

	/**
	 * Impossible operation on server side
	 */
	FORBIDDEN_OPERATION(40010, "Forbidden operation. {}"),

	/**
	 * If resource with specified settings already exists and should be unique
	 */
	RESOURCE_ALREADY_EXISTS(4091, "Resource '{}' already exists. You couldn't create the duplicate."),

	/**
	 * If Role with specified settings already exists and should be unique
	 */
	ROLE_ALREADY_EXISTS_ERROR(4093, "Role with specified settings already exists. You couldn't create the duplicate."),

	/**
	 * If User with specified login already exists and should be unique
	 */
	USER_ALREADY_EXISTS(4094, "User with '{}' already exists. You couldn't create the duplicate."),

	/**
	 * If User filter with specified name already exists and should be unique
	 */
	USER_FILTER_ALREADY_EXISTS(4098,
			"User filter with name '{}' already exists for user '{}' under the project '{}'. You couldn't create the duplicate."),

	/**
	 * If Project with specified settings already exists and should be unique
	 */
	PROJECT_ALREADY_EXISTS(4095, "Project '{}' already exists. You couldn't create the duplicate."),

	/**
	 * If Dashboard update request contains invalid data
	 */
	DASHBOARD_UPDATE_ERROR(4096, "Dashboard update request contains invalid data. {}"),

	/**
	 * If widget content can't be loaded because some of properties are
	 * incorrect
	 */
	UNABLE_LOAD_WIDGET_CONTENT(4097, "Unable to load widget content. Widget proprties contains errors: {}"),

	/**
	 * Unable add resource to favorites
	 */
	UNABLE_ADD_TO_FAVORITE(4099, "Unable add resource to favorites. {}"),

	/**
	 * Unable create duplicate of external system
	 */
	EXTERNAL_SYSTEM_ALREADY_EXISTS(40910, "External System '{}' already exists. You couldn't create the duplicate."),

	/**
	 * Unable create the duplication of server settings with one profile name
	 */
	SERVER_SETTINGS_ALREADY_EXISTS(40911, "Server settings with '{}' profile already exists. You couldn't create the duplicate."),

	/**
	 * Unable remove resource from favorites
	 */
	UNABLE_REMOVE_FROM_FAVORITE(4100, "Unable remove resource from favorites. {}"),

	/**
	 * If specified by login User not found
	 */
	LAUNCH_IS_NOT_FINISHED(4063, "Unable to perform operation for non-finished launch. {}"),

	/**
	 * Unable to finish with incorrect status
	 */
	TEST_ITEM_IS_NOT_FINISHED(4064, "Unable to perform operation for non-finished test item. {}"),

	/**
	 * Unable to finish with incorrect status
	 */
	INCORRECT_FINISH_STATUS(4065, "{}. Did you provide correct status in request?"),

	/**
	 * Base Error If Request sent with incorrect parameters
	 */
	BAD_REQUEST_ERROR(40016, "Error in handled Request. Please, check specified parameters: '{}'"),
	/**
	 * If SaveLogRQ sent with incorrect parameters
	 */
	BAD_SAVE_LOG_REQUEST(40017, "Error in Save Log Request. {}"),
	/**
	 * If Test, TestStep, Launch already finished and writing is disabled
	 */
	REPORTING_ITEM_ALREADY_FINISHED(40018, "Reporting for item {} already finished. Please, check item status."),

	/**
	 * Occurs when status is not provided and cannot be calculated or provided
	 * status does not corresponds to calculated from statistics.
	 */
	AMBIGUOUS_TEST_ITEM_STATUS(40019, "Test item status is ambiguous. {}"),

	/**
	 * Incorrect test item description
	 */
	FAILED_TEST_ITEM_ISSUE_TYPE_DEFINITION(40020, "Test items issue type cannot be resolved. {}"),

	/**
	 * Finish Time Earlier than start time
	 */
	FINISH_TIME_EARLIER_THAN_START_TIME(40021, "Finish time '{}' is earlier than start time '{}' for resource with ID '{}'"),

	/**
	 * Is not allowed to finish item
	 */
	FINISH_ITEM_NOT_ALLOWED(40022, "Finish test item is not allowed. "),

	/**
	 * Unable to finish in current status
	 */
	FINISH_LAUNCH_NOT_ALLOWED(40023, "Finish launch is not allowed. {}"),

	/**
	 * Unable to finish in current status
	 */
	START_ITEM_NOT_ALLOWED(40024, "Start test item is not allowed. {}"),

	/**
	 * Finish Time Earlier than start time
	 */
	CHILD_START_TIME_EARLIER_THAN_PARENT(40025,
			"Start time of child ['{}'] item should be same or later than start time ['{}'] of the parent item/launch '{}'"),

	/**
	 * Unsupported test item type
	 */
	UNSUPPORTED_TEST_ITEM_TYPE(40026, "Test Item type {} is unsupported"),

	/**
	 * Unsupported test item type
	 */
	LOGGING_IS_NOT_ALLOWED(40027, "Logging is not allowed. {}"),

	/**
	 * 
	 * Incorrect create widget request
	 */
	BAD_SAVE_WIDGET_REQUEST(40028, "Incorrect create widget request. {}"),

	/**
	 * 
	 * Incorrect update widget request
	 */
	BAD_UPDATE_WIDGET_REQUEST(40029, "Incorrect update widget request. {}"),

	/**
	 * 
	 * Unable to load history test item's history.
	 */
	UNABLE_LOAD_TEST_ITEM_HISTORY(40030, "Unable to load test item history. {}"),

	/**
	 * Bad save user filter request
	 */
	BAD_SAVE_USER_FILTER_REQUEST(40031, "Bad save user filter request. {}"),

	/**
	 * Bad save user filter request
	 */
	PROJECT_DOESNT_CONTAIN_USER(4220, "Project '{}' doesn't contain user '{}'"),

	/**
	 * Base ReportPortal Exception. Try to avoid this type and create more
	 * custom
	 */
	UNCLASSIFIED_REPORT_PORTAL_ERROR(5001, "Unclassified Report Portal Error"),

	/**
	 * Incorrect update preference request
	 */
	BAD_UPDATE_PREFERENCE_REQUEST(40032, "Incorrect update widget request {}"),

	/**
	 * Use it If there are no any other exceptions. There should by no such
	 * exception
	 */
	UNCLASSIFIED_ERROR(5000, "Unclassified error");

	private final int code;

	private final String description;

	ErrorType(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * Get instance by code
	 * 
	 * @param code Error Code
	 * @return ErrorType
	 */
	public static ErrorType getByCode(int code) {
		for (ErrorType error : values()) {
			if (error.getCode() == code) {
				return error;
			}
		}
		throw new IllegalArgumentException("Unable to find Error with code '" + code + "'");
	}
}
