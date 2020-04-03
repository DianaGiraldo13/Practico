package control;

import java.util.ArrayList;

import modelo.NetflixApp;
import modelo.NetflixItem;

public class NetflixController {
	
	private NetflixApp app;
	
	public NetflixController() {
		app=new NetflixApp();
	}

	public NetflixApp getApp() {
		return app;
	}

	public void setApp(NetflixApp app) {
		this.app = app;
	}
	
	public ArrayList<NetflixItem> sort(String sort){
		
		return app.sort(sort); 
	}
	
	public void save(ArrayList<NetflixItem> items) {
		app.setItems(items);
	}
	
	

}
