/*
2������
   ��������ֺ͸���һģһ���ĺ���ʱ��
   �����������øú��������������ຯ�������ݡ���ͬ����ĺ���������һ����

   ��������Ǻ�������һ�����ԣ���д�����ǣ�

   ������̳��˸��࣬��Ϯ�˸���Ĺ��ܵ������С�����������߱��ù��ܣ����ǹ������ݲ�ͬ��
   ��ʱû�б�Ҫ�����¹��ܣ�����ʹ�ø������ԣ���������Ĺ��ܶ��壬����д�������ݡ�

ע�⣺
1�����า�Ǹ��࣬���븲������Ȩ�޴��ڵ��ڸ��࣬�������ʧ�ܡ�public > Ĭ�� > private
2����ֻ̬�ܸ��Ǿ�̬��

���֣�
���أ�ֻ��ͬ�������Ĳ����б�
��д���Ӹ��෽��һģһ�������ǹ������ݲ�ͬ

*/
class Father
{
	void speak()
	{
		System.out.println("vb");
	}
	void show()   
	{
		System.out.println("father show");
	}
	
}

class Son extends Father
{
	void speak()   //����
	{
		System.out.println("java");
	}
	void show()   //��ָ��Ϊprivate �����ʧ�ܣ��޷����ǣ�
	              //�������show����Ϊprivate����������ͨ�������ǲ�δ�õ�����
				  //�������show����Ϊpublic�������ʧ��
	{
		System.out.println("son show"); 
	}
}
class  ExtendsDemo3
{
	public static void main(String[] args) 
	{
		Son s = new Son();  //���� son ��class�ļ�����ʱ���ȼ���father ��class�ļ�
		s.show();  // son show
		s.speak(); //java
	}
}

/*
�̳�������չ:�ֻ�������Ϣ����չ
*/
class Tel
{
	void show()
	{
		System.out.println("number");
	}
}
 class NewTel extends Tel
{
	void show()
	{
		super.show();
		System.out.println("name");
		System.out.println("picture");
	}
}