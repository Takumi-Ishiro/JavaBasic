package practice14.ptra14;

public class DBCourse implements practice14.common.Course {
	
	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */
	String courseName = "「【Eラーニング】DB基礎」";
			
	String[] courseUnit = {"DB基礎","SQL基礎","正規化","SQL応用"};
	
	public String getCourseName() {
		
		return this.courseName;
	}
	
	public String[] getCourseUnit() {
		
		return this.courseUnit;
	}

}
