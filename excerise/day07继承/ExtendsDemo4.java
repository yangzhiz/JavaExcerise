/*
3、构造函数

在对子类对象进行初始化时，父类的构造函数也会运行，因为子类的构造函数的第一行会有一条隐式的语句：super();
而且子类中所有的构造函数默认第一行都是super(); （父类也有super(); 访问的是Java中最大的父类 Object）

为什么子类一定要访问父类中的构造函数

因为父类中的数据子类可以直接获取，所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化的
所以子类在对象初始化时要先访问父类的构造函数。
如果要访问父类中指定的构造函数，可以通过手动定义super语句的方式来指定。
super语句一定放在子类构造函数的第一行。且与this选择其一。


子类的实例化过程
结论：子类所有的构造函数默认都会访问父类中空参数的构造函数。
      因为每一个构造函数内的第一行都有一句隐式的super();
	  当父类中没有空参数的构造函数时，子类必须通过super语句的形式来指定要访问父类中的构造函数。
	  当然：子类中的第一行也可以手动执行this语句来访问本类中的构造函数，子类中至少会有一个构造函数会访问父类中的构造函数。
*/

class Father
{
	Father()
	{
		System.out.println("father run");
	}
	Father(int x)
	{
		System.out.println("father run"+x);
	}
}

class Son extends Father
{
	Son()
	{
		//super(); 在继承父类之后，此处有虚拟机添加的隐式语句。
		System.out.println("son run");
	}
	Son(int x)
	{
		super(4);//指定访问父类中的构造函数
		System.out.println("son run"+x);
	}
}
class ExtendsDemo4
{
	public static void main(String[] args) 
	{
		Son s = new Son();// father run    son run 
		Son s1 = new Son(4);//father run4  son run4
	}
}
