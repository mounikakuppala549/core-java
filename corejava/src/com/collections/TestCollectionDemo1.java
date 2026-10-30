package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo1 {

	public static void main(String[] args) {
		
		
//Collection is a raw type
// Reference to generic type Collection<E>should be parameterized
		Collection<Object> c=new ArrayList<>();
		c.add(10);
		c.add(7);
		c.add(18);
		c.add(45);
		c.add(33);
		c.add(77);
		c.add(3);
		c.add("mounika");
		System.out.println(c);
       
		Collection<String> names=new ArrayList<>();
		names.add("abcd");
		names.add("efgh");
		names.add("ijkl");
		names.add("mnop");
		names.add("qrst");
		names.add("uvw");
		names.add("xyz");
		
		System.out.println(names);
	}

}
