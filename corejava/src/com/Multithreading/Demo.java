package com.Multithreading;

class Student extends Thread{
String studentName;
double attendance;

Student(String studentName,double attendance){
	this.studentName=studentName;
	this.attendance=attendance;
	
}
@Override
public void run() {
	System.out.println("studentName:"+studentName);
	System.out.println("Attendance:"+attendance+"%");
	
}

 }
public class Demo {

	public static void main(String[] args) {
	
		Student s1=new Student("Mounika",95.5);
		Student s2=new Student("Ravi",85.0);
		
		s1.start();
		s2.start();
		
	}

}
