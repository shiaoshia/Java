/*
	撰寫日期:2017/11/13
	範例:ex4.java
	功能: 指定運算子與遞增遞減運算子
			→ =
			→ += , -= , *= , /= , %=
			→ ++ , --
	功能: Relational關係運算子
			→ 判斷式使用 → 會產生 true or false
			→ > , < , >= , <= , == , !=
	功能: 條件運算子 → 多個判斷條件 → 會產生 true or false
			→ &&(且And) , ||(或Or) , ^(或XOR) , !(非not)

*/
class ex4
{
	public static void main(String args[])
	{
			/*
			boolean result;
			int i=1;
			result=1==2 && ++i>=2;
			System.out.println("result="+result+",i="+i);
			// &&先做左邊1==2為false,即為false故沒執行++i>=2,i仍=1
			*/
			
			/*
			boolean result;
			int i=1;
			result=++i>=2 && 1==2;
			System.out.println("result="+result+",i="+i);
			// &&先做左邊i=2為true，再做右邊1==2為false，為false
			*/

			/*
			int chi=65;
			int eng=75;
			
			System.out.println("che>=60 && eng>=75-->"+(chi>=60 && eng>=75));
			// che>=60 && eng>=75-->true
			System.out.println("che>=60 || eng>=75-->"+(chi>=60 || eng>=75));
			// che>=60 && eng>=75-->true
			System.out.println("che>=60 ^ eng>=75-->"+(chi>=60 ^ eng>=75));
			// che>=60 ^ eng>=75-->false
			System.out.println("!(che>=60 && eng>=75)-->"+!(chi>=60 && eng>=75));
			// !(che>=60 && eng>=75)-->false
			System.out.println("che>=60 ^ eng>=75-->"+(!(chi>=60) ^ eng>=75));
			// !(che>=60) ^ eng>=75-->true
			*/
			/*
			System.out.println("che>60----->"+(chi>60)); //che>60----->true
			System.out.println("che<60----->"+(chi<60)); //che<60----->false
			System.out.println("che>=60----->"+(chi>=60)); //che>=60----->true
			System.out.println("che==60----->"+(chi==60)); //che==60----->false
			System.out.println("che<=60----->"+(chi<=60)); //che<=60----->false
			*/
			
			/*
			int x=10;
			int y;
						
			x++;
			y=x;
			System.out.println("x="+x); //x=11;
			System.out.println("y="+y); //y=11;
			*/
			
			/*
			++x;
			y=x;
			System.out.println("x="+x); //x=11;
			System.out.println("y="+y); //y=11;
			*/
			
			/*
			y=++x; //x=x+1; y=x;
			System.out.println("x="+x); //x=11;
			System.out.println("y="+y); //y=11;
			*/
			
			/*
			y=x++;  //y=x; x=x+1;
			System.out.println("x="+x); //x=11;
			System.out.println("y="+y); //y=10;
			*/
			
			/*
			int x=10;
			x=x+1;
			System.out.println("x="+x); // x=11
			x+=1;
			System.out.println("x="+x); // x=12
			x++;
			System.out.println("x="+x); // x=13
			++x;
			System.out.println("x="+x); // x=14
			x=x-1;
			System.out.println("x="+x); // x=13
			x-=1;
			System.out.println("x="+x); // x=12
			x--;
			System.out.println("x="+x); // x=11
			--x;
			System.out.println("x="+x); // x=10
			*/
	}
}