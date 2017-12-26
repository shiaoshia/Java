/*
	撰寫日期:2017/11/10
	範例2:ex2.java
	功能:DataType資料類型
			→輸入的"值"
			→做用;功能
			→決定運算的方式與結果(文字、數字)
			運算符號左右值只要有一個為文字，即為文字連接
			
*/

class ex2
{
	public static void main(String arge[])
	{
		/*
		System.out.println("100+100");//字串
		System.out.println(100+100);//數字相加
		System.out.println("100"+"100");//字串連接
		System.out.println("100"+100);//字串連接
		System.out.println(100+"100");//字串連接
		System.out.println("100"+10+20);//運算由左至右，第一個為字串，故為字串連接
		System.out.println("100"+(10+20));//運算括弧先做，後再做字串連接
		System.out.println(10+20+"100");//先運算，"100"為字串，再做字串連接
		*/
		
		byte x=10; //byte範圍 正:0~127,負:-1~-128
		byte y=10;
		byte z=10+20;
		/*
		byte z2=x+y;  
		error: incompatible types: possible lossy conversion from int to byte
		*/
		byte z2 = (byte)(x+y);
		
	}
}