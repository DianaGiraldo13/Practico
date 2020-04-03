package control;

import modelo.NetflixApp;

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
	
	
	
	

}
