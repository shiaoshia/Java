/*
	���g���:2017/11/13
	�d��:ex4.java
	�\��: ���w�B��l�P���W����B��l
			�� =
			�� += , -= , *= , /= , %=
			�� ++ , --
	�\��: Relational���Y�B��l
			�� �P�_���ϥ� �� �|���� true or false
			�� > , < , >= , <= , == , !=
	�\��: ����B��l �� �h�ӧP�_���� �� �|���� true or false
			�� &&(�BAnd) , ||(��Or) , ^(��XOR) , !(�Dnot)

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
			// &&��������1==2��false,�Y��false�G�S����++i>=2,i��=1
			*/
			
			/*
			boolean result;
			int i=1;
			result=++i>=2 && 1==2;
			System.out.println("result="+result+",i="+i);
			// &&��������i=2��true�A�A���k��1==2��false�A��false
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