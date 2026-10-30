package com.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ShoppingCart {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cart=new CopyOnWriteArrayList<>();
		
      //1.add products
		cart.add("laptop");
		cart.add("mouse");
		cart.add("keybord");
		cart.add("monitor");
		
		Iterator<String>oldIterator=cart.iterator();
		cart.add("Headphones");
		cart.remove("mouse");
		
		System.out.println("old iterator:");
		while(oldIterator.hasNext()) {
			System.out.println(oldIterator.next());
		}
		Iterator<String>newIterator=cart.iterator();
		System.out.println("new iterator:");
		while(newIterator.hasNext()) {
			System.out.println(newIterator.next());
			
		}
	}

}
