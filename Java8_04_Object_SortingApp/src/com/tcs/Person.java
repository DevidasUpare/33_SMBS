package com.tcs;

public class Person {

	private Integer pid;
	private String pname;
	private String pemail;

	public Person() {

	}

	public Person(Integer pid, String pname, String pemail) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + "]";
	}
	
	

}
