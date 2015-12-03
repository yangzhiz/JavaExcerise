/*
编写一个聊天程序。
有收数据的部分，有发数据的部分。
这两部分需要同时执行。
那就需要用到多线程技术。
一个线程控制收，一个线程控制发。

因为守鹤发动作是不一致的，所以要定义两个run方法。
而且这两个方法要封装到不同类中。
*/

class ChatDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
