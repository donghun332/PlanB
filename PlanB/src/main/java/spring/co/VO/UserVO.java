package spring.co.VO;

import java.util.Date;

public class UserVO {

	private String unum;
	private String name;
	private String sex;
	private Date dob;
	private String add;
	private String pw;
	private String mail;
	private String grade;
	
	public UserVO() {
		super();
	}

	public UserVO(String unum, String name, String sex, Date dob, String add, String pw, String mail, String grade) {
		super();
		this.unum = unum;
		this.name = name;
		this.sex = sex;
		this.dob = dob;
		this.add = add;
		this.pw = pw;
		this.mail = mail;
		this.grade = grade;
	}

	public String getUnum() {
		return unum;
	}

	public void setUnum(String unum) {
		this.unum = unum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
}
