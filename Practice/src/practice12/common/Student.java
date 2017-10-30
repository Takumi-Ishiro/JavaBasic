/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;
	
	
	//setter
	public void setId(int id) {
		this.studentId = id;
	}
	public void setNm(String nm) {
		this.studentName = nm;
	}
	public void setCorpNm(String corpNm) {
		this.companyName = corpNm;
	}
	public void setClassNm(String classNm) {
		this.className = classNm;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setPass(String pass) {
		this.password = pass;
	}
	
	//getter
	public int getId() {
		return this.studentId;
	}
	public String getNm() {
		return this.studentName;
	}
	public String getCorpNm() {
		return this.companyName;
	}
	public String getClassNm() {
		return this.className;
	}
	public String getMail() {
		return this.mail;
	}
	public String getPass() {
		return this.password;
	}
}
