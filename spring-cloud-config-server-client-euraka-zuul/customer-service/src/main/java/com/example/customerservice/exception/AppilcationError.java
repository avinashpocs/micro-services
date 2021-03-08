package com.example.customerservice.exception;

import java.util.Date;

public class AppilcationError {
	// how our exception will look

	private String message;
	private Date date;
	private String description;

	public AppilcationError(String message, Date date,String description) {
		super();
		this.message = message;
		this.date=date;
		this.description = description;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

}
