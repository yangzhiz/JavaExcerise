package packb;

public class DemoB 
{
	protected void method() //����Ȩ��
	{
		System.out.println("demob run");
	}
	/*
	public static void main(String[] args)
	{
		C c = new C();
		c.method();
	}
	*/
}

class C extends DemoB
{
	
	void method()
	{
		System.out.println("democ run");
	}//���Ḳ��
	
	/*
	protected void method()
	{
		System.out.println("c run");
	}//c run    ����  �ɷ��ʲſ��Ը���
	*/
	/*
	public void method()
	{
		System.out.println("c run");
	}//c run     ����   �ɷ��ʲſ��Ը���
	*/
}

