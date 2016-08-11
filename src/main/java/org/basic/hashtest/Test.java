package org.basic.hashtest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void test1() {
		System.out.println("Use user defind class as key:");
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("aaa", "bbb");
		hm.put("aaa", "ccc");
		
		Iterator<Entry<String, String>> iter = hm.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, String> entry = (Map.Entry<String, String>)iter.next();
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+"      "+val);
		}
	}
	
	public static void test2(){
		System.out.println("Use String as key:");
		HashMap<Person, String> hm = new HashMap<Person, String>();
		Person p1 = new Person("111", "name1");
		Person p2 = new Person("111", "name1");
		hm.put(p1, "address1");
		hm.put(p2, "address1");
		
		Iterator<Entry<Person, String>> iter = hm.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<Person, String> entry = iter.next();
			Person key = entry.getKey();
			String val = entry.getValue();
			System.out.println("key=" + key + "    value=" + val);
		}
		
	}
	
	public static void main(String args[]){
		//test1();
		test2();
	}

}
