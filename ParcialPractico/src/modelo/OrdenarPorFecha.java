package modelo;

import java.util.Comparator;

public class OrdenarPorFecha implements Comparator<NetflixItem>{

	@Override
	public int compare(NetflixItem o1, NetflixItem o2) {
		int f1=o1.getYear();
		int f2=o1.getYear();
		
		return f1-f2;
	}
	
	

}
