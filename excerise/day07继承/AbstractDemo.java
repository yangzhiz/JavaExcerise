/*
��������г�����ͬ���ܣ����ǹ������岻ͬ����ʱ���Խ������ϳ�ȡ��
��ʱֻ��ȡ���ܶ��壬������ȡ�������塣

��������ص㣺
1�����󷽷�һ�������ڳ������С�
2�����󷽷��ͳ����඼���뱻abstract����
3�������಻������new����������Ϊ���ó��󷽷�û�����塣
4���������еĳ��󷽷�Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽������������á�
   �������ֻ�����˲��ֳ��󷽷�����ô���໹�ǳ����ࡣ

������һ���ࣺ�������﷽���Ĳ��䣬ֻ���������������һЩ�������Ķ�������Щ��ȷ���Ĳ���Ҳ�Ǹ�����Ĺ��ܣ���Ҫ��ȷ�����������޷��������塣
              ͨ�����󷽷�����ɡ�

�������һ������˸�����������������Ҳ���Բ�������󷽷���ֻ�𵽲��ø��ཨ����������á�
�����಻����ʵ������

*/
abstract class Student
{
	abstract void study();//���󷽷�ֻ���ڳ������С� void study()������void study(){}�������з����壬���Խ������󡣣�
	void sleep()
	{
		System.out.println("lie down");
	}
}
class SprintStudent extends Student
{
	void study()
	{
		System.out.println("sprint study");
	}
}
class BaseStudent extends Student
{
	void study()
	{
		System.out.println("base study");
	}
}
class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}
class AbstractDemo 
{
	public static void main(String[] args) 
	{
		//new Student();//error
		new BaseStudent().study();
	}
}
