package com.firebaseExample.model;

import org.springframework.stereotype.Service;

@Service
public class Notification
{
	private String body;

	private String title;

	private Boolean contentAvailable;

	private String priority;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getContentAvailable() {
		return contentAvailable;
	}

	public void setContentAvailable(Boolean contentAvailable) {
		this.contentAvailable = contentAvailable;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Notification [body=" + body + ", title=" + title + ", contentAvailable=" + contentAvailable
				+ ", priority=" + priority + "]";
	}
}
