package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestListDemo1 {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(9);
		l.add(1);
		l.add(4);
		l.add(5);
		l.add(6);
//		l.add(null);
//		l.add(null);
		Collections.sort(l);
		System.out.println(l);
//		l.add(10);
//		l.add("java");
//		l.add("java");
//		l.add("java");
//		l.add("java");
//		l.add('A');
//		l.add(9.6F);
//		l.add(null);
//		l.add(null);
//		System.out.println(l);

	}

}
