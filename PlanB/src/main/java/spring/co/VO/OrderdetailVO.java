package spring.co.VO;

public class OrderdetailVO {

	private String onum;
	private String tnum;
	private String oname;
	
	public OrderdetailVO() {
		super();
	}
	
	public OrderdetailVO(String onum, String tnum, String oname) {
		super();
		this.onum = onum;
		this.tnum = tnum;
		this.oname = oname;
	}
	
	public String getOnum() {
		return onum;
	}
	public void setOnum(String onum) {
		this.onum = onum;
	}
	public String getTnum() {
		return tnum;
	}
	public void setTnum(String tnum) {
		this.tnum = tnum;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	
	
	
}
