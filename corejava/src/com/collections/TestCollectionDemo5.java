package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class TestCollectionDemo5 {


public static void main(String[] args) {

    Collection<String> names = new ArrayList<>();

    names.add("Virat");
    names.add("Rohit");
    names.add("Dhoni");
    names.add("Hardik");
    names.add("Rahul");

    System.out.println("******** Fail Fast ********");

    // For-each loop
    for (String name : names) {
        System.out.println(name);
    } // Close for-each loop here

   //concurrentmodificationexception 
  //if(name.equals("Dhoni")){
  //  names.remove("name");
 //}
    
    // Iterator
    //representing the element one after another with the help of iterator
    Iterator<String> itr = names.iterator();

    while (itr.hasNext()) {
 //  System.out.println(itr.next());

        String name1 = itr.next();

        if (name1.equals("Dhoni")) {
            itr.remove();
        }
    }

    
    System.out.println(names);
}
}