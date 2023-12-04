/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.log;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Arrays;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @author Henadzi_Vrubleuski
 * @author Andrei Varabyeu
 */
@JsonInclude(Include.NON_NULL)
public class SaveLogRQ {

	@JsonProperty("uuid")
	private String uuid;

	@JsonAlias({ "itemUuid", "item_id" })
	@Schema(description = "UUID of test item owned this log")
	private String itemUuid;

	@JsonProperty(value = "launchUuid")
	@Schema(required = true)
	private String launchUuid;

	@NotNull
	@JsonProperty(value = "time", required = true)
	@Schema(required = true)
	private Date logTime;

	@JsonProperty(value = "message")
	private String message;

	@JsonProperty(value = "level")
	@Schema(allowableValues = "error, warn, info, debug, trace, fatal, unknown")
	private String level;

	@JsonProperty(value = "file")
	private File file;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public String getItemUuid() {
		return itemUuid;
	}

	public void setItemUuid(String itemUuid) {
		this.itemUuid = itemUuid;
	}

	public String getLaunchUuid() {
		return launchUuid;
	}

	public void setLaunchUuid(String launchUuid) {
		this.launchUuid = launchUuid;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public File getFile() {
		return file;
	}

	@JsonInclude(Include.NON_NULL)
	public static class File {

		@JsonProperty(value = "name")
		private String name;

		@JsonIgnore
		private byte[] content;

		@JsonIgnore
		private String contentType;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public byte[] getContent() {
			return content;
		}

		public void setContent(byte[] content) {
			this.content = content;
		}

		public String getContentType() {
			return contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("File{");
			sb.append("name='").append(name).append('\'');
			sb.append(", content=").append(Arrays.toString(content));
			sb.append(", contentType='").append(contentType).append('\'');
			sb.append('}');
			return sb.toString();
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SaveLogRQ{");
		sb.append("uuid='").append(uuid).append('\'');
		sb.append(", itemUuid='").append(itemUuid).append('\'');
		sb.append(", launchUuid='").append(launchUuid).append('\'');
		sb.append(", logTime=").append(logTime);
		sb.append(", message='").append(message).append('\'');
		sb.append(", level='").append(level).append('\'');
		sb.append(", file=").append(file);
		sb.append('}');
		return sb.toString();
	}
}
