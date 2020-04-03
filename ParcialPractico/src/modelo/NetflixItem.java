package modelo;

public class NetflixItem {
	
	public final static String TYPE_MOVIE="Movie";
	public final static String TYPE_SERIE="Serie";
	
	private String type;
	private String name;
	private int year;
	private double rating;
	private String img;
	
	public NetflixItem(String type, String name, int year, double rating, String img) {
		this.type = type;
		this.name = name;
		this.year = year;
		this.rating = rating;
		this.img = name.toLowerCase().replace(" ", "")+".jpg";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
	
	

}
