package com.howtographql.gregory;

// creates a class for Links
// a link has a url and description associated with it
// This file only contains get methods for these fields of a link
public class Link {
    
	private final String id; 
    private final String url;
    private final String description;
    private final String name; 
    private final int age; 

    
    public Link (String url, String description, String name, int age) {
    	this(null, url, description,name, age); 
    }
    
    public Link (String id, String url, String description, String name, int age) {
    	this.id = id; 
    	this.url = url; 
    	this.description = description; 
    	this.name = name; 
    	this.age = age; 
    }
    
    public String getId() {
    	return id; 
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }
    
    public String getName() {
    	return name; 
    }
    
    public int getAge() {
    	return age; 
    }
    

}