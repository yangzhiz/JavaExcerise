/*
this:�������־ֲ������ͳ�Ա����ͬ���������
this:�ʹ�����Ķ��󣬵��Ǵ�����һ���أ�
     ---this���������ں���������������á�this���������ں���������������á�
	    ��˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����
this��Ӧ�ã����������й���ʱ���ú����ڲ�Ҫ�õ����øú����Ķ���ʱ����ʱ��this����ʾ�������
            �������๦���ڲ�ʹ�õ��˱�����󣬶���this��ʾ��
*/
class Person
{
	private String name;//��Ա���� �����name
	private int age;
/*
	Person(String n) //nû�н����������ã�����û������ı��������Ķ��Խϲ�
	{
		name = n;
	}
*/
	Person(String name) //�ֲ�����name
	{
		//name = name;//�˴���name��Ϊ�ֲ�����
		this.name = name; //this.name---�����name
	}
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public void speak()
	{
		System.out.println("name="+this.name+"...age="+this.age); 
		this.show();//this�ǿ��Ա�ʡ�Եģ����������Ķ���
	}
	public void show()
	{
		System.out.println(this.name);
	}
}
class PersonDemo5
{
	public static void main(String[] args)
	{
		Person p = new Person("yang");
		//p.speak();//name=null...age=0 ��Ϊname = name;//�˴���name��Ϊ�ֲ���������û�и�ֵ����Ա����name,Ϊ���õ���this
		p.speak();//name=yang...age=0  yang ��Ϊthis.name = name; �����this����p
		Person p1 = new Person("young");//
		p1.speak();////name=young...age=0 young   ��Ϊthis.name = name;�����this����p1

	}
}