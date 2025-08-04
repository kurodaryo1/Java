package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1
		//宣言
		byte qesbyte;
		short qesshort;
		int qesint;
		long qeslong;
		float qesfloat;
		double qesdouble;
		char qeschar;
		String qesstring;
		boolean qesboolean;
		
		//2
		//初期値の代入
		qesbyte = 0;
		qesshort = 0;
		qesint = 0;
		qeslong = 0L;
		qesfloat = 0.0f;
		qesdouble = 0.0;
		qeschar = '\u0000';
		qesstring = "null";
		qesboolean = false;
		
		//3
		//代入
		qesbyte = 10;
		qesshort = 100;
		qesint = 1000;
		qeslong = 10000;
		qesfloat = 9.5f;
		qesdouble = 10.5;
		qeschar = 'a';
		qesstring = "ハロー";
		qesboolean = true;
		
		//4
		//コンソール出力
		System.out.println(qesbyte + qesshort + qesint + qeslong);
		System.out.println((int)(qesfloat + qesdouble));
		System.out.println(qeschar + " " + qesstring + " " + qesboolean);
		System.out.println((int)(qesbyte + qesshort + qesint + qeslong + qesfloat + qesdouble));
		System.out.println(qesbyte * qesshort * qesint * qeslong);
		System.out.println(qesdouble / qesshort);
		System.out.println(qesbyte - qesshort);
		
		//5
		//numのStringをintに変更
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		//6
		//宣言と代入
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		//コンソール出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		//7
		//宣言と代入
		int num2 = 100;
		
		//BMIの計算
		double BMI = weight / ((height / num2) * (height / num2));
		
		//小数点第一位まで表示
		String newBMI = String.format("%.1f", BMI);
		
		//コンソール出力
		System.out.println("BMIは" + newBMI + "です");
		
		
		//8
		//再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		
		//BMIの計算
		BMI = weight / ((height / num2) * (height / num2));
		
		//小数点第一位まで表示
		newBMI = String.format("%.1f", BMI);
		
		//コンソール出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + newBMI + "です");
		
		//9
		//自己代入
		age = age + 24;
		height = height + 168.5;
		weight = weight + 64.2;
		
		//BMIの計算
		BMI = weight / ((height / num2) * (height / num2));
				
		//小数点第二位まで表示
		newBMI = String.format("%.2f", BMI);

		//コンソール出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + newBMI + "です");
		
		//10
		//自己代入
		age = age - 24;
		
		//年齢が25歳以上の場合trueを表示
		boolean result = (age >= 25);
		
		//コンソール出力
		System.out.println(result);
		
		//11
		//数値から文字列に型変換
		String newage = String.valueOf(24);
		String newheight = String.valueOf(168.5);
		String newweight = String.valueOf(64.2);
		
		//コンソール出力
		System.out.println(newage + "・" + newheight + "・" + newweight);
		
		//12
		//文字列から数値に型変換
		age = Integer.parseInt(newage);
		height = (int)Double.parseDouble(newheight);
		
		//コンソール出力
		System.out.println(age + "・" + height);
		
		//13
		//年齢が25以上もしくは身長が160以上の場合true
		boolean result2 = (age >= 25 || height >= 160 );
		
		//コンソール出力
		System.out.println(result2);
		

		float ans = 7 / 6;
		System.out.println(ans);
		
		
		
		int a = 10;
		int b = 10;
		
		System.out.println(++a + 50);
		System.out.println(b++ + 50);
	}

}
