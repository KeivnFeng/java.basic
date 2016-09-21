package org.basic.serial;

import java.io.FileInputStream;
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
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.close();
			
		}catch(Exception ex){
			
		}
		
		People pl;
		
		try{
			FileInputStream fis = new FileInputStream("perple.out");
			ois = new ObjectInputStream(fis);
			pl = (People)ois.readObject();
			System.out.println("name:" + pl.getName());
			System.out.println("age:" + pl.getAge());
			ois.close();
		}catch(Exception ex){}
		
	}
}
