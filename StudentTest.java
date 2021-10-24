package com.association;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UndergradStudent ug = new UndergradStudent();
		ug.setName("Bipasha");
		ug.setRollNo(101);
		ug.setState("West Bengal");
		ug.setYear(2021);
		ug.studentDisplay();
		
		System.out.println("Student has taken admission in ");
		ug.studentJoined();
		System.out.println("Student joined the society is");
		ug.studentSociety();
		
		
		System.out.println();
		
		
		UndergradStudent ug2 = new UndergradStudent();
		ug2.setName("Diya");
		ug2.setRollNo(201);
		ug2.setState("West Bengal");
		ug2.setYear(2021);
		ug2.studentDisplay();
		
		System.out.println("Student has taken admission in ");
		ug2.studentJoined();
		System.out.println("Student joined the society is");
		
		
	}

}
