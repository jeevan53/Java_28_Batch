
package com.jeevan.product;

public class Student {
	
public String name;

public String getName() {
	return name;
	}

public String setName(String name) {
	return this.name = name;
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Student s = new Student();
	s.setName("Jeevan Kumar Bagadi");
	System.out.println(s.getName());
	}
}
