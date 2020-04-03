package vista;

import java.util.ArrayList;
import java.util.Collections;

import control.NetflixController;
import modelo.Movie;
import modelo.NetflixItem;
import modelo.Serie;
import processing.core.PApplet;

public class Screen extends PApplet{
	
	private NetflixController controller;
	 
	private String sort;
	
	
	public static void main(String[] args) {
		PApplet.main(Screen.class);
		
	}
	
	public void setup() {
		sort="rating";
		controller=new NetflixController();
		ArrayList<NetflixItem> items;
		items=new ArrayList<NetflixItem>();
			String [] lines =loadStrings("./data/netflix.txt");
			for(int i=0;i<lines.length;i++) {
				String [] datos=lines[i].split(",");
				String tipo=datos[3];
				if(tipo.equals(NetflixItem.TYPE_MOVIE)) {
					items.add(new Movie(datos[0], Integer.parseInt(datos[1]), Double.parseDouble(datos[2])));
				}
				else {
					items.add(new Serie(datos[0], Integer.parseInt(datos[1]), Double.parseDouble(datos[2])));
				}
				
			}
		Collections.sort(items);
		controller.save(items);
		
	}
	
	public void settings() {
    	size(1200,500);

    }
	
	public void draw() {
		ArrayList<NetflixItem> items=controller.sort(sort);
		background(0);
		for(int i=0;i<items.size();i++) {
			image(loadImage(items.get(i).getImg()), i*200, 10,200,280);
		}
		
		
		fill(255,255,255);
		text("Ordenar Nombre presiona UP", 250, 400);
		text("Ordenar Rating presiona RIGTH", 550, 400);
		text("Ordenar Fecha presiona LEFT", 850, 400);
		
		
	}
	
	public void keyPressed() {
		System.out.println("ok");
		  if(keyCode==UP) {
			  sort="nombre";
			  System.out.println(sort);
		  }
		  else if(keyCode==RIGHT) {
			  sort="rating";
			  System.out.println(sort);
		  }
		  else if(keyCode==LEFT) {
			  sort="fecha";
			  System.out.println(sort);
		  }
		}
	
	

}
