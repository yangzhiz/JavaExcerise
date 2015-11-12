package packb;

public class DemoB 
{
	protected void method() //保护权限
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
	}//不会覆盖
	
	/*
	protected void method()
	{
		System.out.println("c run");
	}//c run    覆盖  可访问才可以覆盖
	*/
	/*
	public void method()
	{
		System.out.println("c run");
	}//c run     覆盖   可访问才可以覆盖
	*/
}

