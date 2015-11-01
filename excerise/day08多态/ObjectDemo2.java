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
	public String toString()//���Ǹ����е� toString;
	{
		return "demo:"+num;
	}
}

class ObjectDemo2 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);
		System.out.println(d1.toString());//Demo@70e69696 �������ͼ����ϣֵ(ʮ������)
		System.out.println(d1.hashCode());//1894160022  ��ϣֵ��ʮ������ʽ
		System.out.println(Integer.toHexString(d1.hashCode()));//��ϣֵ��ʮ��������ʽ70e69696

		Class c  = d1.getClass();
		System.out.println(c);//class Demo
		System.out.println(c.getName());//Demo
		/*
		��֪d1.toString() �ȼ���
		getClass().getName() + '@' + Integer.toHexString(hashCode())
		*/

		System.out.println(d1.toString());
	}
}
