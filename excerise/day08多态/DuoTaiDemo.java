/*
多态：可以理解为事物存在的多种体现形态

人：男哒 ，女哒

动物：猫猫，狗狗
猫 x = new 猫();
动物 x = new 猫();

1、多态的体现
	父类的引用指向了自己的子类对象。 Animal c = new Cat();
	父类的引用也可以接收自己的子类对象。
2、多态的前提
	必须是类与类之间有关系。要么继承，要么实现。
	通常还有一个前提：存在覆盖。
3、多态的好处
	提高了程序的扩展性
4、多态的弊端
	只能使用父类的引用，但是只能使用父类的引用访问父类中的成员。
5、多态的应用

6、多态使用注意事项

*/

/*
动物
猫 
狗
*/

abstract class Animal
{
	public abstract void eat();
}

class Cat extends Animal
{
	public void eat()//覆盖
	{
		System.out.println("吃鱼");
	}
	public void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}
	public void kanjia()
	{
		System.out.println("看家");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("饲料");
	}
	public void gongDi()
	{
		System.out.println("拱地");
	}
}



class DuoTaiDemo
{
	public static void main(String[] args)
	{
		//Cat c = new Cat();
		//function(c);
		//function(new Dog());
		//function(new Pig());
		Animal c = new Cat();//一个对象的多种形态
		c.eat();
		function(new Cat());
	}
	/*
	public static void function(Cat c)
	{
		c.eat();
	}
	public static void function(Dog d)
	{
		d.eat();
	}
	public static void function(Pig p)
	{
		p.eat();
	}
	*/
	public static void function(Animal a)  // Animal a = new Cat();
	{
		a.eat();
		//a.catchMouse(); error
	}
}