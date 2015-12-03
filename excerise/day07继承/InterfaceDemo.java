/*
接口：初期理解，可以认为是一个特殊的抽象类
      当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
class 用于定义类
interface 用于定义接口，生成的也是class文件

接口的定义：
1、接口中常见定义： 常量，抽象方法。
2、接口中的成员都有固定修饰符。
   常量：public static final
   方法：public abstract

注意：接口中的成员都是public的

接口因为有抽象方法，所以不可以创建对象。只有将接口中的抽象方法全部实现，才能实例化。否则子类是一个抽象类

接口可以被类 多实现，也是对多继承不支持的转换形式，java支持多实现。
同时一个类在继承的同时可以实现多个接口。从而扩充自己的功能。
*/

interface Inter
{
	public static final int NUM = 3;
	public abstract void show();//  等价于 void show(); 定义为interface 系统会自动将修饰符补全
}

interface InterA
{
	public abstract void method();
}

class Demo
{
	public void function(){}
}
class Test extends Demo implements Inter,InterA //implement--实现 只有将接口中的抽象方法全部实现，才能实例化。区别于类与类之间的继承extends
{
	public void show(){}
	public void method(){}
}

interface A
{
	void methodA();
}
interface B extends A   //类与类之间是继承，类与接口之间是实现，接口与接口之间是继承，而且接口之间可以多继承。因为接口的方法没有方法体。
{
	void methodB();
}
class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t.NUM);			//3
		System.out.println(Test.NUM);		//3
		System.out.println(Inter.NUM);		//3
	}
}
