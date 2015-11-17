/*
泛型类。

class Demo<T t>

什么时候定义泛型类？
当类中要操作的引用数据类型不确定时，早起定义Object来完成扩展。
现在定义泛型来完成扩展。

泛型方法。（泛型定义于返回值之前）

public <T> void show(T t)

泛型类定义的泛型，在整个类中有效。如果被方法使用，
那么泛型类的对象明确要操作的具体类型后，所有要操作的类型就已经固定了。

那么为了让不同方法可以操作不同类型，而且类型还不确定。
那么可以将泛型定义在方法上。

静态泛型方法。

特殊方法：
静态方法不可以访问类上定义的泛型。
class Demo<T>
{
	public static void method(T t)
	{
		System.out.println("method:"+t);//error 无法从静态上下文中访问非静态类 T 
										//T只有在对象建立之后才能明确，并被对象调用从而运行。而Static先于对象存在。
	}
}
如果静态方法操作的应用数据类型不确定，可以将泛型定义在方法上。
class Demo<T>
{
	public static <W> void method(W t)
	{
		System.out.println("method:"+t);
	}
}

*/

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
