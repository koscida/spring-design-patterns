package com.frankmoley.lil.designpatternsapp.builder;
public class ContactBuilder {
	private String firstName;
	private String lastName;
	private String emailAddress;

	public ContactBuilder() {

	}
	// constructor
//	public ContactBuilder(String firstName, String lastName, String emailAddress) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.emailAddress = emailAddress;
//	}

	// setters
	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public ContactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public ContactBuilder setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	public Contact buildContact() {
		return new Contact(firstName, lastName, emailAddress);
	}
}
