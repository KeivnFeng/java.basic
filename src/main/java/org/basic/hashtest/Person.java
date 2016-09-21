package org.basic.hashtest;

public class Person {
	
	String id;
	String name;
	
	public Person(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return "id=" + id + " ,name=" + name;
	}

}
