package spring.co.VO;

import java.util.Date;

public class OrderVO {
	
	private String onum;
	private String snum;
	private String unum;
	private Date date;
	
	public OrderVO() {
		super();
	}

	public OrderVO(String onum, String snum, String unum, Date date) {
		super();
		this.onum = onum;
		this.snum = snum;
		this.unum = unum;
		this.date = date;
	}

	public String getOnum() {
		return onum;
	}

	public void setOnum(String onum) {
		this.onum = onum;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	

}
