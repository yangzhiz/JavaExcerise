/*
��ʱ���幹�캯����
����������ʱ��������߱�һЩ���Ի���Ϊ����ô����Щ���ݶ����ڹ��캯���С�

ע��:���캯��֮��ĵ��ò�����ֱ��д�������ƣ�������this�����档this(ʵ��);  ����һ�㺯���ǲ��ܵ���this���ģ���һ�㺯���ǲ��ܵ��ù��캯���ġ�ֻ�����ڹ��캯���䡣
���ң�this���ֻ�ܶ����ڹ��캯���ĵ�һ�С�����ִ�б�Ĺ��캯���ĳ�ʼ������ִ���Լ��ĳ�ʼ��
*/

class Person
{
	private String name;
	private int age;
    /*
	�����������캯��
	*/
	Person()
	{
		System.out.println("A:name="+name+",,age="+age);
		cry();
	}
	Person(String n) //����ʱ�͸���������
	{
		name = n;
		System.out.println("B:name="+name+",,age="+age);
		cry();
	}

	public void setName(String n) //��������
	{
		name = n;
	}
	public String getName()  //��ȡ����
	{
		return name;
	}

	Person(String n,int a) //����ʱ�͸���������������
	{
		name = n;
		age = a;
		System.out.println("C:name="+name+",,age="+age);
		cry();
	}
	public void cry()
	{
		System.out.println("cry");
	}
}
class PersonDemo3
{
	public static void main(String[] args)
	{
		Person p1 = new Person();//A:name=null,,age=0 cry  ����һ�������ͻ������֮��Ӧ�Ĺ��캯����
		p1.cry();//cry ���캯����һ�㺯����д�����в�ͬ����������Ҳ�в�ͬ�� ���캯���Ƕ���һ���������С��������ʼ����
		p1.cry();//cry ��һ�㷽���Ƕ�����ò�ִ�У��Ǹ�������Ӷ���߱��Ĺ��ܡ�
		p1.cry();//cry һ�������������캯��ֻ����һ�Ρ���һ�㷽�����Ա�������ö�Ρ�
		Person p2 = new Person("yang");//B:name=yang,,age=0 cry
		p2.setName("young");  //set/get������Ŀ�����޸�һ��person�����nameΪyoung,�����캯�����½�һ��nameΪyoung��person����
		System.out.println(p2.getName());
		Person p3 = new Person("zhi",10);//C:name=zhi,,age=10 cry
	}
}