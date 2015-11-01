/*
Object:�����ж����ֱ�ӻ��߼�Ӹ��ࡣ �ϵ�
�����ж�����Ƕ��ж��󶼾߱��Ĺ��ܡ�

Object �����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ���

����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶��塣
ֻҪ��Ϯ�����еĹ��ܣ������Լ����бȽ����ݼ��ɡ�����Ǹ��ǡ�

*/
class Demo  //extends Objects
{
	private int num;
	Demo(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj) //Object obj = new Demo();��̬
	{
		//return this.num==obj.num;//error  Object���в�û�ж���obj
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
		System.out.println(d1.equals(d2));//false  equals�� ==
		System.out.println(d1==d2);       //false
		System.out.println(d1.equals(d3));//true  �����ϱȽϵ��ǵ�ַ
		System.out.println(d1==d3);       //true
		*/
		Demo d1 = new Demo(4);
		Demo d2 = new Demo(4);
		System.out.println(d1.compare(d2));//true �����ǱȽϵ�ַ
	}
}
