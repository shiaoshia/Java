/*
	���g���:2017/11/13
	�d��2:ex1.java
	�\��:DataType�������
*/
class ex1
{
	public static void main(String args[])
	{
		//x = 10;
		/*
			error: cannot find symbol
			���w�q����
		*/
		//byte x = 200;
		/*  
		    error: incompatible types: possible lossy conversion from int to byte
			�k��Ʀr0~9��l�Ȭ�int����, ���۬ݸӼƦr�O�_�ŦXbyte,
			�p�ŦX�h�ܦ�byte,
			�p���ŦX�h����int,
			�����~�D�ʤ�
		*/
		
		
		//byte x = 10;
		//byte y = 20;
		//byte z = 10 + 20;
		//byte z2 = x + y;
		/*
			error: incompatible types: possible lossy conversion from int to byte
			��call by reference�Acall by value,
			java�b�į�P��ƥ��T�ʥH��ƥ��T�ʬ��D
			�u��java�b�ܼ�(byte)�[�ܼ�(byte)�ɦ��i��|�W�Lbyte,�G�|promotion(�ʤ�)��int
		*/
		
		//byte z2 = (byte)(x+y);
		/*
			����casting(�ഫ),�Nx+y�w�q��byte
		*/
		
		//short x = 10;
		//short y = 20;
		//short z = 10 + 20;
		//short z2 = x + y;
		/*
			error: incompatible types: possible lossy conversion from int to short
			�u��java�b�ܼ�(short)�[(short)�ɦ��i��|�W�Lshort,�G�|promotion(�ʤ�)��int
		*/
		
		//short z2 = (short)(x+y);
		/*
			����casting(�ഫ),�Nx+y�w�q��short
		*/		
		
		//short z3 = (byte) (x+y);
		/*
			����casting(�ഫ),�Nx+y�w�q��byte
		*/		

		//float x = 10.2;
		/*
			error: incompatible types: possible lossy conversion from double to float
			�B�I�ƹw�]��double
		*/
		
		float x = 10.2f;
		float y = 10.2F;
		float z = (float)10.2;
		/*
			�]�w�ƭȬ��B�I��f,F,(float)
		*/
		
		System.out.println("Hello");
	}
}
