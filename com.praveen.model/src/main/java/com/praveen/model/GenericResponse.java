package com.praveen.model;

import org.springframework.stereotype.Component;

@Component

public class GenericResponse {

	/** Response status. */

	private String status;
	
	private String url;

	/** Response completed in time (ms) */

	private long completedIn;

	/** The errorDetails. */

	private String errorDetails;

	/** Response completed in time (ms) */

	/** Returned Data */
	private String d;

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public long getCompletedIn() {

		return completedIn;

	}

	/**
	 * 
	 * Sets the completed in.
	 * 
	 * 
	 * 
	 * @param completedIn
	 * 
	 *            the new completed in
	 */

	/** The success. */

	private String successMsg;

	public String getSuccessMsg() {
		return successMsg;
	}

	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}

	public void setCompletedIn(long completedIn) {

		this.completedIn = completedIn;

	}

	public String getStatus() {

		return status;

	}

	public void setStatus(String status) {

		this.status = status;

	}

	public String getErrorDetails() {

		return errorDetails;

	}

	public void setErrorDetails(String errorDetails) {

		this.errorDetails = errorDetails;

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
