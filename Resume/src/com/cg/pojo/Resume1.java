package com.cg.pojo;

import java.util.Arrays;

/**
 * @author Pooja Karnik
 * 
 *         Creating Resume fields along with getters, setters and toString
 *         methods
 *
 */
public class Resume1 {

	// Resume fields
	private String firstName;
	private String lastName;
	private String gender;
	private String[] qualification;
	private String dateOfBirth;
	private String[] hobbies;
	private String address;
	private String[] skills;
	private String email;
	private String website;
	private String contactnumber;
	private String description;

	// This is a Ctor..
	public Resume1(String firstName, String lastName, String gender, String[] qualification, String dateOfBirth,
			String[] hobbies, String address, String[] skills, String email, String website, String contactnumber,
			String description) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.qualification = qualification;
		this.dateOfBirth = dateOfBirth;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.email = email;
		this.website = website;
		this.contactnumber = contactnumber;
		this.description = description;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getQualification() {
		return qualification;
	}

	public void setQualification(String[] qualification) {
		this.qualification = qualification;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// toString method
	@Override
	public String toString() {
		return "Resume1 [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", qualification="
				+ Arrays.toString(qualification) + ", dateOfBirth=" + dateOfBirth + ", hobbies="
				+ Arrays.toString(hobbies) + ", address=" + address + ", skills=" + Arrays.toString(skills) + ", email="
				+ email + ", website=" + website + ", contactnumber=" + contactnumber + ", description=" + description
				+ "]";
	}
}
