package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] car = new Car[3];
		Car cars = new Car();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		//シリアル番号、車の色、ガソリンの数字をそれぞれ入力してcar配列へ格納
		for (int i = 0; i < car.length; i++) {
			
			System.out.println("シリアル番号(数字)、車の色、ガソリンの量(数字)をカンマ区切りで入力して下さい。");
			
			String line = scanner.nextLine();
			
			String array[] = line.split(",",0);
			
			car[i] = new Car();
			car[i].serialNo = Integer.parseInt(array[0]);
			car[i].Color = array[1];
			car[i].gasoline = Integer.parseInt(array[2]);
		}
		
		//各車ごとガソリンを消費して走行距離、消費ガソリンを決定し、結果を表示
		for (int s = 0; s < car.length; s++) {
		
			final int distance = 300;
		
			int sum = 0;
			int i;
		
			cars.gasoline = car[s].gasoline;
			
			for(i = 0; cars.run() > -1 && distance > sum; i++) {
			
				sum = sum + cars.run();
			}
		
			System.out.println("No:" + car[s].serialNo + "　" + "色：" + car[s].Color );
			
			if(cars.run() == -1)
				System.out.println("目的地に到達できませんでした");
			else
				System.out.println("目的地にまで" + (i+1) + "時間かかりました。残りのガソリンは、" + cars.gasoline + "リットルです");
		
		}
	}
}