/*
什么时候使用静态？
要从两方面下手：
因为静态修饰的内容有：成员变量和成员函数
1、什么时候定义静态变量（类变量）呢？
当对象中出现共享属性的共享数据时（例如国籍均为中国）该数据应被静态所修饰，而对象中的特有数据要定义成非静态存在于堆内存中。
2、什么时候定义静态函数呢？
当功能内部没有访问到非静态数据（对象的特有数据），那么该功能可以定义成静态的。

*/
class WhenStatic
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.show();
	}
}
class Person
{
	String name = "yangzhi";
	public static void show()
	{
		System.out.println(name+"haha");//因为调用了非静态的name 所以此功能不能设置为static，编译失败。
	}
}