/*
Exception中有一个特殊的子类异常RuntimeException （运行时异常）

1、如果在函数内容抛出该异常，函数上可以不用声明，编译一样通过。
2、如果在函数上声明了该异常，调用者可以不用进行处理。编译一样通过。

之所以不用在函数声明，是因为不需要让调用者处理。
当该异常发生，希望程序停止。因为在运行时，出现了无法继续运算的情况，希望停止程序后，
有程序员对代码进行修正。

自定义异常时，如果该异常的发生，无法再继续进行运算。
就让自定义异常继承RuntimeException。

对于异常分两种：
1、编译时被检测的异常。（此异常可被处理）
2、编译时不被检测的异常（运行时异常。RuntimeException以及子类）
*/
class FuShuException extends RuntimeException //含方法getMessage();
{
	FuShuException(String msg)
	{
		super(msg);
	}	
	
}
class Demo
{
	int div(int a,int b)
	{
		if (b<0)
		    throw new FuShuException("出现了除数是负数的情况");
		return a/b;
	}
}
class ExceptionDemo4 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		int x = d.div(4,-9);
		System.out.println("x="+x);
		System.out.println("over");
	}
}
