/*
内部类的访问规则：
1、内部类可以直接访问外部类中的成员，包括私有。
   之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，格式：  外部类名.this
2、外部类要访问内部类，必须建立内部类对象。

访问格式：
1、当内部类定义在外部类的成员位置上，且非私有，可以在外部其他类中直接建立内部类对象。
格式: 外部类名.内部类名 变量名 = 外部类对象.内部类对象;
Outer.Inner in = new Outer().new Inner();

*/

class Outer
{
	private int x = 3;

	class Inner //内部类
	{
		int x = 4;
		void function()
		{
			//int x = 6;
			System.out.println("inner:"+x);//6  如果方法中没有定义 x = 6;则打印的是 x = 4; 此处的x省略了 this.
										   //如果内部类中没有定义 x = 4; 则打印的是 x = 3; 此处的x省略了 Outer.this  打印的优先级是由内向外的。
			System.out.println("inner:"+this.x);//4
			System.out.println("inner:"+Outer.this.x);//3  用Outer来标识是外部类的x
		}
	}

	void method()
	{
		Inner in = new Inner();
		in.function();
	}
}

class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		//Outer out = new Outer();
		//out.method(); inner:3

		/*直接访问内部类*/
		Outer.Inner in = new Outer().new Inner();//格式
		in.function();
	}
}
