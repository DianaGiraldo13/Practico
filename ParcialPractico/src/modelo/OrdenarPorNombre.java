package modelo;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<NetflixItem>{

	@Override
	public int compare(NetflixItem o1, NetflixItem o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
