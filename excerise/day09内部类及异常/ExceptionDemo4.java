/*
Exception����һ������������쳣RuntimeException ������ʱ�쳣��

1������ں��������׳����쳣�������Ͽ��Բ�������������һ��ͨ����
2������ں����������˸��쳣�������߿��Բ��ý��д�������һ��ͨ����

֮���Բ����ں�������������Ϊ����Ҫ�õ����ߴ���
�����쳣������ϣ������ֹͣ����Ϊ������ʱ���������޷���������������ϣ��ֹͣ�����
�г���Ա�Դ������������

�Զ����쳣ʱ��������쳣�ķ������޷��ټ����������㡣
�����Զ����쳣�̳�RuntimeException��

�����쳣�����֣�
1������ʱ�������쳣�������쳣�ɱ�����
2������ʱ���������쳣������ʱ�쳣��RuntimeException�Լ����ࣩ
*/
class FuShuException extends RuntimeException //������getMessage();
{
	FuShuException(String msg)
	{
		super(msg);
	}	
	
}
class Demo
{
	int div(int a,int b)
	{
		if (b<0)
		    throw new FuShuException("�����˳����Ǹ��������");
		return a/b;
	}
}
class ExceptionDemo4 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		int x = d.div(4,-9);
		System.out.println("x="+x);
		System.out.println("over");
	}
}
