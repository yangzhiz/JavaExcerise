/*
���캯����������������һ�£��޷���ֵ���ͣ���return��
���ã��Զ�����г�ʼ����

Сϸ�ڣ���һ������û�ж��幹�캯��ʱ��ϵͳ��Ĭ�ϸ��������һ���ղ����Ĺ��캯����Person(){}; ��������ǽ����������ġ�
        �������ж����˹��캯����Ĭ�ϵĹ��캯����û���ˡ�
*/
class Person
{
	private String name;
	private int age;

	Person()
	{
		System.out.println("person run");
	}
	Person(String n)
	{
		name = n;

	}
}
class PersonDemo2
{
	public static void main(String[] args)
	{
		Person p = new Person();//person run ����һ�������ͻ������֮��Ӧ�Ĺ��캯����
		new Person(); //person run
	}
}