/*
װ�����ģʽ��
����Ҫ�����еĶ�����й�����ǿʱ�����Զ����࣬�����ж����룬�������еĶ��ܣ����ṩ��ǿ���ܡ�
��ô�Զ���ĸ����Ϊװ���ࡣ

�ص㣺
װ����ͨ����ͨ�����췽�����ձ�װ�εĶ���
�����ڱ�װ�εĶ���Ĺ��ܣ��ṩ��ǿ�Ĺ��ܡ�

MyTextReader
MyMediaReader

MyReader//ר�����ڶ�ȡ���ݵ��ࡣ
	|--MyTextReader
		|--MyBufferTextReader
    |--MyMediaReader
		|--MyBufferMediaReader
	|--MyDataReader
		|--MyBufferDataReader  //�̳е���չ�Բ���

class MyBufferReader
{
	MyBufferReader(MyTextReader text)
	{}
	MyBufferReader(MyMediaReader media)
	{}
}
�����������չ�Ժܲ
�ҵ�������Ĺ�ͬ���͡�ͨ����̬����ʽ�����������չ��

class MyBufferReader extends MyReader
{
	private MyReader r;
	MyBufferReader(MyReader r)//��̬
	{}
}

װ�����ģʽ�����������������չ��
MyReader//ר�����ڶ�ȡ���ݵ��ࡣ
	|--MyTextReader
    |--MyMediaReader
	|--MyDataReader
	|--MyBufferReader

	װ��ģʽ�ȼ̳�Ҫ�������˼̳���ϵӷ�ס�
	���ҽ�����������֮��Ĺ�ϵ��

ע�⣺
װ������Ϊ��ǿ���ж��󣬾߱��Ĺ��ܺ����е�����ͬ�ģ�ֻ�����ṩ�˸�ǿ���ܡ�
����װ����ͱ�װ����ͨ��������һ����ϵ�С�
*/
class Person
{
	public void chifan()
	{
		System.out.println("�Է�");
	}
}

class SuperPerson
{
	private Person p;

	SuperPerson(Person p)
	{
		this.p = p;
	}

	public void superChifan()
	{
		System.out.println("��θ��");
		p.chifan();
	}
}

class  DecorateDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		//p.chifan();
		SuperPerson sp = new SuperPerson(p);
		sp.superChifan();
	}
}
