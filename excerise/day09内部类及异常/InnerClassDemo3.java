/*
内部类定义在局部时
1、不可以被成员修饰符修饰
2、可以直接访问外部类中的成员，因为还持有外部类中的引用。
   但是不可以访问他所在的局部中的变量。只能访问被final修饰的局部变量。
*/


class Outer
{
	int x = 3;
	void method(final int a)
	{
		final int y = 4;
		class Inner
		{			
			void function()  //不能为静态，此处若为静态，则内部类Inner应为静态，而static只修饰成员。此时的Inner为局部类。
			{
				System.out.println(Outer.this.x);//3
				System.out.println(y);//4
				System.out.println(a);//7
			}
		}
		new Inner().function();
	}
}


class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		//new Outer().method();
		new Outer().method(7);//7
		new Outer().method(8);//8
	}
}
