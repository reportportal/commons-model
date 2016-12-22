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

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.io.ByteSource;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Henadzi_Vrubleuski
 * @author Andrei Varabyeu
 * 
 */
@JsonInclude(Include.NON_NULL)
public class SaveLogRQ {

	@NotNull
	@JsonProperty(value = "item_id", required = true)
	@ApiModelProperty(required = true)
	private String testItemId;
	
	@NotNull
	@JsonProperty(value = "time", required = true)
	@ApiModelProperty(required = true)
	private Date logTime;
	
	@JsonProperty(value = "message")
	private String message;
	
	@JsonProperty(value = "level")
	private String level;
	
	@JsonProperty(value = "file")
	private File file;

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

	public void setTestItemId(String testItemId) {
		this.testItemId = testItemId;
	}

	public String getTestItemId() {
		return testItemId;
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
		private ByteSource content;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public ByteSource getContent() {
			return content;
		}

		public void setContent(ByteSource content) {
			this.content = content;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("File{");
			sb.append("name='").append(name).append('\'');
			sb.append(", content=").append(content);
			sb.append('}');
			return sb.toString();
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SaveLogRQ{");
		sb.append("testItemId='").append(testItemId).append('\'');
		sb.append(", logTime=").append(logTime);
		sb.append(", message='").append(message).append('\'');
		sb.append(", level='").append(level).append('\'');
		sb.append(", file=").append(file);
		sb.append('}');
		return sb.toString();
	}
}