package spring.co.VO;

public class BillVO {

	private String account;
	private Integer deposit;
	private String from;
	private Integer remittance;
	private String to;
	
	public BillVO() {
		super();
	}

	public BillVO(String account, Integer deposit, String from, Integer remittance, String to) {
		super();
		this.account = account;
		this.deposit = deposit;
		this.from = from;
		this.remittance = remittance;
		this.to = to;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getDeposit() {
		return deposit;
	}

	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Integer getRemittance() {
		return remittance;
	}

	public void setRemittance(Integer remittance) {
		this.remittance = remittance;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	
	
	
}
