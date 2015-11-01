/*
���ģʽ�����ĳһ����������֮��Ч�ķ���
java����23�����ģʽ��
-----�������ģʽ-----
���һ�������ڴ���ֻ����һ������

��Ҫ��֤����Ψһ��
1��Ϊ�˱�������������ཨ����������ȿ��ƽ�ֹ�����������������
2����Ϊ��������������Է��ʵ��������ֻ���ڱ������Զ���һ������
3��Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��

����ʵ�֣�
����һ������ʽ
1�������캯��˽�л���
2�������д���һ���������
3���ṩһ���������Ի�ȡ��
������������ʽ

����Ҫ��������Ķ���֤���ڴ���Ψһʱ���ͽ����ϵ��������ϼ��ɡ�
*/

class Single
{
	private Single(){}//1
	private static Single s = new Single();//2
	public static Single getInstance()//3
	{
		return s;
	}
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
}
class SingleDemo 
{
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		s1.setNum(23);
		System.out.println(s2.getNum());
	}
}
