/*
	���g���:2017/11/13
	�d��:ex2.java
	�\��:datatype
		 double > float > long > int > short > byte
	
*/
class ex2
{
	public static void main(String args[])
	{
		
		System.out.println("x\"\\");
		/*
			��Xx"\
		*/
		
		char a='\'';
		/*
			a='
		*/
		
		System.out.println("abc\nd\teee");
		/*
			��X:
			abc
			d	eee�T
		*/
		
		//int x = (int)(10+23.6);
		//int x2 = 10 + (int)10.9;
		//int x3 = 20+(int)20.7f;
		
		//System.out.println(10/3);
		/*
			10��int,3��int,int��int=int
			���G�L�X3
		*/
		
		System.out.println(10/3.f);
		/*
			10��int,3.��float,int��float=float
			�L�X���G��3.3333333
		*/
		
		//int X = 10;
		/*
			�^��j�p�gX�Px�����P�ܼơA�G�i�H�s�����\
		*/
		
		//int static = 52;
		/*
			error: illegal start of expression
			static������ܼ�
		*/
		
		int $abc = 20;
		int _abc = 52;
		int Lesson_One = 10;
		int LessOne = 10;
		/*
			$�P_�i���ܼƥ��N��m
		*/
		
		//int Lesson Two=30;
		/*
			error: ';' expected
			�ܼƤ�������Źj
		*/
		
		int ��� = 65;
		System.out.println("���=" + ���);
		/*
			�ܼƥi�H������A��X��"���=65"
		*/
		
		//int x=10.0;
		/*
			error: incompatible types: possible lossy conversion from double to int
			datatype���@�P,�B�I�w�]��double
		*/
		// long x = 10.0;
		// long x = 10.0f;
		/*
			=����춥�n��k��춥�j
			double > float > long > int > short > byte
		*/
		
		//long x = 10;
		//float y = x;
		/*
			float > long�ҥH�i�H
		*/
	
		//int x;
		/*
			call by reference�L�A�ҥH�i�H�sĶ
		*/
		
		//System.out.println("x="+x);
		/*
			error: variable x might not have been initialized
			call by value���L, �]��x�����w�ȡA����l�ơA�ҥH�sĶ���L
		*/
		
		//int x = 10;
		//int x = (int)10.6;
				/*
			casting(�ഫ) int���L����˥h�p�ƭ�
			��Xx=10
		*/
		
		//char x = "a";
		/*
			error: incompatible types: String cannot be converted to char
			String"a"�L�k���w��char
		*/
		
		//char x = 'a';
		/*
			�γ�޸���ܦr��
		*/
		
		//char x = '17';
		/*
			error: unclosed character literal
			char�u���J�@�Ӧr
		*/
		
		//char x = 97;
		/*
			char 97��ASCII��a
		*/
		
		//String x = "1342adfadfag";
		/*
			 error: cannot find symbol
			 S�n�j�g
		*/
		//boolean x = true; //false
		
		
		//System.out.println("x=" + x);
		
	}
}