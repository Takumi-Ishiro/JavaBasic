package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します

		 Book[] book = FileReaderClass.readBookDataFile();
		 String[] array = new String[book.length];
		 
		 for (int i = 0; i < book.length; i++) {
			 array[i] = book[i].title;						 
		 }
		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		
		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		//"探したい本のタイトル（又はその一部）を入力してください"
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String line = scanner.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
									
			Book list =  book[i];
			
			if (array[i].indexOf(line) != -1)
				System.out.println(list.dispBookInfo());
			else
				count++;
				
		}	
		
		if (count == array.length)
			System.out.println("検索の結果は0件でした。");
	}
}
