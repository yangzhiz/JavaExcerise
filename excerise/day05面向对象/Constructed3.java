class Person
{
	private String name;
	private int age;
    /*
	构造代码块：初始化不同对象对象都有的共性。例如cry
	作用：给对象进行初始化，
	      对象一建立就运行
		  优先于构造函数执行。
    与构造函数区别：构造代码块是给所有对象进行统一初始化，而构造函数是给对应的对象初始化。
	*/
	{
		System.out.println("person code run");
		cry();
	}

	Person()
	{
		System.out.println("A:name="+name+",,age="+age);
		//cry();
	}
	Person(String n) //构造时就赋予了姓名
	{
		name = n;
		System.out.println("B:name="+name+",,age="+age);
		//cry();
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
		//cry();
	}
	public void cry()
	{
		System.out.println("cry");
	}
}
class PersonDemo4
{
	public static void main(String[] args)
	{
		Person p1 = new Person(); //person code run cry A:name=null,,age=0 
		Person p2 = new Person("yang"); //person code run cry B:name=yang,,age=0 
	}
}