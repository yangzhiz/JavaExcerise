/*
��һ����ʽ��
try
{	
}
catch ()
{
}

�ڶ��ָ�ʽ��
try
{	
}
catch ()
{
}
finally
{}

�����ָ�ʽ��
try
{	
}
finally
{
}
*/

class Demo
{
	public void method()
	{
		try
		{
			throw new Exception();
		}
		finally
		{
			//�ر���Դ
		}
//��סһ�㣺catch�����ڴ����쳣�����û��catch�ʹ����쳣û�б��������������쳣�Ǽ��ʱ�쳣����ô����������
		
	}
}
class  ExceptionDemo6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
