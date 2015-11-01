/*
private : 私有--只在本类中有限。
          权限修饰符：用于修饰类中的成员（成员函数，成员变量）。
将age 私有化以后，类以外即使建立对象，也不能直接访问。
但是人应该有年龄，则需要在person类中提供对应访问age的方式。

注意：私有仅仅是封装的一种表现形式。

*/

class Person
{
	private int age; //隐藏属性,类以外即使建立对象，也不能直接访问,提高安全性
	public void setAge(int a) //对外提供访问方式: 设置 之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句。对访问的数据进行操作。提高代码的健壮性。
	{
		if(a>0 && a<130)
		{
			age = a;
			speak();
		}
		else
			System.out.println("illegal age");
	}
	public int getAge()       //获取
	{
		return age;
	}
	void speak()
	{
		System.out.println("age="+age); 
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		Person p = new Person();
		//p.age = -20;
		p.setAge(-22);
		//p.speak();  0 成员变量存储在堆内存，有默认初始化值
	}
}