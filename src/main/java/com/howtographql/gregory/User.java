package com.howtographql.gregory; 

public class User{
	private final String id, name, email, password; 

	public User(String name, String email, String password) {
		this(null, name, email, password); 
	}
	
	public User(String id, String name, String email, String password) {
		this.id = id; 
		this.name = name; 
		this.email = email; 
		this.password = password; 
	}
	
	public String getId() {
		return id; 
	}
	
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

	
}