/*
��Ϊ��Ŀ�л�������е����⣬����Щ���Ⲣδ��java����������װ����
���Զ�����Щ���е�������԰���java�Ķ������װ��˼�롣
�����е����⡣�����Զ�����쳣��װ��

�Զ����쳣��

�����ڱ������У����ڳ�����-1��Ҳ��Ϊ�Ǵ�����޷���������ģ�
��ô����Ҫ�������������Զ����������

���ں����ڲ�������throw�׳��쳣������ô�ͱ���Ҫ����Ӧ�Ĵ�������
Ҫô���ڲ�try catch ����
Ҫô�ں����������õ����ߴ���

һ������£������ڳ����쳣����������Ҫ����.

���ִ�ӡ�Ľ����ֻ���쳣�����ƣ�ȴû���쳣����Ϣ��
��Ϊ�Զ�����쳣��δ������Ϣ��

��ζ����쳣��Ϣ�أ�

��Ϊ�������Ѿ����쳣��Ϣ�Ĳ���������ˡ�
��������ֻҪ�ڹ���ʱ�����쳣��Ϣͨ��super��䴫�ݸ����ࡣ
��ô�Ϳ���ֱ��ͨ��getMessage��ȡ�Զ�����쳣��Ϣ�ˡ�

ע�⣺
�������Զ�����̳�Exception��

�̳�Exceptionԭ���ǣ�
�쳣��ϵ��һ���ص㣺��Ϊ�쳣����쳣���󶼱��׳���
���Ƕ��߱������ԡ������������Throwable�����ϵ�ж����ص㡣

ֻ�������ϵ�е���Ͷ���ſ��Ա�throw��throws������

throw��throws������

throwʹ���ں����ڣ�
throwsʹ���ں����ϡ�

throw����������쳣����
throws����������쳣�ࡣ���Ը�������ö��Ÿ�����
*/

class FuShuException extends Exception //������getMessage();
{
	private int value;
	FuShuException()
	{
		super();
	}
	FuShuException(String msg,int value)
	{
		super(msg);
		this.value = value;
	}	
	public int getValue()
	{
		return value;
	}
}

class Demo
{
	int div(int a,int b) throws FuShuException
	{
		if (b<0)
		    throw new FuShuException("�����˳����Ǹ��������",b);//�ֶ�ͨ��throw�ؼ����׳�һ���Զ����쳣����
		return a/b;
	}
}
class  ExceptionDemo3
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,-1);
			System.out.println("x="+x);
		}
		catch (FuShuException e)
		{
			System.out.println(e.toString());
			//System.out.println("�������ָ�����");
			System.out.println("����Ϊ:"+e.getValue());
		}
		
		System.out.println("over");
	}
}


/*
JavaĬ�ϣ�Exception extends Throwable 
class Throwable //getMessage();
{
	private String message;
	Throwable(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return message;
	}
}
class Exception extends Throwable 
{
	Exception(String message)
	{
		super(message);
	}
}
*/