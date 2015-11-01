/*
5、多态的应用
*/

class Fu
{
	int num = 5;
	void method1()
	{
		System.out.println("fu method_1");
	}
	void method2()
	{
		System.out.println("fu method_2");
	}
	static void method4()
	{
		System.out.println("fu method_4");
	}
}

class Zi extends Fu
{
	int num = 8;
	void method1()
	{
		System.out.println("zi method_1");
	}
	void method3()
	{
		System.out.println("zi method_3");
	}
	static void method4()
	{
		System.out.println("zi method_4");
	}
}

class DuoTaiDemo4 
{
	public static void main(String[] args) 
	{

/*
		Fu f = new Zi();//多态
		f.method1();//zi method_1
		f.method2();//fu method_2
        
在多态中成员函数(非静态)的特点：
在编译时期：参阅引用型变量(f)所属的类中(Fu)是否有调用的方法。如果有，编译通过，如果没有编译失败。
在运行时期：参阅对象(new Zi())所属的类中(Zi)是否有调用的方法。

简单总结就是：
成员函数在多态调用时，编译看左边，运行看右边。
*/

/*
		Fu f = new Zi();
		System.out.println(f.num);//5

		Zi z = new Zi();
        System.out.println(z.num);//8

在多态中，成员变量的特点：（区别于成员函数）
无论编译和运行，都参考左边（引用型变量所述的类）
*/

		Fu f = new Zi();
		f.method4();//fu method_4   静态绑定 method4 是静态的，定义时已经被绑定在方法所属的类上 运行的是 Fu.method4()  存储于静态区
		Zi z = new Zi();
		z.method4();//zi method_4   动态绑定 对象是 new Zi();  运行的是 z.method4();
/*
在多态中，静态成员函数的特点：（区别于非静态成员函数）
无论编译和运行，都参考左边。
*/
	}
}
