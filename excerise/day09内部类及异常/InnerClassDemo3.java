/*
�ڲ��ඨ���ھֲ�ʱ
1�������Ա���Ա���η�����
2������ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�������ⲿ���е����á�
   ���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�������
*/


class Outer
{
	int x = 3;
	void method(final int a)
	{
		final int y = 4;
		class Inner
		{			
			void function()  //����Ϊ��̬���˴���Ϊ��̬�����ڲ���InnerӦΪ��̬����staticֻ���γ�Ա����ʱ��InnerΪ�ֲ��ࡣ
			{
				System.out.println(Outer.this.x);//3
				System.out.println(y);//4
				System.out.println(a);//7
			}
		}
		new Inner().function();
	}
}


class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		//new Outer().method();
		new Outer().method(7);//7
		new Outer().method(8);//8
	}
}
