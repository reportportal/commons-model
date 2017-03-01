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


import java.util.Collection;
import java.util.Iterator;

/**
 * Paged response  representation
 * Re-implementation of Spring's HATEAOS Page implementation to get rid of Spring's deps in model package
 *
 * @author Andrei Varabyeu
 */
public class Page<T> implements Iterable<T> {

	private final Collection<T> content;
	private final PageMetadata page;

	/**
	 * Visible for deserializer
	 */
	Page() {
		this(null, null);
	}

	public Page(Collection<T> content, PageMetadata page) {
		this.content = content;
		this.page = page;
	}

	public Page(Collection<T> content, long size, long number, long totalElements, long totalPages) {
		this.content = content;
		this.page = new PageMetadata(size, number, totalElements, totalPages);
	}

	public Page(Collection<T> content, long size, long number, long totalElements) {
		this.content = content;
		this.page = new PageMetadata(size, number, totalElements);
	}

	public Collection<T> getContent() {
		return content;
	}

	public PageMetadata getPage() {
		return page;
	}

	@Override
	public Iterator<T> iterator() {
		return content.iterator();
	}

	public static class PageMetadata {
		long number;
		long size;
		long totalElements;
		long totalPages;

		/**
		 * Visible for deserializer
		 */
		PageMetadata(){
		}

		public PageMetadata(long size, long number, long totalElements, long totalPages) {
			checkArgument(size > -1, "Size must not be negative!");
			checkArgument(number > -1, "Number must not be negative!");
			checkArgument(totalElements > -1, "Total elements must not be negative!");
			checkArgument(totalPages > -1, "Total pages must not be negative!");

			this.number = number;
			this.size = size;
			this.totalElements = totalElements;
			this.totalPages = totalPages;

		}

		public PageMetadata(long size, long number, long totalElements) {
			this(size, number, totalElements, size == 0 ? 0 : (long) Math.ceil((double) totalElements / (double) size));
		}

		public long getNumber() {
			return number;
		}

		public long getSize() {
			return size;
		}

		public long getTotalElements() {
			return totalElements;
		}

		public long getTotalPages() {
			return totalPages;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("PageMetadata{");
			sb.append("number=").append(number);
			sb.append(", size=").append(size);
			sb.append(", totalElements=").append(totalElements);
			sb.append(", totalPages=").append(totalPages);
			sb.append('}');
			return sb.toString();
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Page{");
		sb.append("content=").append(content);
		sb.append(", page=").append(page);
		sb.append('}');
		return sb.toString();
	}

	private static void checkArgument(boolean expression, String errorMessage) {
		if (!expression) {
			throw new IllegalArgumentException(errorMessage);
		}
	}
}
