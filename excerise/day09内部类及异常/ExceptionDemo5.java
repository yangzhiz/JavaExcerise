/*
	finally代码块：定义一定会执行的代码块。
	通常用于释放资源。
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
		    throw new FuShuException("出现了除数是负数的情况");
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
			//return; //finally会执行，但是over将不会执行，return直接结束主函数。
			//System.exit(0);//系统退出。JVM结束。finally也不会执行。
		}
		finally
		{
			System.out.println("finally");//finally中存放的是一定会被执行的代码	
		}
		
		System.out.println("over");
	}
}
