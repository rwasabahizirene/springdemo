package com.ruby.projects.simpleprojects;

public class Company {

	private Address address;
	private ContactInfo contactInfo;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	@Override
	public String toString() {
		return "Company [address=" + address + ", contactInfo=" + contactInfo + "]";
	}
}
