/*
��̬����顣
��ʽ��
static      //ע��СЩ
{
	ִ����䡣
}
�ص㣺������ļ��ض�ִ�У���ִֻ��һ�Ρ�����������������ִ�С�
���ڸ�����г�ʼ����
*/

class StaticCode
{
	static
	{
		System.out.println("a");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}
class StaticCodeDemo 
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new StaticCode();
		new StaticCode();       //�������a,��ΪStaticCode���Ѿ����ڴ����ˡ�
		System.out.println("over");
		StaticCode.show();
		StaticCode s = null;    //��û���õ����е����ݣ����Բ��ᱻ���ء��������a.
		new StaticCode1(5);     // a c26 d
	}
	static
	{
		System.out.println("c");
	}
}

class StaticCode1
{
	int num = 26;
	StaticCode1()
	{
		System.out.println("b");//�ù��캯��������ִ�г�ʼ������
	}
	static
	{
		System.out.println("a");//��̬���������ʼ�����˴����ܷ���num,numΪ�Ǿ�̬�������ɾ�̬���á�
	}
	{
		System.out.println("c"+this.num);//�������飬�������ʼ��������ʽ��ʼ��֮��ִ�У���ʽ��ʼ����ϵͳĬ�ϳ�ʼ��֮��ִ��
	}
	StaticCode1(int x)         //���캯������Ӧ�����ʼ��
	{
		System.out.println("d");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}

