/*
�����ࡣ

class Demo<T t>

ʲôʱ���巺���ࣿ
������Ҫ�����������������Ͳ�ȷ��ʱ��������Object�������չ��
���ڶ��巺���������չ��

���ͷ����������Ͷ����ڷ���ֵ֮ǰ��

public <T> void show(T t)

�����ඨ��ķ��ͣ�������������Ч�����������ʹ�ã�
��ô������Ķ�����ȷҪ�����ľ������ͺ�����Ҫ���������;��Ѿ��̶��ˡ�

��ôΪ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ����
��ô���Խ����Ͷ����ڷ����ϡ�

��̬���ͷ�����

���ⷽ����
��̬���������Է������϶���ķ��͡�
class Demo<T>
{
	public static void method(T t)
	{
		System.out.println("method:"+t);//error �޷��Ӿ�̬�������з��ʷǾ�̬�� T 
										//Tֻ���ڶ�����֮�������ȷ������������ôӶ����С���Static���ڶ�����ڡ�
	}
}
�����̬����������Ӧ���������Ͳ�ȷ�������Խ����Ͷ����ڷ����ϡ�
class Demo<T>
{
	public static <W> void method(W t)
	{
		System.out.println("method:"+t);
	}
}

*/

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
