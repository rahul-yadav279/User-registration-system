package com.jsp.user.util;

public class Controller {
	Storage storage = new Storage();
	
	public void addUser(User user) {
		storage.addUsertoStorage(user);
	}
	
	public User findUser(String username) {
		return storage.findUserByusername(username);
	}
}
