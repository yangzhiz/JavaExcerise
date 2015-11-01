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


class DuoTaiDemo2
{
	public static void main(String[] args)
	{
		/*
		Animal a = new Cat();//类型提升。向上转型
		a.eat();
		//如果想要调用猫的特有方法时，如何操作？
		//强制将父类的引用。转成子类类型。向下转型。
		Cat c = (Cat)a;//强制类型转换。向下转型。
		c.catchMouse();
		
		Animal a1 = new Animal();
		a1.eat();
		Cat c1 = (Cat)a1;//error 不能将动物类型转为猫类型
		//千万不要出现这样的操作，就是将弗雷德额对象转为子类类型。
		//我们能转换到是父类引用指向了自己的子类对象时，该引用可以被提升，也可以被强制转换。
		//多态自始至终都是子类对象在做着变化
		*/
		function(new Cat());
		function(new Dog());
	}
	public static void function(Animal a)
	{
		a.eat();
		if(a instanceof Cat) //instanceof 判断是否为某一类型
		{
		Cat c = (Cat)a;
		c.catchMouse();
		}
		else if (a instanceof Dog) 
		{
			Dog d = (Dog)a;
		    d.kanjia();
		}
	}
}