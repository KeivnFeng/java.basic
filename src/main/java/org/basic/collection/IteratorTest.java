package org.basic.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		for(Iterator<String> iter = ll.iterator();iter.hasNext();){
			System.out.println(iter.next());
			
			if(iter.next().equals("second")){
				ll.add("five");
			}
		}
	}

}
