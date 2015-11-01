/*
2、当内部类在成员位置上，就可以被成员修饰符所修饰。
   比如，private : 将内部类在外部类中进行封装。
         static  : 内部类就具备了静态特性
		 当内部类被static修饰后，只能直接访问外部类中的static成员。出现了访问局限。

		 在外部其他类中，如何直接访问静态内部类的非静态成员呢？
		 new Outer.Inner().function();

		 在外部其他类中，如何直接访问静态内部类的静态成员呢？(直接类名访问)
		 Outer.Inner.function();

注意：1、当内部类中定义了静态成员，该类必须是静态类。
      2、当外部类中的静态方法访问内部类时，内部类也必须是静态的。（静态方法只能访问静态成员，非静态方法既可以访问静态成员也可以访问非静态成员）


当描述事物时，事物内部还有事物。该事物用内部类来描述。
因为内部事务在使用外部事物中的内容。

class Body
{
	private class Heart
	{

	}
	public void show()
	{
		new Heart();
	}
}
*/
class Outer
{
	private static int x = 3;

	static class Inner //静态内部类
	{
		static void function()  //内部类的静态成员
		{
			System.out.println("inner:"+x);
		}
	}

	class Inner2
	{
		void show()
		{
			System.out.println("inner2 show");
		}
	}
	public static void method() //外部类的静态方法
	{
		// new Inner2().show();//error 静态方法无法访问非静态成员（class Inner2）
		
	}
}

class InnerClassDemo2 
{
	public static void main(String[] args) 
	{
		new Outer.Inner().function(); //若function为非静态的。新建内部类对象 Outer.Inner()对象，调用其方法function();
		Outer.Inner.function();       //若function为静态的。  无需创建对象，静态Inner类可以直接加载静态function方法。

		Outer.method();
	}
}
