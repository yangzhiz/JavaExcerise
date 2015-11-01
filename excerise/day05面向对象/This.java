/*
this:用于区分局部变量和成员变量同名的情况。
this:就代表本类的对象，但是代表哪一个呢？
     ---this代表他所在函数所属对象的引用。this代表他所在函数所属对象的引用。
	    简单说：哪个对象在调用this所在的函数，this就代表哪个对象！
this的应用：当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象。
            但凡本类功能内部使用到了本类对象，都用this表示。
*/
class Person
{
	private String name;//成员变量 对象的name
	private int age;
/*
	Person(String n) //n没有交代具体作用，属于没有意义的变量名，阅读性较差
	{
		name = n;
	}
*/
	Person(String name) //局部变量name
	{
		//name = name;//此处的name均为局部变量
		this.name = name; //this.name---对象的name
	}
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public void speak()
	{
		System.out.println("name="+this.name+"...age="+this.age); 
		this.show();//this是可以被省略的，加上增加阅读性
	}
	public void show()
	{
		System.out.println(this.name);
	}
}
class PersonDemo5
{
	public static void main(String[] args)
	{
		Person p = new Person("yang");
		//p.speak();//name=null...age=0 因为name = name;//此处的name均为局部变量。并没有赋值给成员变量name,为此用到了this
		p.speak();//name=yang...age=0  yang 因为this.name = name; 这里的this代表p
		Person p1 = new Person("young");//
		p1.speak();////name=young...age=0 young   因为this.name = name;这里的this代表p1

	}
}