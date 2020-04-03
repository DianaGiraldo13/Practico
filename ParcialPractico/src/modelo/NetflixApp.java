package modelo;

import java.util.ArrayList;

public class NetflixApp {
	
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
	
	

}
