package spring.co.VO;

public class MenuVO {

	private String snum;
	private String fname;
	private String cord;
	private Integer price;
	private String photo;
	
	public MenuVO() {
		super();
	}

	public MenuVO(String snum, String fname, String cord, Integer price, String photo) {
		super();
		this.snum = snum;
		this.fname = fname;
		this.cord = cord;
		this.price = price;
		this.photo = photo;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getCord() {
		return cord;
	}

	public void setCord(String cord) {
		this.cord = cord;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
	
}
