/*
设计模式：解决某一类问题最行之有效的方法
java中有23中设计模式。
-----单例设计模式-----
解决一个类在内存中只存在一个对象。

想要保证对象唯一。
1、为了避免其他程序过多建立该类对象，先控制禁止其他程序建立该类对象。
2、还为了让其他程序可以访问到该类对象，只好在本类中自定义一个对象。
3、为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。

代码实现：
方法一：饿汉式
1、将构造函数私有化。
2、在类中创建一个本类对象。
3、提供一个方法可以获取。
方法二：懒汉式

当需要将该事物的对象保证在内存中唯一时，就将以上的三步加上即可。
*/

class Single
{
	private Single(){}//1
	private static Single s = new Single();//2
	public static Single getInstance()//3
	{
		return s;
	}
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
}
class SingleDemo 
{
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		s1.setNum(23);
		System.out.println(s2.getNum());
	}
}
