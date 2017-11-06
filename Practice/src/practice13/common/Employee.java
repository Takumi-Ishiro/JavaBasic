package practice13.common;

public class Employee extends Person {
	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */
	
	String departmentNm;
	int departmentCnt;
	
	public void setNm(String name) {
		
		this.departmentNm = name;
	}
	
	public void setCnt(int count) {
		
		this.departmentCnt = count;
	}
	
	public String getNm() {
		
		return this.departmentNm;
	}
	
	public int getCnt() {
		
		return this.departmentCnt;
	}
}