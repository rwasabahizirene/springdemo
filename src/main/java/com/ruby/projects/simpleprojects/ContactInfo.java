package com.ruby.projects.simpleprojects;

public class ContactInfo {

	private String mainNumber;
	private String hrNumber;
	private String hrEmail;
	private String faxNumber;
	public String getMainNumber() {
		return mainNumber;
	}
	public void setMainNumber(String mainNumber) {
		this.mainNumber = mainNumber;
	}
	public String getHrNumber() {
		return hrNumber;
	}
	public void setHrNumber(String hrNumber) {
		this.hrNumber = hrNumber;
	}
	public String getHrEmail() {
		return hrEmail;
	}
	public void setHrEmail(String hrEmail) {
		this.hrEmail = hrEmail;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	@Override
	public String toString() {
		return "ContactInfo [mainNumber=" + mainNumber + ", hrNumber=" + hrNumber + ", hrEmail=" + hrEmail
				+ ", faxNumber=" + faxNumber + "]";
	}
}
