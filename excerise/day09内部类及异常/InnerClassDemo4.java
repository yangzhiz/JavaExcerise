/*
�����ڲ��ࣺ
1�������ڲ�����ʵ�����ڲ���ļ�д��ʽ��
2�����������ڲ����ǰ�᣺
   �ڲ�������Ǽ̳�һ�������ʵ�ֽӿڡ�

3�������ڲ���ĸ�ʽ�� new �����ӿ�() {�������������}  ��()��ʾ���캯�������Դ�������

4����ʵ�����ڲ������һ������������� ������������е��֡��������ݵĶ���
5�������ڲ����ж���ķ�����ò�Ҫ����������

ע�⣺
new Student(); //��ʾ�½�Student����

new Student()
{

};             //��ʾ�½�Student����������

Student s = new Student()
{

};             //��̬����������ý���������� �������ֻ�ܵ��ø����ж�����ķ����������ܵ����������еķ�����
*/

abstract class AbsDemo
{
	abstract void show();
}
class Outer
{
	int x = 3;

	/*
	class Inner extends AbsDemo
	{
		void show()
		{
			System.out.println("show:"+x);
		}
	}
	*/
	public void function()
	{
		//new Inner().show();
		new AbsDemo()
		{
			void show()
			{
				System.out.println("x="+x);
			}
		}.show();  //��������Ȼ�����show���������ܵȼ���ע�Ͳ���
        /*
		AbsDemo d = new AbsDemo()
		{
			void show()
			{
				System.out.println("x="+x);
			}
			void abc()
			{
				System.out.println("haha");
			}
		};
		d.show();//x=3   //AbsDemo d = new Inner()  ���෽����д
		d.abc();//error  //�෽��������ʹ��������
		*/
	}
}
class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}
