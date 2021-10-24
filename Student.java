package com.association;

public class Student {
	
	private String name;
	
	private int rollNo;
	
	private String state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	} 
	
	public void studentDisplay() {
		System.out.println("Name "+this.name+" Roll Number "+this.rollNo+" State "+this.state);
		
	}
	
}
