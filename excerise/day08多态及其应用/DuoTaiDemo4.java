/*
5����̬��Ӧ��
*/

class Fu
{
	int num = 5;
	void method1()
	{
		System.out.println("fu method_1");
	}
	void method2()
	{
		System.out.println("fu method_2");
	}
	static void method4()
	{
		System.out.println("fu method_4");
	}
}

class Zi extends Fu
{
	int num = 8;
	void method1()
	{
		System.out.println("zi method_1");
	}
	void method3()
	{
		System.out.println("zi method_3");
	}
	static void method4()
	{
		System.out.println("zi method_4");
	}
}

class DuoTaiDemo4 
{
	public static void main(String[] args) 
	{

/*
		Fu f = new Zi();//��̬
		f.method1();//zi method_1
		f.method2();//fu method_2
        
�ڶ�̬�г�Ա����(�Ǿ�̬)���ص㣺
�ڱ���ʱ�ڣ����������ͱ���(f)����������(Fu)�Ƿ��е��õķ���������У�����ͨ�������û�б���ʧ�ܡ�
������ʱ�ڣ����Ķ���(new Zi())����������(Zi)�Ƿ��е��õķ�����

���ܽ���ǣ�
��Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ�
*/

/*
		Fu f = new Zi();
		System.out.println(f.num);//5

		Zi z = new Zi();
        System.out.println(z.num);//8

�ڶ�̬�У���Ա�������ص㣺�������ڳ�Ա������
���۱�������У����ο���ߣ������ͱ����������ࣩ
*/

		Fu f = new Zi();
		f.method4();//fu method_4   ��̬�� method4 �Ǿ�̬�ģ�����ʱ�Ѿ������ڷ������������� ���е��� Fu.method4()  �洢�ھ�̬��
		Zi z = new Zi();
		z.method4();//zi method_4   ��̬�� ������ new Zi();  ���е��� z.method4();
/*
�ڶ�̬�У���̬��Ա�������ص㣺�������ڷǾ�̬��Ա������
���۱�������У����ο���ߡ�
*/
	}
}
