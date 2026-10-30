package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {
		Collection<String> boys=new ArrayList<>();
		boys.add("rohit");
		boys.add("manu");
		boys.add("abiram");
		boys.add("sai");
		boys.add("vamsi");
		boys.add("naveen");
		boys.add("ramu");
		
      System.out.println(boys);
      
      Collection<String> girls=new ArrayList<>();
       girls.add("mounika");
       girls.add("myra");
       girls.add("sujatha");
       girls.add("suji");
       girls.add("sandhya");
       girls.add("rajini");
       System.out.println(girls);
       
       Collection<String> students=new ArrayList<>();
       
       
     //  boys.clear();remove all of the elements from this collection(optional operator)
       students.addAll(boys);
       students.addAll(girls);
       
      // boys.clear();
     //  System.out.println(boys);
       System.out.println(students);
       
       students.remove("sujatha");
       students.removeAll(students);
       
       System.out.println(students.contains("mounika"));
       System.out.println(students.contains(girls));
	}

}
