/*
	finally����飺����һ����ִ�еĴ���顣
	ͨ�������ͷ���Դ��
*/
class FuShuException extends Exception 
{
	FuShuException(String msg)
	{
		super(msg);
	}	
	
}
class Demo
{
	int div(int a,int b) throws FuShuException
	{
		if (b<0)
		    throw new FuShuException("�����˳����Ǹ��������");
		return a/b;
	}
}
class ExceptionDemo5 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,-9);
		    System.out.println("x="+x);
		}
		catch (FuShuException e)
		{
			System.out.println(e.toString());
			//return; //finally��ִ�У�����over������ִ�У�returnֱ�ӽ�����������
			//System.exit(0);//ϵͳ�˳���JVM������finallyҲ����ִ�С�
		}
		finally
		{
			System.out.println("finally");//finally�д�ŵ���һ���ᱻִ�еĴ���	
		}
		
		System.out.println("over");
	}
}
