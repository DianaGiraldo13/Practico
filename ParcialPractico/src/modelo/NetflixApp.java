package modelo;

import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;

public class NetflixApp{
	
	private ArrayList<NetflixItem> items;
	
	public NetflixApp() {
		
		items=new ArrayList<NetflixItem>();

	}

	public ArrayList<NetflixItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<NetflixItem> items) {
		this.items = items;
	}
	

	public ArrayList<NetflixItem> sort(String sort){
		if(sort.equals("rating")) {
			Collections.sort(items);
		}
		else if(sort.equals("nombre")) {
			Collections.sort(items,new OrdenarPorNombre());
			System.out.println("nombre");
		}
		else if(sort.equals("fecha")) {
			Collections.sort(items,new OrdenarPorFecha());
		}
		return items;
	}
	
	

}
