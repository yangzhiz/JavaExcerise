/*
静态：static
用法：是一个修饰符，用于修饰成员（成员变量和成员函数）或者处于成员位置的内部类
当成员被静态修饰后，就多了一个调用方式，除了被对象调用外，还可以直接被类名调用。 类名.静态成员

static特点：
1、随着类的加载而加载。随着类的消失而消失。
   也就是说：他的生命周期最长。
2、优先于对象存在。
3、被所有对象所共享。
4、可以直接被类名所调用。
之所以不全设置为静态，是因为便于区分对象的特有内容和公有内容。同时可以缩短数据的生命周期，减少内存消耗。

实例变量和类变量的区别：
1、存放位置。
   类变量随着类的加载而存在于方法区中（也叫数据区、共享区）
   实例变量随着对象的建立而存在于堆内存中。
2、生命周期
   类变量生命周期最长，随着类的消失而消失。
   实例变量生命周期随着对象的消失而消失。

静态使用注意事项：
1、静态方法只能访问静态成员
   非静态方法既可以访问静态成员也可以访问非静态成员
2、静态方法中不可以定义this，super关键字。
   因为静态优先于对象存在，所以静态方法中不可以出现this。
3、主函数是静态的。

静态有利有弊
利：对对象的共享数据进行单独空间的存储，节省空间，没有必要每个对象都存储一份。
    可以直接被类名调用。
弊：生命周期过长；访问出现局限性。（静态虽好，但只能访问静态）
*/
class Person
{
	String name;                   //成员变量，实例变量；     属于特有内容随对象存储；
	static String country = "CN";  //静态的成员变量，类变量； static将不变的country属性从每个新定义的new Person对象中取出来放入方法区（共享区/数据区），避免了不必要的堆内存浪费
								   //类一旦加载，内存中就为country分配空间，而 name只有在创建对象时才会分配内存，所以说country优先于对象存在
	public static void show()      //加上static 将不能访问name成员，所以导致编译失败
	{
		System.out.println(name+"::"+country);
	}
}

class StaticDemo
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "yang";
		p.show();
		System.out.println(p.country);//被对象调用
		System.out.println(Person.country);//直接被类名调用

	}
}