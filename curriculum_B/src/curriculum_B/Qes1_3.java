package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		
		
		Scanner scanner = new Scanner(System.in);
	        
	       String userName = scanner.nextLine();
	        
	        //ユーザー名を入力する
	        //入力された文字数による処理
	    	do
	    		
	        {
	    		
	    		    //文字数が0文字以下もしくはnullの場合
	        		if( userName == null || userName.length() == 0 ) 
	        			
	        		{
	        			
	        	System.out.print("「ユーザー名を入力してください」 ");
	        	
	        	scanner = new Scanner(System.in);
	        	userName = scanner.nextLine();
	        
	            }
	        	
	        	//文字数が10文字より大きい場合
	        	else if(userName.length() > 10) 
	        		
	        	{
	        	
	        	System.out.print("「名前を10文字以内にしてください」");

                
	        	scanner = new Scanner(System.in);
	        	userName = scanner.nextLine();
	        	
	            }
	        	
	        	//半角英数字以外の場合
	        	else if( !userName.matches("[0-9a-zA-Z]*"))
	        		
	        	{
	        		System.out.print("「半角英数字のみで名前を入力してください」");
	        		 
	        		scanner = new Scanner(System.in);
		        	userName = scanner.nextLine();
		        	
	        	}
	        		
	        }
	    	
	        	while(userName.length() > 10 || userName.length() == 0 || userName == null  || !userName.matches("[0-9a-zA-Z]*"));
	       
	         	//正常な値だった場合
	        	if(userName.length() > 0 && userName.length() <=10 && userName.matches("[0-9a-zA-Z]*")) 
	        	
	        	{
	        	
	        		System.out.println("入力されたユーザー名: " + "「" + userName + "」");
	      
	            }  
	        	
	        	//3
	        	
	        	  Random random = new Random();
	              int roundCount = 0;

	              while (true) {
	                  System.out.print("じゃんけんをしましょう (0:グー, 1:チョキ, 2:パー) → ");
	                  int playerHand;
	                  try 
	                  {
	                	  
	                      playerHand = Integer.parseInt(scanner.nextLine());
	                      
	                  }
	                  
	                  catch (NumberFormatException e) 
	                  
	                  {
	                	  
	                      System.out.println("0～2の数字で入力してください");
	                      System.out.println();
	                      continue;
	                      
	                  }

	                  if (playerHand < 0 || playerHand > 2) 
	                  {
	                	  
	                      System.out.println("0～2の数字で入力してください");
	                      System.out.println();
	                      continue;
	                      
	                  }

	                  int enemyHand = random.nextInt(3);
	                  roundCount++;

	                  // 手の名前
	                  String[] hands = {"グー", "チョキ", "パー"};

	                  // 出力
	                  System.out.println(userName + "の手は「" + hands[playerHand] + "」");
	                  System.out.println("相手の手は「" + hands[enemyHand] + "」");

	                  // 勝敗判定
	                  if (playerHand == enemyHand) {
	                      System.out.println("DRAW あいこ もう一回しましょう！");
	                      System.out.println();
	                      continue;
	                  }

	                  boolean playerWin =
	                          (playerHand == 0 && enemyHand == 1) ||
	                          (playerHand == 1 && enemyHand == 2) ||
	                          (playerHand == 2 && enemyHand == 0);
	                  
	                  //買った場合
	                  if (playerWin)
	                  
	                  {
	                	  
	                      System.out.println("やるやん。");
	                      System.out.println("次は俺にリベンジさせて");
	                      System.out.println("勝つまでにかかった合計回数は" + roundCount + "回です");
	                      break;
	                      
	                  } 
	                  
	                  //負けた場合
	                  else 
	                	  
	                  {
	                      System.out.println("俺の勝ち！");
	                      
	                      if (enemyHand == 0)
	                    	  
	                      { 
	                    	  // 相手グー
	                          System.out.println("負けは次につながるチャンスです！");
	                          System.out.println("ネバーギブアップ！");
	                          
	                      } 
	                      
	                      else if (enemyHand == 1) 
	                    	  
	                      {
	                    	  // 相手チョキ
	                          System.out.println("たかがじゃんけん、そう思ってないですか？");
	                          System.out.println("それやったら次も、俺が勝ちますよ");
	                          
	                      } 
	                      
	                      else 
	                      
	                      { 
	                    	  // 相手パー
	                          System.out.println("なんで負けたか、明日まで考えといてください。");
	                          System.out.println("そしたら何かが見えてくるはずです");
	                          
	                      }
	                      
	                      
	                  }
	              }
	              
	              //改行
	              System.out.println();

	        
	        
	        //4
	        
	        int [][] kuku = new int[9][9];
	        
	        
	        int num1;
	        int num2;
	     
	        //縦の行
	        for(num2 = 0; num2 < 9; num2++) 
	        
	        { 
	        	  //横の行
	        	  for(num1 = 0; num1 < 9; num1++)
	        	  
	        	  { 
	        	  
	        	 
	        	  
	        	  kuku[num1][num2] = (num1 + 1) * (num2 + 1);
	        	  
	        	  if (num1 < 8) 
	        	  
	        	  {
	        		  
	                  System.out.printf("%02d * %02d = %02d || ", (num1 + 1), (num2 + 1), kuku[num1][num2]);
	              }
	        	  
	        	  else 
	        		  
	              {
	        		  
	                  System.out.printf("%02d * %02d = %02d", (num1 + 1), (num2 + 1), kuku[num1][num2]);
	                  
	              }
	        	  
	        	  } 
	        	  
	        	  System.out.println();
	        	  System.out.println();
	        }
	        
	        //改行
	        System.out.println();
	        
	        	  //5
	        	  
	        	  int [][] kuku2 = new int[20][20];
	  	        
	  	        
	  	        int num3;
	  	        int num4;
	  	     
	  	        //縦の行
	  	        for(num4 = 0; num4 < 20; num4++) 
	  	        
	  	        { 
	  	        	  //横の行
	  	        	  for(num3 = 0; num3 < 20; num3++)
	  	        	  
	  	        	  { 
	  	        	  
	  	        	 
	  	        	  
	  	        	  kuku2[num3][num4] = (num3 + 1) * (num4 + 1);
	  	        	  
	  	        	  if (num3 < 19) 
	  	        	 
	  	        	  {
	  	                  
	  	        		  System.out.printf("%03d * %03d = %03d || ", (num3 + 1), (num4 + 1), kuku2[num3][num4]);
	  	             
	  	        	  } 
	  	        	  
	  	        	  else 
	  	        	  
	  	        	  {
	  	                  System.out.printf("%03d * %03d = %03d", (num3 + 1), (num4 + 1), kuku2[num3][num4]);
	  	              }
	  	        	  
	  	        	  }
	  	        	  
	  	        	  System.out.println();
		        	  System.out.println();
	  	        }
	  	        
	  	        //改行
		        System.out.println();
		        	  
		        	  //6
		        	  
		        	  scanner = new Scanner(System.in);
		              Random random2 = new Random();

		              // 入力受付
		              System.out.print("商品名を入力してください（「、」区切りで複数指定可）: ");
		              String input = scanner.nextLine();

		              // 「、」で区切る
		              String[] inputs = input.split("、");

		              // 拡張for文
		              for (String item : inputs) 
		              {
		            	  // 前後の空白を除去
		                  item = item.trim();

		                  switch (item) {
		                      case "テレビ":
		                      case "ディスプレイ":
		                         
		                    	  // 条件演算子で出力値を切り替える
		                    	  
		                          int stock = item.equals("ディスプレイ")
		                          
		                        		  // ディスプレイは「11 - ランダム」
		                                  ? 11 - random2.nextInt(12)
		                                	
		                                  // テレビは「0〜11のランダム」
		                                  : random2.nextInt(12);
		                          
		                          System.out.println(item + "の残り台数は" + stock + "台です");
		                          break;

		                      case "パソコン":
		                      case "スマホ":
		                      case "タブレット":
		                    	  
		                          // 他の商品も 0〜11 のランダム
		                          System.out.println(item + "の残り台数は" + random2.nextInt(12) + "台です");
		                          break;

		                      default:
		                    	  
		                          // 指定外の商品が入力される
		                          System.out.println("『" + item + "』は指定の商品ではありません。");
		                  }
		              }
		              
		            //改行
				    System.out.println();
				    
				    //7
				        
		              scanner = new Scanner(System.in);

		              int n; // 生徒数
		              do 
		              {
		            	  
		                  System.out.print("生徒の人数を入力してください（1以上）: ");
		                  
		                  n = scanner.nextInt();
		                  
		              }
		           // 必ず1回以上実行 & 正の人数を保証
		              while (n <= 0); 
		              
		              // [生徒][科目] 0:英語,1:数学,2:理科,3:社会
		              int[][] scores = new int[n][4];
		              String[] subjects = {"英語", "数学", "理科", "社会"};

		              // 入力
		              for (int i = 0; i < n; i++)
		              {
		                  System.out.println("\n--- 生徒 " + (i + 1) + " の成績を入力してください ---");
		                  
		                  for (int j = 0; j < 4; j++)
		                  
		                  {
		                      System.out.print(subjects[j] + "の点数: ");
		                      scores[i][j] = scanner.nextInt();
		                      
		                  }
		              }

		              // 出力
		              System.out.println("\n=== 成績一覧 ===");
		              for (int i = 0; i < n; i++) 
		              {
		                  int sum = 0;
		                  System.out.print("生徒 " + (i + 1) + " → ");
		                  
		                  for (int j = 0; j < 4; j++)
		                  
		                  {
		                	  
		                      System.out.print(subjects[j] + ":" + scores[i][j] + " ");
		                      sum += scores[i][j];
		                      
		                  }
		                  
		                  double avg = sum / 4.0;
		                  System.out.printf(" | 合計:%d 平均:%.2f%n", sum, avg);
		                  
		              }

		              scanner.close();
	  	        	  
	  	        	  
	        
	
		}  	
	}


