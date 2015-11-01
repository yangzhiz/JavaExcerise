/*
final:最终。作为一个修饰符。
1、可以修饰类，可以修饰变量，函数。
2、被final修饰的类不可以被继承。为了避免被子类继承，被复写功能。
3、被final修饰的方法不可以被复写。
4、被final修饰的常量是一个常量，只能赋值一次。既可以修饰成员变量，又可以修饰局部变量。
   当在描述事物时，一些数据的出现，值是固定的，为了增强阅读性，都给这些值起一个名字，方便于阅读。
   而这个值不需要改变，所以加上final。作为常量：常量的书写规范所有字母都大写，如果由多个单词组成，
   单词间通过_连接。
5、内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量。
*/


class Demo
{
	final int x =3;
	final double MY_PI = 3.14;
	void show()
	{
		final int y = 4;
		int y = 4; //error
		System.out.println(MY_PI);
	}
}
class SubDemo extends Demo
{	
}
class  FinalDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
