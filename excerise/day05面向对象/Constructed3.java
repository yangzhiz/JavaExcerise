class Person
{
	private String name;
	private int age;
    /*
	�������飺��ʼ����ͬ��������еĹ��ԡ�����cry
	���ã���������г�ʼ����
	      ����һ����������
		  �����ڹ��캯��ִ�С�
    �빹�캯�����𣺹��������Ǹ����ж������ͳһ��ʼ���������캯���Ǹ���Ӧ�Ķ����ʼ����
	*/
	{
		System.out.println("person code run");
		cry();
	}

	Person()
	{
		System.out.println("A:name="+name+",,age="+age);
		//cry();
	}
	Person(String n) //����ʱ�͸���������
	{
		name = n;
		System.out.println("B:name="+name+",,age="+age);
		//cry();
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
		//cry();
	}
	public void cry()
	{
		System.out.println("cry");
	}
}
class PersonDemo4
{
	public static void main(String[] args)
	{
		Person p1 = new Person(); //person code run cry A:name=null,,age=0 
		Person p2 = new Person("yang"); //person code run cry B:name=yang,,age=0 
	}
}