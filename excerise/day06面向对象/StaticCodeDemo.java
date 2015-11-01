/*
静态代码块。
格式：
static      //注意小些
{
	执行语句。
}
特点：随着类的加载而执行，且只执行一次。并且优先于主函数执行。
用于给类进行初始化。
*/

class StaticCode
{
	static
	{
		System.out.println("a");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}
class StaticCodeDemo 
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new StaticCode();
		new StaticCode();       //不再输出a,因为StaticCode类已经在内存中了。
		System.out.println("over");
		StaticCode.show();
		StaticCode s = null;    //并没有用到类中的内容，所以不会被加载。不会输出a.
		new StaticCode1(5);     // a c26 d
	}
	static
	{
		System.out.println("c");
	}
}

class StaticCode1
{
	int num = 26;
	StaticCode1()
	{
		System.out.println("b");//该构造函数并不会执行初始化动作
	}
	static
	{
		System.out.println("a");//静态代码块给类初始化，此处不能访问num,num为非静态，不能由静态调用。
	}
	{
		System.out.println("c"+this.num);//构造代码块，给对象初始化。在显式初始化之后执行，显式初始化在系统默认初始化之后执行
	}
	StaticCode1(int x)         //构造函数给对应对象初始化
	{
		System.out.println("d");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}

