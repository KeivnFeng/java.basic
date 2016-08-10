package org.basic.serial;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class People implements Serializable{
	
	private String name;
	private int age;
	public People(){
		this.name = "lili";
		this.age = 20;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}
	

	public static void main(String[] args){
		People p = new People();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try{
			FileOutputStream fos = new FileOutputStream(" perple.out");
		}
	}
}
