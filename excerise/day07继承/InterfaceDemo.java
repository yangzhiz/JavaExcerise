/*
�ӿڣ�������⣬������Ϊ��һ������ĳ�����
      ���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ��
class ���ڶ�����
interface ���ڶ���ӿڣ����ɵ�Ҳ��class�ļ�

�ӿڵĶ��壺
1���ӿ��г������壺 ���������󷽷���
2���ӿ��еĳ�Ա���й̶����η���
   ������public static final
   ������public abstract

ע�⣺�ӿ��еĳ�Ա����public��

�ӿ���Ϊ�г��󷽷������Բ����Դ�������ֻ�н��ӿ��еĳ��󷽷�ȫ��ʵ�֣�����ʵ����������������һ��������

�ӿڿ��Ա��� ��ʵ�֣�Ҳ�ǶԶ�̳в�֧�ֵ�ת����ʽ��java֧�ֶ�ʵ�֡�
ͬʱһ�����ڼ̳е�ͬʱ����ʵ�ֶ���ӿڡ��Ӷ������Լ��Ĺ��ܡ�
*/

interface Inter
{
	public static final int NUM = 3;
	public abstract void show();//  �ȼ��� void show(); ����Ϊinterface ϵͳ���Զ������η���ȫ
}

interface InterA
{
	public abstract void method();
}

class Demo
{
	public void function(){}
}
class Test extends Demo implements Inter,InterA //implement--ʵ�� ֻ�н��ӿ��еĳ��󷽷�ȫ��ʵ�֣�����ʵ������������������֮��ļ̳�extends
{
	public void show(){}
	public void method(){}
}

interface A
{
	void methodA();
}
interface B extends A   //������֮���Ǽ̳У�����ӿ�֮����ʵ�֣��ӿ���ӿ�֮���Ǽ̳У����ҽӿ�֮����Զ�̳С���Ϊ�ӿڵķ���û�з����塣
{
	void methodB();
}
class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t.NUM);			//3
		System.out.println(Test.NUM);		//3
		System.out.println(Inter.NUM);		//3
	}
}
