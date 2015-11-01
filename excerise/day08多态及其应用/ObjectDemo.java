/*
Object:是所有对象的直接或者间接父类。 上帝
该类中定义的是多有对象都具备的功能。

Object 类中已经提供了对对象是否相同的比较方法

如果自定义类中也有比较相同的功能，没有必要重新定义。
只要沿袭父类中的功能，建立自己特有比较内容即可。这就是覆盖。

*/
class Demo  //extends Objects
{
	private int num;
	Demo(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj) //Object obj = new Demo();多态
	{
		//return this.num==obj.num;//error  Object类中并没有定义obj
		if(!(obj instanceof Demo))
			return false;
		Demo d = (Demo)obj;
		return this.num==d.num;
	}
	/*
	public boolean compare(Demo d)
	{
		return this.num==d.num;
	}
	*/
}

class ObjectDemo 
{
	public static void main(String[] args) 
	{
		/*
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = d1;
		System.out.println(d1.equals(d2));//false  equals即 ==
		System.out.println(d1==d2);       //false
		System.out.println(d1.equals(d3));//true  本质上比较的是地址
		System.out.println(d1==d3);       //true
		*/
		Demo d1 = new Demo(4);
		Demo d2 = new Demo(4);
		System.out.println(d1.compare(d2));//true 不再是比较地址
	}
}
