/*
	撰寫日期:2017/11/13
	範例:ex3.java
	功能:Operator運算子;元;符號
	(一)算術運算子
		+,-,*,/,%(餘數)
*/

class ex3
{
	public static void main(String args[])
	{
		int Chinese = 98;
		//Chinese=Chinese+10;
		Chinese+=10;
		System.out.println("Chinese="+Chinese); //Chinese=108
		Chinese-=10;
		System.out.println("Chinese="+Chinese); //Chinese=98
		Chinese*=10;
		System.out.println("Chinese="+Chinese); //Chinese=980
		Chinese/=100;
		System.out.println("Chinese="+Chinese); //Chinese=9
		Chinese%=10;
		System.out.println("Chinese="+Chinese); //Chinese=8
		
		/*
		int x = 10;
		int y = 3;
		
		x = x + 20; // x=30
		System.out.println("x"+x); // x30
		
		x=x-20;
		System.out.println("x+y="+(x+y));  	// x+y=13
		System.out.println("x-y="+(x-y));	// x-y=7
		System.out.println("x*y="+(x*y));	// x*y=30
		System.out.println("x/y="+(x/y));	// x/y=3
		System.out.println("x%y="+(x%y));	// x%y=1
		System.out.println("x/y="+(float)(x/y));	// x/y=3.0
		System.out.println("x/y="+((float)x/y));	// x/y=3.3333333
		*/
			
		
	}
}