/*
1���쳣�����ǳ���������ʱ���ֲ����������
����������Ҳ����ʵ�����е�һ����������Ҳ����ͨ��java�������ʽ��������������װ�ɶ���
      ��ʵ����java�Բ������������������Ķ������֡�
	
��������Ļ��֣����֣�һ�������ص����⡣һ�ַ����ص����⡣

�������صģ�javaͨ��Error�����������
            ����Errorһ�㲻��д����ԵĴ��������д���
���ڷ����صģ�javaͨ��Exception�����������
            ����Exception����ʹ������ԵĴ���ʽ���д���

����Error����Exception����һЩ�������ݡ�
���磺����������Ϣ������ԭ��ȡ�


2���쳣����--java�ṩ�����е������д���

try
{
	��Ҫ�����Ĵ��룻
}
catch(�쳣�� ����)
{
	�����쳣�Ĵ��룻������ʽ��
}
finally
{
	һ����ִ�е���䣻
}

3���Բ��񵽵��쳣������г�������������
   String getMessage(): ��ȡ�쳣��Ϣ


 
�ں����������쳣��
������߰�ȫ�ԣ��õ���ȥ���д��������������ʧ�ܡ�



*/
class Demo
{
	int div(int a,int b) throws Exception //�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ�������⡣
	{
		return a/b;  //new ArithmeticException();
	}
}
class ExceptionDemo1 
{
	public static void main(String[] args) //throws Exception
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
		    System.out.println("x="+x);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("�ǲ���ɵ");
	} 
}
