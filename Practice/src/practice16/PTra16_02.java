/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		
		Boolean bW = b;
		Byte byW = by;
		Short sW = s;
		Character cW = c;
		Integer iW = i;
		Long lW = l;
		Float fW = f;
		Double dW = d;
		
		System.out.println(bW);
		System.out.println(byW);
		System.out.println(sW);
		System.out.println(cW);
		System.out.println(iW);
		System.out.println(lW);
		System.out.println(fW);
		System.out.println(dW);
	}
}
