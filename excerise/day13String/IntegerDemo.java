/*
�����������Ͷ����װ��.

byte		Byte
short		Short
int			Integer
long		Long
boolean		Boolean
float		Float
double		Double
char		Character

�����������Ͷ����װ����������
�������ڻ����������ͺ��ַ�������֮����ת��

������������--->�ַ���

    1�� ������������+"" ;

	2�� �����������Ͱ�װ��.toString(������������ֵ); //Integer.toString(34);

�ַ���---->�����������ͣ���̬���÷�ʽ��

	�����������Ͱ�װ��.parse������������(�ַ���)��//Integer.parseInt("34"); �ַ������봫�����ָ�ʽ���ַ�������a34�ᱨ������ָ������Ϊʮ�����ơ�
		���⣺Character������Ҫ�˹��ܡ�


ʮ����ת���������ƣ�

   toBinaryString();
   toHexString();
   toOctalString();

��������תΪʮ���ƣ�

	Integer.parseInt(String s, int radix); //Integer.parseInt("110",2) �����ַ����Լ���ǰ�ַ����Ľ��Ʊ�����ʽ�����ʮ���ơ�  




JDK1.5 �汾�����ԣ�

	Integer x = 4;//�Զ�װ�� ��ͬ�� new Integer(4);  Ŀ���Ǽ���д
				  // Integer x = null;  ��    int x = null;  x
	x = x + 2;    // x+2�е�x��ʾ���������Ƚ����Զ����䣨intValue()�������int��Ȼ���2���                    �����װ�丳��x��  

����     Integer m = 128;
		 Integer n = 128;

		 Integer a = 127;
		 Integer b = 127;

		 System.out.println(m==n);//false

		 System.out.println(a==b);//true a,bָ��ͬһ��Integer����127��

		 ����������ֵ��byte��Χ��ʱ��-128~127�������������ԣ��������ֵ�Ѿ����ڣ��򲻻Ὺ���µĿռ䡣
		       ���a,bָ����ͬһ��127�� ��m,n��ͬ��



*/








class IntegerDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
