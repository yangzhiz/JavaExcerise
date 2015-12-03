/*
2、函数
   当子类出现和父类一模一样的函数时。
   当子类对象调用该函数，会运行子类函数的内容。如同父类的函数被覆盖一样。

   这种情况是函数的另一种特性：重写（覆盖）

   当子类继承了父类，沿袭了父类的功能到子类中。但是子类虽具备该功能，但是功能内容不同。
   此时没有必要定义新功能，而是使用覆盖特性，保留父类的功能定义，并重写功能内容。

注意：
1、子类覆盖父类，必须覆盖子类权限大于等于父类，否则编译失败。public > 默认 > private
2、静态只能覆盖静态。

区分：
重载：只看同名函数的参数列表
重写：子父类方法一模一样。但是功能内容不同

*/
class Father
{
	void speak()
	{
		System.out.println("vb");
	}
	void show()   
	{
		System.out.println("father show");
	}
	
}

class Son extends Father
{
	void speak()   //覆盖
	{
		System.out.println("java");
	}
	void show()   //若指定为private 则编译失败，无法覆盖；
	              //若父类的show方法为private，则编译可以通过，但是并未用到覆盖
				  //若父类的show方法为public，则编译失败
	{
		System.out.println("son show"); 
	}
}
class  ExtendsDemo3
{
	public static void main(String[] args) 
	{
		Son s = new Son();  //调用 son 的class文件，这时会先加载father 的class文件
		s.show();  // son show
		s.speak(); //java
	}
}

/*
继承用于扩展:手机来电信息的扩展
*/
class Tel
{
	void show()
	{
		System.out.println("number");
	}
}
 class NewTel extends Tel
{
	void show()
	{
		super.show();
		System.out.println("name");
		System.out.println("picture");
	}
}