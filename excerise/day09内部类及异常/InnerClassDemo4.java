/*
匿名内部类：
1、匿名内部类其实就是内部类的简写格式。
2、定义匿名内部类的前提：
   内部类必须是继承一个类或者实现接口。

3、匿名内部类的格式： new 父类或接口() {定义子类的内容}  （()表示构造函数，可以传参数）

4、其实匿名内部类就是一个匿名子类对象。 而且这个对象有点胖。（带内容的对象）
5、匿名内部类中定义的方法最好不要超过三个。

注意：
new Student(); //表示新建Student对象

new Student()
{

};             //表示新建Student类的子类对象

Student s = new Student()
{

};             //多态：父类的引用接收子类对象。 所以最后只能调用父类中定义过的方法，而不能调用子类特有的方法。
*/

abstract class AbsDemo
{
	abstract void show();
}
class Outer
{
	int x = 3;

	/*
	class Inner extends AbsDemo
	{
		void show()
		{
			System.out.println("show:"+x);
		}
	}
	*/
	public void function()
	{
		//new Inner().show();
		new AbsDemo()
		{
			void show()
			{
				System.out.println("x="+x);
			}
		}.show();  //匿名对象，然后调用show方法。功能等价于注释部分
        /*
		AbsDemo d = new AbsDemo()
		{
			void show()
			{
				System.out.println("x="+x);
			}
			void abc()
			{
				System.out.println("haha");
			}
		};
		d.show();//x=3   //AbsDemo d = new Inner()  子类方法重写
		d.abc();//error  //多方法不允许使用匿名类
		*/
	}
}
class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}
