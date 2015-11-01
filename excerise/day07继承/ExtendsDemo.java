/*
继承：
1、提高了代码的复用性。
2、继承让类与类之间产生了关系，有了关系才有多态。

注意：
父类应该具备的是所有子类共有的属性。
千万不熬为了获取其他类的功能，简化代码而继承。
必须是类与类之间有所属关系才可以继承。所属关系 is a 。必须要判断子类所继承父类的所有功能是否都会用得到。

Java语言中只支持单继承，不支持多继承（继承多个类），即一个孩子只有一个父亲
因为多继承会带来安全隐患：当多个父类中定义了相同功能，但是功能内容不同时，子类不确定运行哪一个。
class A
{
	void show()
	{
		System.out.println("a");
	}
}
class B
{
	void show()
	{
		System.out.println("b");
	}
}
class C extends A,B
{
}
C c = new C();
c.show();     //并不能确定打印的是什么，即安全隐患
但是java保留了这种机制，用另一种体现形式来完成表示，即多实现。

java支持多层继承：C继承B，B继承A  这是一个继承体系

想要使用体系，先查阅体系父类的描述，通过了解共性内容，来了解体系的基本功能。
在具体调用时，创建最子类的对象即可。1、因为有可能父类不能创建对象 2、创建子类对象可以使用更多的功能。包括基本的和特有的。
总结：查阅父类功能，创建子类对象使用功能。

聚集： has a  分为聚合，组合。

聚合：整体由部分组成。
组合：事物联系程度更紧密。具有统一的生存期。部分缺失则整体无意义


*/


/*
将学生和工人的共性描述提取出来，单独进行描述。
只要让学生和工人与单独描述的这个类关联即可。
*/
class Person
{
	String name;
	int age;
}

class Student extends Person
{
	void study()
	{
		System.out.println("good good study");
	}
}
class Worker extends Person
{
	void work()
	{
		System.out.println("good good work");
	}
}
class ExtendsDemo
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name = "yang";
	}
}