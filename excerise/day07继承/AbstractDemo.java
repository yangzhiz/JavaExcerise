/*
当多个类中出现相同功能，但是功能主体不同，这时可以进行向上抽取。
这时只抽取功能定义，而不抽取功能主体。

抽象类的特点：
1、抽象方法一定定义在抽象类中。
2、抽象方法和抽象类都必须被abstract修饰
3、抽象类不可以用new创建对象。因为调用抽象方法没有意义。
4、抽象类中的抽象方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。
   如果子类只覆盖了部分抽象方法，那么子类还是抽象类。

区别于一般类：描述事物方法的不变，只不过该事物出现了一些看不懂的东西，这些不确定的部分也是该事物的功能，需要明确出来，但是无法定义主体。
              通过抽象方法来完成。

抽象类比一般类多了个抽象函数。抽象类中也可以不定义抽象方法，只起到不让该类建立对象的作用。
抽象类不可以实例化。

*/
abstract class Student
{
	abstract void study();//抽象方法只能在抽象类中。 void study()区别于void study(){}。后者有方法体，可以建立对象。，
	void sleep()
	{
		System.out.println("lie down");
	}
}
class SprintStudent extends Student
{
	void study()
	{
		System.out.println("sprint study");
	}
}
class BaseStudent extends Student
{
	void study()
	{
		System.out.println("base study");
	}
}
class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}
class AbstractDemo 
{
	public static void main(String[] args) 
	{
		//new Student();//error
		new BaseStudent().study();
	}
}
