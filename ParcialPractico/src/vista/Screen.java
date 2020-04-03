package vista;

import control.NetflixController;
import processing.core.PApplet;

public class Screen extends PApplet{
	
	private NetflixController controller;
	
	public static void main(String[] args) {
		PApplet.main(Screen.class);
		
	}
	
	public void setUp() {
		
		controller=new NetflixController();
	}
	
	public void settings() {
    	size(1000,600);
    }
	
	public void draw() {
		background(0);
		
	}
	

}
