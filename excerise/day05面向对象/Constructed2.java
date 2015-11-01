/*
何时定义构造函数？
当分析事物时，该事物具备一些特性或行为，那么将这些内容定义在构造函数中。

注意:构造函数之间的调用不再是直接写函数名称，而是用this语句代替。this(实参);  而且一般函数是不能调用this语句的，即一般函数是不能调用构造函数的。只能用于构造函数间。
而且：this语句只能定义在构造函数的第一行。即先执行别的构造函数的初始化，再执行自己的初始化
*/

class Person
{
	private String name;
	private int age;
    /*
	定义三个构造函数
	*/
	Person()
	{
		System.out.println("A:name="+name+",,age="+age);
		cry();
	}
	Person(String n) //构造时就赋予了姓名
	{
		name = n;
		System.out.println("B:name="+name+",,age="+age);
		cry();
	}

	public void setName(String n) //设置姓名
	{
		name = n;
	}
	public String getName()  //获取姓名
	{
		return name;
	}

	Person(String n,int a) //构造时就赋予了姓名和年龄
	{
		name = n;
		age = a;
		System.out.println("C:name="+name+",,age="+age);
		cry();
	}
	public void cry()
	{
		System.out.println("cry");
	}
}
class PersonDemo3
{
	public static void main(String[] args)
	{
		Person p1 = new Person();//A:name=null,,age=0 cry  对象一建立，就会调用与之对应的构造函数。
		p1.cry();//cry 构造函数和一般函数在写法上有不同。在运行上也有不同。 构造函数是对象一建立就运行。给对象初始化。
		p1.cry();//cry 而一般方法是对象调用才执行，是给对象添加对象具备的功能。
		p1.cry();//cry 一个对象建立，构造函数只运行一次。而一般方法可以被对象调用多次。
		Person p2 = new Person("yang");//B:name=yang,,age=0 cry
		p2.setName("young");  //set/get方法的目的是修改一个person对象的name为young,而构造函数是新建一个name为young的person对象。
		System.out.println(p2.getName());
		Person p3 = new Person("zhi",10);//C:name=zhi,,age=10 cry
	}
}