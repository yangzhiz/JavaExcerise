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


class DuoTaiDemo2
{
	public static void main(String[] args)
	{
		/*
		Animal a = new Cat();//��������������ת��
		a.eat();
		//�����Ҫ����è�����з���ʱ����β�����
		//ǿ�ƽ���������á�ת���������͡�����ת�͡�
		Cat c = (Cat)a;//ǿ������ת��������ת�͡�
		c.catchMouse();
		
		Animal a1 = new Animal();
		a1.eat();
		Cat c1 = (Cat)a1;//error ���ܽ���������תΪè����
		//ǧ��Ҫ���������Ĳ��������ǽ����׵¶����תΪ�������͡�
		//������ת�����Ǹ�������ָ�����Լ����������ʱ�������ÿ��Ա�������Ҳ���Ա�ǿ��ת����
		//��̬��ʼ���ն���������������ű仯
		*/
		function(new Cat());
		function(new Dog());
	}
	public static void function(Animal a)
	{
		a.eat();
		if(a instanceof Cat) //instanceof �ж��Ƿ�Ϊĳһ����
		{
		Cat c = (Cat)a;
		c.catchMouse();
		}
		else if (a instanceof Dog) 
		{
			Dog d = (Dog)a;
		    d.kanjia();
		}
	}
}