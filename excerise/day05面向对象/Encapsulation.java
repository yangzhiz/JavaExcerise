/*
private : ˽��--ֻ�ڱ��������ޡ�
          Ȩ�����η��������������еĳ�Ա����Ա��������Ա��������
��age ˽�л��Ժ������⼴ʹ��������Ҳ����ֱ�ӷ��ʡ�
������Ӧ�������䣬����Ҫ��person�����ṩ��Ӧ����age�ķ�ʽ��

ע�⣺˽�н����Ƿ�װ��һ�ֱ�����ʽ��

*/

class Person
{
	private int age; //��������,�����⼴ʹ��������Ҳ����ֱ�ӷ���,��߰�ȫ��
	public void setAge(int a) //�����ṩ���ʷ�ʽ: ���� ֮���Զ����ṩ���ʷ�ʽ��������Ϊ�����ڷ��ʷ�ʽ�м����߼��жϵ���䡣�Է��ʵ����ݽ��в�������ߴ���Ľ�׳�ԡ�
	{
		if(a>0 && a<130)
		{
			age = a;
			speak();
		}
		else
			System.out.println("illegal age");
	}
	public int getAge()       //��ȡ
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
		//p.speak();  0 ��Ա�����洢�ڶ��ڴ棬��Ĭ�ϳ�ʼ��ֵ
	}
}