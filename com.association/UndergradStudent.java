package com.association;

public class UndergradStudent extends Student{
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void studentJoined() {
		Branch join = new Branch();
		join.studiesBranch();
	}
	
	public void studentSociety() {
		Society studSociety=new Society();
		studSociety.collegeSociety();
	}
}
