package org.basic.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
	
	public static void test1(){
		System.out.println("Use user defined class as key:");
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("aaa", "bbb");
		hm.put("aaa", "ccc");
		
		Iterator iter = hm.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, String> entry = (Map.Entry<String, String>)iter.next();
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + "    " + val);
		}
		
	}
	
	public static void main(String args[]){
		test1();
	}

}
