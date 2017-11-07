/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		
		ArrayList<Player> playerList = new ArrayList<Player>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
        	for (int i = 0; scanner.hasNext(); i++) {
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
                String[] str = line.split(",", 0);
                
                Player player = new Player();
                
                player.setPosition(str[0]);
                player.setName(str[1]);
                player.setCountry(str[2]);
                player.setTeam(str[3]);
   
                playerList.add(player);
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        String[] position = {"GK","DF","MF","FW"}; 
        
        ArrayList[] array = new ArrayList[4]; 
        int count = 0;
        
        //各ポジションごとに配列を取得
        for (String word : position) {
        		
        	array[count] = new ArrayList();
        	for (Player list : playerList) {
        		
        		int flag = list.toString().indexOf(word);
        			
        		if (flag != -1) {
        			array[count].add(list.toString());
        				 
        		}
        	}
        	
        	count++;
        }
        //各ポジションごとリストの順序をランダムに並べ替え
     
        for (ArrayList shuffle : array) {
        	
        	Collections.shuffle(shuffle);
        }
        //各ポジションのリストの上から指定の人数呼び出し
        
        System.out.println(array[0].get(0)); //GK 1人
        
        for (int i = 0; i < 4; i++) {		//DF 4人
        	
        	System.out.println(array[1].get(i));
        }
        
        for (int i = 0; i < 4; i++) {		//MF 4人
        	
        	System.out.println(array[2].get(i));
        }
        
        for (int i = 0; i < 2; i++) {		//FW 2人
        	
        	System.out.println(array[3].get(i));
        }
	}
}
