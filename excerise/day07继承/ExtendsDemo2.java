/*
子父类出现后，类成员的特点：1、变量 2、函数 3、构造函数

1、变量  
   如果子父类中出现非私有的同名成员变量时，用this/super来区分访问本类还是父类的成员变量。this/super使用方法一致。
*/
class Father
{
	int num = 4;
}

class Son extends Father
{
	int num = 5;
	void show()
	{
		System.out.println(num);   // 5 num = this.num  打印本类的引用。而如果本类未定义num:则此处打印为4，super省略
		System.out.println(this.num); //5 而如果本类未定义num:则打印为4。因为this指向了new son对象。son 中只有一个继承了Father的num 
		System.out.println(super.num);// 4 打印超类/父类的引用，但是super指向的仍为 new son对象（多态：父类引用指向子类对象），因为父类并无对象。
	}
}
class  ExtendsDemo2
{
	public static void main(String[] args) 
	{
		Son s = new Son();  //调用 son 的class文件，这时会先加载father 的class文件
		s.show();
	}
}
