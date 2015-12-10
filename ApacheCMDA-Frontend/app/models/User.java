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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import util.APICall;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

public class User {

	private static final String GET_ALL_USER = Constants.NEW_BACKEND + "users/getAllUsers/json";
	private static final String GET_ALL_FRIENDS = Constants.NEW_BACKEND + "friend/";
	private static final String GET_ALL_SUBSCRIBE = Constants.NEW_BACKEND + "subscriber/getSubscriberByUserId/";
	private static final String GET_ONE_USER = Constants.NEW_BACKEND + "users/";
	private static final String ADD_NEW_USER = Constants.NEW_BACKEND + "users/add";
	private static final String HAS_USER = Constants.NEW_BACKEND + "users/isUserValid";
	private static final String GET_ISFRIEND = Constants.NEW_BACKEND + "friend/isFriendValid";
	private static final String ADD_FRIEND = Constants.NEW_BACKEND + "friend/add";
	private static final String DELETE_FRIEND = Constants.NEW_BACKEND + "friend/delete";

	private static final String ADD_SUBSCRIBE = Constants.NEW_BACKEND + "subscriber/add";
	private static final String DELETE_SUBSCRIBE = Constants.NEW_BACKEND + "subscriber/deleteSubscriber";
	private static final String GET_ISSUBSCRIBE = Constants.NEW_BACKEND + "subscriber/isSubscriberValid";

	public long id;
	public String userName;
	public String firstName;
	public String lastName;
	public String affiliation;
	public String phoneNumber;
	public String researchFields;
	public String email;
	public String password;
	public String description;

	public User() {

	}

	public static User getUser(long userId) {
		JsonNode json = APICall.callAPI(GET_ONE_USER + userId);
		return getUser(json);
	}

	public static List<User> getFriends(String userId) {
		List<User> users = new ArrayList<User>();

		JsonNode userNode = APICall.callAPI(GET_ALL_FRIENDS + userId);

		if (userNode == null || userNode.has("error")
				|| !userNode.isArray()) {
			return users;
		}

		for (int i = 0; i < userNode.size(); i++) {
			JsonNode json = userNode.path(i);
			User user = getUser(json);
			users.add(user);
		}
		return users;
	}

	public static void addFriend(String userId1, String userId2) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();

		queryJson.put("user1Id", userId1);
		queryJson.put("user2Id", userId2);
		System.out.println("addFriending");

		JsonNode dataSetNode = APICall.postAPI(ADD_FRIEND, queryJson);
		System.out.println("add friend response: "+dataSetNode);
	}

	public static void deleteFriend(String userId1, String userId2) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();

		queryJson.put("user1Id", userId1);
		queryJson.put("user2Id", userId2);

		JsonNode dataSetNode = APICall.postAPI(DELETE_FRIEND, queryJson);

	}

	public static boolean isFriend(String userId1, String userId2) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();

		queryJson.put("user1Id", userId1);
		queryJson.put("user2Id", userId2);

		JsonNode dataSetNode = APICall.postAPI(GET_ISFRIEND, queryJson);

		if (dataSetNode == null || dataSetNode.has("error")) {
			return false;
		}
		else {
			String isFriendValue = dataSetNode.asText();
			System.out.println("isFriend value "+isFriendValue);
			boolean tAns = isFriendValue.trim().equals("1");
			if(tAns) {
				System.out.println("Xin Testing tAns");
			}
			else {
				System.out.println("Xin Testing not tAns");
			}
			return tAns;
		}
	}

	public static void addSubscribe(String fromId1, String toId2) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();

		queryJson.put("fromUserId", fromId1);
		queryJson.put("toUserId", toId2);

		JsonNode dataSetNode = APICall.postAPI(ADD_SUBSCRIBE, queryJson);
	}

	public static void deleteSubscribe(String fromId1, String toId2) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();

		queryJson.put("fromUserId", fromId1);
		queryJson.put("toUserId", toId2);

		JsonNode dataSetNode = APICall.postAPI(DELETE_SUBSCRIBE, queryJson);
	}

	public static boolean isSubscribed(String fromId1, String toId2) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();

		queryJson.put("fromUserId", fromId1);
		queryJson.put("toUserId", toId2);

		JsonNode dataSetNode = APICall.postAPI(GET_ISSUBSCRIBE, queryJson);

		if (dataSetNode == null || dataSetNode.has("error")) {
			return false;
		}
		else {
			String isSubscribeValue = dataSetNode.asText();
			System.out.println("isSubscribed value "+isSubscribeValue);
			return isSubscribeValue.trim().equals("1");
		}
	}

	public static List<User> getSubscriptions(String userId) {
		List<User> users = new ArrayList<User>();

		JsonNode userNode = APICall.callAPI(GET_ALL_SUBSCRIBE + userId);

		if (userNode == null || userNode.has("error")
				|| !userNode.isArray()) {
			return users;
		}

		for (int i = 0; i < userNode.size(); i++) {
			JsonNode json = userNode.path(i);
			User user = getUser(json);
			users.add(user);
		}
		return users;
	}

	public static List<User> all() {

		List<User> users = new ArrayList<User>();

		JsonNode userNode = APICall.callAPI(GET_ALL_USER);

		if (userNode == null || userNode.has("error")
				|| !userNode.isArray()) {
			return users;
		}

		for (int i = 0; i < userNode.size(); i++) {
			JsonNode json = userNode.path(i);
			User user = getUser(json);
			users.add(user);
		}
		return users;
	}

	public static boolean signUp(User user) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();

		queryJson.put("userName", user.userName);
		queryJson.put("firstName", user.firstName);
		queryJson.put("lastName", user.lastName);
		queryJson.put("affiliation", user.affiliation);
		queryJson.put("phoneNumber", user.phoneNumber);
		queryJson.put("researchFields", user.researchFields);
		queryJson.put("email", user.email);
		queryJson.put("password", user.password);
		queryJson.put("description", user.description);

		JsonNode dataSetNode = APICall.postAPI(ADD_NEW_USER, queryJson);

		if (dataSetNode == null || dataSetNode.has("error")) {
			System.out.println("user creating failed: "+dataSetNode.asText());
			return false;
		}
		return true;
	}

	public static String signIn(User user) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();

		queryJson.put("email", user.email);
		System.out.println("email: " + user.email);
		queryJson.put("password", user.password);
		System.out.println("password: " + user.password);
		System.out.println("Calling!");

		JsonNode dataSetNode = APICall.postAPI(HAS_USER, queryJson);
		System.out.println("dataSetNode: "+dataSetNode.toString());

		if (dataSetNode == null || dataSetNode.has("error")) {
			System.out.println("User Null");
			return "";
		}
		else {
			String id = (dataSetNode.get("userId")).toString();
			System.out.println("User "+id);
			return id;
		}
	}

	public static String getField(JsonNode node, String fieldName) {
		if(node.get(fieldName)!=null) {
			return node.get(fieldName).asText();
		}
		else {
			return "";
		}
	}

	public static User getUser(JsonNode json) {
		User user = new User();
		user.id = json.get("id").asLong();
		user.userName = getField(json, "userName");
		user.firstName = getField(json, "firstName");
		user.lastName = getField(json, "lastName");
		user.affiliation = getField(json, "affiliation");
		user.email = getField(json, "email");
		user.password = getField(json, "password");
		user.description = getField(json, "description");
		user.phoneNumber = getField(json, "phoneNumber");
		user.researchFields = getField(json, "researchFields");
		return user;
	}


}

