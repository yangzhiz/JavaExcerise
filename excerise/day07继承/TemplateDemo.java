/*
需求：获取一段程序的运行时间
原理：获取程序开始时间和结束时间，并相减即可。

获取时间：System.currentTimeMills();

当代码完成优化后，就可以解决这类问题。

这种方式，称为模板方法设计模式
即：在定义功能是，功能的一部分是确定的，但有一部分是不确定的，而确定的部分在使用不确定的部分。
那么这时就将不确定的部分暴露出去。由该类的子类去完成。
*/

abstract class GetTime
{
	public final void getTime()  //不允许被复写
	{
		long start = System.currentTimeMillis();
		runcode(); //由于runcode被子类重写，引用的是子类的runcode()
		long end = System.currentTimeMillis();
		System.out.println("毫秒："+(end-start));
	}
	public abstract void runcode();//暴露
}

class SubTime extends GetTime
{
	public void runcode()
	{
		for (int x=0;x<1000;x++)
		{
			System.out.println(x);
		}
	}
}
class TemplateDemo 
{
	public static void main(String[] args) 
	{
		SubTime gt = new SubTime();
		gt.getTime();//引用的父类的getTime();
	}
}
