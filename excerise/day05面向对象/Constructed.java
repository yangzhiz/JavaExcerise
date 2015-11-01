/*
构造函数：函数名与类名一致；无返回值类型；无return。
作用：对对象进行初始化。

小细节：当一个类中没有定义构造函数时，系统会默认给该类加入一个空参数的构造函数。Person(){}; 否则对象是建立不出来的。
        当在类中定义了构造函数后，默认的构造函数就没有了。
*/
class Person
{
	private String name;
	private int age;

	Person()
	{
		System.out.println("person run");
	}
	Person(String n)
	{
		name = n;

	}
}
class PersonDemo2
{
	public static void main(String[] args)
	{
		Person p = new Person();//person run 对象一建立，就会调用与之对应的构造函数。
		new Person(); //person run
	}
}