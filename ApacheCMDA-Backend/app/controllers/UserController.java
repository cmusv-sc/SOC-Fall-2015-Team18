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
package controllers;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import models.UserRepository;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

/**
 * The main set of web services.
 */
@Named
@Singleton
public class UserController extends Controller {

	private final UserRepository userRepository;

	// We are using constructor injection to receive a repository to support our
	// desire for immutability.
	@Inject
	public UserController(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public Result addUser() {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("User not created, expecting Json data");
			return badRequest("User not created, expecting Json data");
		}

		// Parse JSON file
		String userName = json.path("userName").asText();
		String password = json.path("password").asText();
		String firstName = json.path("firstName").asText();
		String lastName = json.path("lastName").asText();
	    String affiliation = json.path("affiliation").asText();
	    String email = json.path("email").asText();
	    String phoneNumber = json.path("phoneNumber").asText();
	    String researchFields = json.path("researchFields").asText();
		String description = json.path("description").asText();

		try {
			if (userRepository.findByUserName(userName) != null) {
				System.out.println("UserName has been used: " + userName);
				return badRequest("UserName has been used");
			}
			if (userRepository.findByEmail(email) != null) {
				System.out.println("Email has been used: " + email);
				return badRequest("Email has been used");
			}
			User user = new User(userName, password, firstName, lastName, affiliation, email, phoneNumber, researchFields, description);
			userRepository.save(user);
			System.out.println("User saved: " + user.getId());
			ObjectMapper mapper = new ObjectMapper();
			ObjectNode queryJson = mapper.createObjectNode();
			queryJson.put("userId", user.getId());
			return ok(queryJson.toString());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("User not saved: " + firstName + " " + lastName);
			return badRequest("User not saved: " + firstName + " " + lastName);
		}
	}

	public Result deleteUser(Long id) {
		User deleteUser = userRepository.findOne(id);
		if (deleteUser == null) {
			System.out.println("User not found with id: " + id);
			return notFound("User not found with id: " + id);
		}

		userRepository.delete(deleteUser);
		System.out.println("User is deleted: " + id);
		return ok("User is deleted: " + id);
	}

	public Result updateUser(long id) {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("User not saved, expecting Json data");
			return badRequest("User not saved, expecting Json data");
		}

		// Parse JSON file
		String firstName = json.path("firstName").asText();
		String lastName = json.path("lastName").asText();
	    String affiliation = json.path("affiliation").asText();
	    String email = json.path("email").asText();
	    String phoneNumber = json.path("phoneNumber").asText();
	    String researchFields = json.path("researchFields").asText();
		String description = json.path("description").asText();
		try {
			User updateUser = userRepository.findOne(id);

			updateUser.setFirstName(firstName);
			updateUser.setLastName(lastName);
			updateUser.setAffiliation(affiliation);
			updateUser.setEmail(email);
			updateUser.setPhoneNumber(phoneNumber);
			updateUser.setResearchFields(researchFields);
			updateUser.setDescription(description);
			User savedUser = userRepository.save(updateUser);
			System.out.println("User updated: " + savedUser.getFirstName()
					+ " " + savedUser.getLastName());
			return created("User updated: " + savedUser.getFirstName() + " "
					+ savedUser.getLastName());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("User not updated: " + firstName + " "
					+ lastName);
			return badRequest("User not updated: " + firstName + " " + lastName);
		}
	}

	public Result getUser(Long id, String format) {
		if (id == null) {
			System.out.println("User id is null or empty!");
			return badRequest("User id is null or empty!");
		}

		User user = userRepository.findOne(id);

		if (user == null) {
			System.out.println("User not found with with id: " + id);
			return notFound("User not found with with id: " + id);
		}
		String result = new String();
		if (format.equals("json")) {
			result = new Gson().toJson(user);
		}

		return ok(result);
	}
	
	public Result getAllUsers(String format) {
		Iterable<User> userIterable = userRepository.findAll();
		List<User> userList = new ArrayList<User>();
		for (User user : userIterable) {
			userList.add(user);
		}
		String result = new String();
		if (format.equals("json")) {
			result = new Gson().toJson(userList);
		}
		return ok(result);
	}
	
	public Result isUserValid() {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Cannot check user, expecting Json data");
			return badRequest("Cannot check user, expecting Json data");
		}
		String email = json.path("email").asText();
		String password = json.path("password").asText();

		try{
			User user = null;
			user = userRepository.findByEmail(email);
			if(user == null){
				System.out.println("User is not valid");
				return badRequest(new Gson().toJson("0"));
			}

			if (user.getPassword().equals(password)) {

				System.out.println("User is valid");
				ObjectMapper mapper = new ObjectMapper();
				ObjectNode queryJson = mapper.createObjectNode();

				queryJson.put("userId", user.getId());
				return ok(queryJson.toString());
			} else {
				System.out.println("User is not valid");
				return badRequest(new Gson().toJson("0"));
			}
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("User is not valid" );
			return badRequest(new Gson().toJson("0"));
		}


	}
	
	public Result deleteUserByUserNameAndPassword(String userName, String password) {
		try {
			User user = userRepository.findByUserName(userName);
			if (user == null) {
				System.out.println("User is not existed");
				return badRequest("User is not existed");
			}

			if (user.getPassword().equals(password)) {
				System.out.println("User is deleted: "+user.getId());
				userRepository.delete(user);
				return ok("User is deleted");
			}
			else {
				System.out.println("User is not deleted for wrong password");
				return badRequest("User is not deleted for wrong password");
			}
		}
		catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("User is not deleted");
			return badRequest("User is not deleted");
		}
		
	}

}
