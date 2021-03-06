/*
 * PTra15_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Course;
import practice15.common.DBCourse;
import practice15.common.JavaCourse;

public class PTra15_01 {

	public static void main(String[] args) {

		JavaCourse jCourse = new JavaCourse();
		DBCourse dbCourse = new DBCourse();

		// ★ Course[	]の配列に jcourse と dbCourse のインスタンスを代入してください。
	
		//Course[] courseList = {new JavaCourse(), new DBCourse()};　指定されたインスタンス使ってなかったが短いので記念残し
		Course[] courseList = new Course[2];
		courseList[0] = jCourse;
		courseList[1] = dbCourse;
		
		for (Course course : courseList) {
			System.out.println(course.getCourseName());
		}
	}

}
