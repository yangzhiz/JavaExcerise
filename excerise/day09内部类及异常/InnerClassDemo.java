/*
�ڲ���ķ��ʹ���
1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�С�
   ֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г�����һ���ⲿ������ã���ʽ��  �ⲿ����.this
2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������

���ʸ�ʽ��
1�����ڲ��ඨ�����ⲿ��ĳ�Աλ���ϣ��ҷ�˽�У��������ⲿ��������ֱ�ӽ����ڲ������
��ʽ: �ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
Outer.Inner in = new Outer().new Inner();

*/

class Outer
{
	private int x = 3;

	class Inner //�ڲ���
	{
		int x = 4;
		void function()
		{
			//int x = 6;
			System.out.println("inner:"+x);//6  ���������û�ж��� x = 6;���ӡ���� x = 4; �˴���xʡ���� this.
										   //����ڲ�����û�ж��� x = 4; ���ӡ���� x = 3; �˴���xʡ���� Outer.this  ��ӡ�����ȼ�����������ġ�
			System.out.println("inner:"+this.x);//4
			System.out.println("inner:"+Outer.this.x);//3  ��Outer����ʶ���ⲿ���x
		}
	}

	void method()
	{
		Inner in = new Inner();
		in.function();
	}
}

class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		//Outer out = new Outer();
		//out.method(); inner:3

		/*ֱ�ӷ����ڲ���*/
		Outer.Inner in = new Outer().new Inner();//��ʽ
		in.function();
	}
}
