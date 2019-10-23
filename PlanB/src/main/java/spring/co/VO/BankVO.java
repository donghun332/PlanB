package spring.co.VO;

public class BankVO {

	private String account;
	private String unum;
	private Integer balance;
	
	public BankVO() {
		super();
	}
	
	public BankVO(String account, String unum, Integer balance) {
		super();
		this.account = account;
		this.unum = unum;
		this.balance = balance;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUnum() {
		return unum;
	}
	public void setUnum(String unum) {
		this.unum = unum;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
