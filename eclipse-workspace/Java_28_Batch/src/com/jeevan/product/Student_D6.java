package com.jeevan.product;

import java.util.Arrays;
import java.util.Comparator;

public class Student_D6{

	 public String firstName;
	 public String lastName;
	 public double gpa;
	
	public Student_D6(String firstName,String lastName,double gpa) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.gpa = gpa;
			}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
	    return " " + firstName + " " + lastName + " " + gpa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_D6[] student = {
		
		new Student_D6("Jeevan","Bagadi",3.3),
		new Student_D6("Siva","Kumar",3.1),
		new Student_D6("Deva","Raj",3.2),
		new Student_D6("Hari","Krishna",3.4),
		new Student_D6("Praveen","Kumar",3.7),
		new Student_D6("Keshav","Kumar",3.5),
	    new Student_D6("Madhav","Bandi",3.9),
		new Student_D6("Venu","krishna",3.4)
 		
		};
		
		//System.out.println(student[1]);
		Arrays.sort(student, Comparator.comparingDouble(Student_D6::getGpa));
		Arrays.asList(student).forEach(System.out::println);

	}
	}


