/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

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
		 

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        String[] remove = {"レアル・マドリード","バルセロナ"};
        
        
        for (String word : remove) {
        	for (int i = playerList.size() - 1; i >= 0; i--) {
        		
        		int flag = playerList.get(i).toString().indexOf(word);
        		if (flag != -1) {
        			
        			playerList.remove(i);
        		}	
        	}		
        }
        

		// ★ 削除後のArrayListの中身を全件出力してください
        for (Player str : playerList) {
        	
        	System.out.println(str.toString());
        }

	}
}
