package com.pms.form;

public class User {

	private int userid;

	private String username;

	private String useremail;

	private String userpassword;

	private String userphoneno;

	private String usergender;

	private String useraddress;

	public User() {
	}

	public User(int userid, String username, String useremail, String userpassword, String userphoneno,
			String usergender, String useraddress) {
		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userphoneno = userphoneno;
		this.usergender = usergender;
		this.usergender = useraddress;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUserphoneno() {
		return userphoneno;
	}

	public void setUserphoneno(String userphoneno) {
		this.userphoneno = userphoneno;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

}
