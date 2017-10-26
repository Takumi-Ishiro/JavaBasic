package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < 5; i++) {			//全体の繰り返し回数：5回  
			for (int j = 0; j < i; j++) {		//■の表示個数
				System.out.print("■");
			}
			for (int k = 0; k < 5 - i; k++) {	//□の表示個数
				System.out.print("□");
			}
			System.out.print("\n");
		}
		for (int i = 0; i < 5; i++) {			//全体の繰り返し回数：5回  
			for (int j = 0; j < 5 - i; j++) {		//■の表示個数
				System.out.print("■");
			}
			for (int k = 0; k < i; k++) {	//□の表示個数
				System.out.print("□");
			}
			System.out.print("\n");
		}
	}
}
