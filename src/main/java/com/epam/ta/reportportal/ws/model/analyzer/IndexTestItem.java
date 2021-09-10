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

package com.epam.ta.reportportal.ws.model.analyzer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

/**
 * Represents test item container in index/analysis request/response.
 *
 * @author Ivan Sharamet
 */
public class IndexTestItem {

    @JsonProperty("testItemId")
    private Long testItemId;

    @JsonProperty("testItemName")
    private String testItemName;

    @JsonProperty("issueType")
    private String issueTypeLocator;

    private LocalDateTime startTime;

    @JsonProperty("logs")
    private Set<IndexLog> logs;

    @JsonProperty("uniqueId")
    private String uniqueId;

    // used for boost item if it was not analyzed by analyzer
    @JsonProperty("isAutoAnalyzed")
    private boolean isAutoAnalyzed;

    @JsonProperty("testCaseHash")
    private Integer testCaseHash;

    public IndexTestItem() {
    }

    public Long getTestItemId() {
        return testItemId;
    }

    public void setTestItemId(Long testItemId) {
        this.testItemId = testItemId;
    }

    public String getTestItemName() {
        return testItemName;
    }

    public void setTestItemName(String testItemName) {
        this.testItemName = testItemName;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getIssueTypeLocator() {
        return issueTypeLocator;
    }

    public void setIssueTypeLocator(String issueTypeLocator) {
        this.issueTypeLocator = issueTypeLocator;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Set<IndexLog> getLogs() {
        return logs;
    }

    public void setLogs(Set<IndexLog> logs) {
        this.logs = logs;
    }

    public boolean isAutoAnalyzed() {
        return isAutoAnalyzed;
    }

    public void setAutoAnalyzed(boolean autoAnalyzed) {
        isAutoAnalyzed = autoAnalyzed;
    }

    public Integer getTestCaseHash() {
        return testCaseHash;
    }

    public void setTestCaseHash(Integer testCaseHash) {
        this.testCaseHash = testCaseHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndexTestItem that = (IndexTestItem) o;
        return isAutoAnalyzed == that.isAutoAnalyzed &&
                Objects.equals(testItemId, that.testItemId) &&
                Objects.equals(issueTypeLocator, that.issueTypeLocator) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(logs, that.logs) &&
                Objects.equals(uniqueId, that.uniqueId) &&
                Objects.equals(testCaseHash, that.testCaseHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testItemId, issueTypeLocator, startTime, logs, uniqueId, isAutoAnalyzed, testCaseHash);
    }
}
