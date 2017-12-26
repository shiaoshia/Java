/*
	撰寫日期:2017/11/13
	範例:ex2.java
	功能:datatype
		 double > float > long > int > short > byte
	
*/
class ex2
{
	public static void main(String args[])
	{
		
		System.out.println("x\"\\");
		/*
			輸出x"\
		*/
		
		char a='\'';
		/*
			a='
		*/
		
		System.out.println("abc\nd\teee");
		/*
			輸出:
			abc
			d	eee三
		*/
		
		//int x = (int)(10+23.6);
		//int x2 = 10 + (int)10.9;
		//int x3 = 20+(int)20.7f;
		
		//System.out.println(10/3);
		/*
			10為int,3為int,int除int=int
			結果印出3
		*/
		
		System.out.println(10/3.f);
		/*
			10為int,3.為float,int除float=float
			印出結果為3.3333333
		*/
		
		//int X = 10;
		/*
			英文大小寫X與x為不同變數，故可以編釋成功
		*/
		
		//int static = 52;
		/*
			error: illegal start of expression
			static不行當變數
		*/
		
		int $abc = 20;
		int _abc = 52;
		int Lesson_One = 10;
		int LessOne = 10;
		/*
			$與_可為變數任意位置
		*/
		
		//int Lesson Two=30;
		/*
			error: ';' expected
			變數中間不能空隔
		*/
		
		int 國文 = 65;
		System.out.println("國文=" + 國文);
		/*
			變數可以為中文，輸出為"國文=65"
		*/
		
		//int x=10.0;
		/*
			error: incompatible types: possible lossy conversion from double to int
			datatype不一致,浮點預設為double
		*/
		// long x = 10.0;
		// long x = 10.0f;
		/*
			=左邊位階要比右邊位階大
			double > float > long > int > short > byte
		*/
		
		//long x = 10;
		//float y = x;
		/*
			float > long所以可以
		*/
	
		//int x;
		/*
			call by reference過，所以可以編譯
		*/
		
		//System.out.println("x="+x);
		/*
			error: variable x might not have been initialized
			call by value不過, 因為x未指定值，未初始化，所以編譯不過
		*/
		
		//int x = 10;
		//int x = (int)10.6;
				/*
			casting(轉換) int為無條件捨去小數值
			輸出x=10
		*/
		
		//char x = "a";
		/*
			error: incompatible types: String cannot be converted to char
			String"a"無法指定給char
		*/
		
		//char x = 'a';
		/*
			用單引號表示字元
		*/
		
		//char x = '17';
		/*
			error: unclosed character literal
			char只能放入一個字
		*/
		
		//char x = 97;
		/*
			char 97為ASCII表的a
		*/
		
		//String x = "1342adfadfag";
		/*
			 error: cannot find symbol
			 S要大寫
		*/
		//boolean x = true; //false
		
		
		//System.out.println("x=" + x);
		
	}
}