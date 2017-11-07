package practice18.entity;

public class Player {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	private String position;
	private String name;
	private String country;
	private String team;
	
	//各フィールドへの入力
	public void setPosition(String position) {
		
		this.position = position;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public void setCountry(String country) {
	
		this.country = country;
	}
	public void setTeam(String team) {
	
		this.team = team;
	}
	
	//各フィールドの値の出力
	public String getPosition() {
		
		return this.position;
	}
	public String getName() {
		
		return this.name;
	}
	public String getCountry() {
		
		return this.country;
	}
	public String getTeam() {
		
		return this.team;
	}
	
	//各フィールドの値をカンマ区切りで取得
	public String toString() {
		
		return this.getPosition() + "," + this.getName() + "," + this.getCountry() + "," + this.getTeam();
	}
	
}
