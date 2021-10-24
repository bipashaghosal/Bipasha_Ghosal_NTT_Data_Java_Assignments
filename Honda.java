package com.association;

public class Honda extends Car {
	
	public void hondaStartEngine() {
		CarEngine hondaEngine=new CarEngine();
		hondaEngine.engineStarts();
	}
	
	public void hondaMusicPlayer() {
		MusicPlayer hondaPlayer=new MusicPlayer();
		hondaPlayer.carMusicPlayer();
	}

}
