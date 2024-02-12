package com.jsp.user.util;

import java.util.ArrayList;

public class Storage {
	private static ArrayList<User> storage = new ArrayList<User>();
	
	public void addUsertoStorage(User user) {
		storage.add(user);
	}
	
	public User findUserByusername(String username) {
		User findUser = new User();
		for(User user : storage) {
			if(user.getUsername().equals(username)) {
				findUser = user;
			}
		}
		return findUser;
	}
}
