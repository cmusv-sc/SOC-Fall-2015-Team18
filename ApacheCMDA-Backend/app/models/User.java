/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String affiliation;
	private String email;
	private String phoneNumber;
	private String researchFields;
	private String description;


	public User() {
	}

	public User(String userName, String password, String firstName,
				String lastName, String affiliation,
				String email,
				String phoneNumber, String researchFields,
				String description) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.affiliation = affiliation;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.researchFields = researchFields;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAffiliation() {
		return affiliation;
	}


	public String getEmail() {
		return email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getResearchFields() {
		return researchFields;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public void setResearchFields(String researchFields) {
		this.researchFields = researchFields;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", firstName=" + firstName + ", lastName="
				+ lastName
				+ ", affiliation=" + affiliation
				+ ", email=" + email
				+ ", phoneNumber=" + phoneNumber
				+ ", researchFields=" + researchFields
				+ ", description=" + description + "]";
	}

}

