/*
�쳣���Ӹ����е����֣�
1�������ڸ��Ǹ���ʱ���������ķ����׳��쳣����ô����ĸ��Ƿ�����ֻ���׳�������쳣���߸��쳣�����ࡣ
2��������෽���׳��˶���쳣����ô�����ڸ��Ǹ÷���ʱ��ֻ���׳������쳣���Ӽ���
3�����������߽ӿڵķ�����û���쳣�׳�����ô�����ڸ��Ƿ���ʱ��Ҳ�������׳��쳣��
	***������෽���������쳣���ͱ���Ҫ����try�������Բ����׳���
*/

class AException extends Exception
{
}

class BException extends AException
{
}
class CException extends Exception
{
}


class Fu
{
	void show() throws AException
	{
	}
}
class Zi extends Fu
{
	void show() throws BException//ֻ����A����B�쳣����������C�쳣
	{
	}
}

class ExceptionDemo7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
