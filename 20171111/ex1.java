/*
	撰寫日期:2017/11/13
	範例2:ex1.java
	功能:DataType資料類型
*/
class ex1
{
	public static void main(String args[])
	{
		//x = 10;
		/*
			error: cannot find symbol
			未定義類型
		*/
		//byte x = 200;
		/*  
		    error: incompatible types: possible lossy conversion from int to byte
			右邊數字0~9初始值為int類型, 接著看該數字是否符合byte,
			如符合則變成byte,
			如不符合則仍為int,
			此錯誤非晉升
		*/
		
		
		//byte x = 10;
		//byte y = 20;
		//byte z = 10 + 20;
		//byte z2 = x + y;
		/*
			error: incompatible types: possible lossy conversion from int to byte
			先call by reference再call by value,
			java在效能與資料正確性以資料正確性為主
			只有java在變數(byte)加變數(byte)時有可能會超過byte,故會promotion(晉升)為int
		*/
		
		//byte z2 = (byte)(x+y);
		/*
			此為casting(轉換),將x+y定義為byte
		*/
		
		//short x = 10;
		//short y = 20;
		//short z = 10 + 20;
		//short z2 = x + y;
		/*
			error: incompatible types: possible lossy conversion from int to short
			只有java在變數(short)加(short)時有可能會超過short,故會promotion(晉升)為int
		*/
		
		//short z2 = (short)(x+y);
		/*
			此為casting(轉換),將x+y定義為short
		*/		
		
		//short z3 = (byte) (x+y);
		/*
			此為casting(轉換),將x+y定義為byte
		*/		

		//float x = 10.2;
		/*
			error: incompatible types: possible lossy conversion from double to float
			浮點數預設為double
		*/
		
		float x = 10.2f;
		float y = 10.2F;
		float z = (float)10.2;
		/*
			設定數值為浮點數f,F,(float)
		*/
		
		System.out.println("Hello");
	}
}
