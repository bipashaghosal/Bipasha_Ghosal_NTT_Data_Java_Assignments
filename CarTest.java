package com.association;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda hondaAmaze = new Honda();
		hondaAmaze.setColor("White");
		hondaAmaze.setSpeed(200);
		hondaAmaze.carDetails();
		hondaAmaze.hondaStartEngine();
		hondaAmaze.hondaMusicPlayer();
		
		
		Honda hondaJazz = new Honda();
		hondaJazz.setColor("Black");
		hondaJazz.setSpeed(250);
		hondaJazz.carDetails();
		hondaJazz.hondaStartEngine();

	}

}
