package Training.TrainigDemo;

public class InputFormat {
	
	private String id;
	private String city;
	private String st;
	private String lat_n;
	private String long_w;
	
	
	
	
	public InputFormat(String id, String city, String st, String lat_n,
			String long_w) {
		 
		this.id = id;
		this.city = city;
		this.st = st;
		this.lat_n = lat_n;
		this.long_w = long_w;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	public String getLat_n() {
		return lat_n;
	}
	public void setLat_n(String lat_n) {
		this.lat_n = lat_n;
	}
	public String getLong_w() {
		return long_w;
	}
	public void setLong_w(String long_w) {
		this.long_w = long_w;
	}

	
	
	 
}
