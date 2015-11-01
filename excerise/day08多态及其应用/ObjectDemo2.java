class Demo  //extends Objects
{
	private int num;
	Demo(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj) 
	{
		if(!(obj instanceof Demo))
			return false;
		Demo d = (Demo)obj;
		return this.num==d.num;
	}
	public String toString()//覆盖父类中的 toString;
	{
		return "demo:"+num;
	}
}

class ObjectDemo2 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);
		System.out.println(d1.toString());//Demo@70e69696 对象类型及其哈希值(十六进制)
		System.out.println(d1.hashCode());//1894160022  哈希值的十进制形式
		System.out.println(Integer.toHexString(d1.hashCode()));//哈希值的十六进制形式70e69696

		Class c  = d1.getClass();
		System.out.println(c);//class Demo
		System.out.println(c.getName());//Demo
		/*
		易知d1.toString() 等价于
		getClass().getName() + '@' + Integer.toHexString(hashCode())
		*/

		System.out.println(d1.toString());
	}
}
