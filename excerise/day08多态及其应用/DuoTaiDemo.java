/*
��̬���������Ϊ������ڵĶ���������̬

�ˣ����� ��Ů��

���èè������
è x = new è();
���� x = new è();

1����̬������
	���������ָ�����Լ���������� Animal c = new Cat();
	���������Ҳ���Խ����Լ����������
2����̬��ǰ��
	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
	ͨ������һ��ǰ�᣺���ڸ��ǡ�
3����̬�ĺô�
	����˳������չ��
4����̬�ı׶�
	ֻ��ʹ�ø�������ã�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա��
5����̬��Ӧ��

6����̬ʹ��ע������

*/

/*
����
è 
��
*/

abstract class Animal
{
	public abstract void eat();
}

class Cat extends Animal
{
	public void eat()//����
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
		System.out.println("ץ����");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanjia()
	{
		System.out.println("����");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void gongDi()
	{
		System.out.println("����");
	}
}



class DuoTaiDemo
{
	public static void main(String[] args)
	{
		//Cat c = new Cat();
		//function(c);
		//function(new Dog());
		//function(new Pig());
		Animal c = new Cat();//һ������Ķ�����̬
		c.eat();
		function(new Cat());
	}
	/*
	public static void function(Cat c)
	{
		c.eat();
	}
	public static void function(Dog d)
	{
		d.eat();
	}
	public static void function(Pig p)
	{
		p.eat();
	}
	*/
	public static void function(Animal a)  // Animal a = new Cat();
	{
		a.eat();
		//a.catchMouse(); error
	}
}