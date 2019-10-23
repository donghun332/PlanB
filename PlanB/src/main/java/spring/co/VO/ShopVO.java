package spring.co.VO;

public class ShopVO {

	private String snum;
	private String unum;
	
	public ShopVO() {
		super();
	}

	public ShopVO(String snum, String unum) {
		super();
		this.snum = snum;
		this.unum = unum;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getUnum() {
		return unum;
	}

	public void setUnum(String unum) {
		this.unum = unum;
	}
	
	
	
}
