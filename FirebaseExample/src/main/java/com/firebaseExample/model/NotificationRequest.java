package com.firebaseExample.model;

import org.springframework.stereotype.Service;

@Service
public class NotificationRequest
{
	private String to;

	private String body;

	private String title;

	private Notification notification;
	
	private Boolean contentAvailable;

	private String priority;

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

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

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "NotificationRequest [to=" + to + ", body=" + body + ", title=" + title + ", notification="
				+ notification + ", contentAvailable=" + contentAvailable + ", priority=" + priority + "]";
	}
}
