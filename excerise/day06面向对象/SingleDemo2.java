/*
�ȳ�ʼ������
��Ϊ������ʽ��
class Single
{
	private static Single s = new Single();
	private Single(){}
	public static Single getInstance
	{
		return s;
	}
} 
*/

/*
�����Ƿ���������ʱ���ų�ʼ����Ҳ�����������ʱ���ء�
��Ϊ������ʽ��
*/
class Single
{
	private static Single s = null;
	private Single(){}
	public static Single getInstance() 
	{
		if(s==null)
		     s = new Single();
		return s;
	}
}
class SingleDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
