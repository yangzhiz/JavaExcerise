/*
2�����ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η������Ρ�
   ���磬private : ���ڲ������ⲿ���н��з�װ��
         static  : �ڲ���;߱��˾�̬����
		 ���ڲ��౻static���κ�ֻ��ֱ�ӷ����ⲿ���е�static��Ա�������˷��ʾ��ޡ�

		 ���ⲿ�������У����ֱ�ӷ��ʾ�̬�ڲ���ķǾ�̬��Ա�أ�
		 new Outer.Inner().function();

		 ���ⲿ�������У����ֱ�ӷ��ʾ�̬�ڲ���ľ�̬��Ա�أ�(ֱ����������)
		 Outer.Inner.function();

ע�⣺1�����ڲ����ж����˾�̬��Ա����������Ǿ�̬�ࡣ
      2�����ⲿ���еľ�̬���������ڲ���ʱ���ڲ���Ҳ�����Ǿ�̬�ġ�����̬����ֻ�ܷ��ʾ�̬��Ա���Ǿ�̬�����ȿ��Է��ʾ�̬��ԱҲ���Է��ʷǾ�̬��Ա��


����������ʱ�������ڲ�����������������ڲ�����������
��Ϊ�ڲ�������ʹ���ⲿ�����е����ݡ�

class Body
{
	private class Heart
	{

	}
	public void show()
	{
		new Heart();
	}
}
*/
class Outer
{
	private static int x = 3;

	static class Inner //��̬�ڲ���
	{
		static void function()  //�ڲ���ľ�̬��Ա
		{
			System.out.println("inner:"+x);
		}
	}

	class Inner2
	{
		void show()
		{
			System.out.println("inner2 show");
		}
	}
	public static void method() //�ⲿ��ľ�̬����
	{
		// new Inner2().show();//error ��̬�����޷����ʷǾ�̬��Ա��class Inner2��
		
	}
}

class InnerClassDemo2 
{
	public static void main(String[] args) 
	{
		new Outer.Inner().function(); //��functionΪ�Ǿ�̬�ġ��½��ڲ������ Outer.Inner()���󣬵����䷽��function();
		Outer.Inner.function();       //��functionΪ��̬�ġ�  ���贴�����󣬾�̬Inner�����ֱ�Ӽ��ؾ�̬function������

		Outer.method();
	}
}
