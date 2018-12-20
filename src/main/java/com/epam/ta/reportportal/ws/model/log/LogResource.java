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

package com.epam.ta.reportportal.ws.model.log;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * JSON Representation of Report Portal's Log domain object
 *
 * @author Andrei Varabyeu
 */
@JsonInclude(Include.NON_NULL)
public class LogResource {

	@JsonInclude(Include.NON_NULL)
	public static class BinaryContent {

		@NotNull
		@JsonProperty(value = "id", required = true)
		private String binaryDataId;

		@JsonProperty(value = "thumbnailId", required = true)
		private String thumbnailId;

		@JsonProperty(value = "contentType", required = true)
		private String contentType;

		/**
		 * @return the binaryDataId
		 */
		public String getBinaryDataId() {
			return binaryDataId;
		}

		/**
		 * @param binaryDataId the binaryDataId to set
		 */
		public void setBinaryDataId(String binaryDataId) {
			this.binaryDataId = binaryDataId;
		}

		/**
		 * @return the thumbnailId
		 */
		public String getThumbnailId() {
			return thumbnailId;
		}

		/**
		 * @param thumbnailId the thumbnailId to set
		 */
		public void setThumbnailId(String thumbnailId) {
			this.thumbnailId = thumbnailId;
		}

		/**
		 * @return the contentType
		 */
		public String getContentType() {
			return contentType;
		}

		/**
		 * @param contentType the contentType to set
		 */
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("BinaryContent{");
			sb.append("binaryDataId='").append(binaryDataId).append('\'');
			sb.append(", thumbnailId='").append(thumbnailId).append('\'');
			sb.append(", contentType='").append(contentType).append('\'');
			sb.append('}');
			return sb.toString();
		}
	}

	@JsonProperty(value = "id", required = true)
	private Long id;

	@JsonProperty(value = "time")
	private Date logTime;

	@JsonProperty(value = "message")
	private String message;

	@JsonProperty(value = "binaryContent")
	private BinaryContent binaryContent;

	@JsonProperty(value = "thumbnail")
	private String thumbnail;

	@JsonProperty(value = "level")
	@ApiModelProperty(allowableValues = "error, warn, info, debug, trace, fatal, unknown")
	private String level;

	@JsonProperty(value = "testItem")
	private String testItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setTestItem(String testItem) {
		this.testItem = testItem;
	}

	public String getTestItem() {
		return testItem;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public void setBinaryContent(BinaryContent binaryContent) {
		this.binaryContent = binaryContent;
	}

	public BinaryContent getBinaryContent() {
		return binaryContent;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("LogResource{");
		sb.append("id='").append(id).append('\'');
		sb.append(", logTime=").append(logTime);
		sb.append(", message='").append(message).append('\'');
		sb.append(", binaryContent=").append(binaryContent);
		sb.append(", thumbnail='").append(thumbnail).append('\'');
		sb.append(", level='").append(level).append('\'');
		sb.append(", testItem='").append(testItem).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
