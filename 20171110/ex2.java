/*
	���g���:2017/11/10
	�d��2:ex2.java
	�\��:DataType�������
			����J��"��"
			������;�\��
			���M�w�B�⪺�覡�P���G(��r�B�Ʀr)
			�B��Ÿ����k�ȥu�n���@�Ӭ���r�A�Y����r�s��
			
*/

class ex2
{
	public static void main(String arge[])
	{
		/*
		System.out.println("100+100");//�r��
		System.out.println(100+100);//�Ʀr�ۥ[
		System.out.println("100"+"100");//�r��s��
		System.out.println("100"+100);//�r��s��
		System.out.println(100+"100");//�r��s��
		System.out.println("100"+10+20);//�B��ѥ��ܥk�A�Ĥ@�Ӭ��r��A�G���r��s��
		System.out.println("100"+(10+20));//�B��A�������A��A���r��s��
		System.out.println(10+20+"100");//���B��A"100"���r��A�A���r��s��
		*/
		
		byte x=10; //byte�d�� ��:0~127,�t:-1~-128
		byte y=10;
		byte z=10+20;
		/*
		byte z2=x+y;  
		error: incompatible types: possible lossy conversion from int to byte
		*/
		byte z2 = (byte)(x+y);
		
	}
}