/*
5、多态的应用：
接口的实现，降低耦合，提高功能扩展性和程序扩展性
*/


/*
需求：
电脑运行实例，
电脑运行基于主板。
*/

/*class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}
	public void useNetCard(NetCard c)
	{
		c.open();
		c.close();
	}
}

class NetCard
{
	public void open()
	{
		System.out.println("netcard open");
	}
	public void close()
	{
		System.out.println("netcard close");
	}
}
*/

interface PCI
{
	public void open();
	public void close();
}

class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}
	public void usePCI(PCI p)//多态 提高程序扩展性： PCI p = new NetCard() 接口型引用指向自己的子类对象
	{
		if(p!=null)
		{
			p.open();
			p.close();
		}
	}
}

class NetCard implements PCI
{
	public void open()
	{
		System.out.println("netcard open");
	}
	public void close()
	{
		System.out.println("netcard close");
	}
}

class  DuoTaiDemo5
{
	public static void main(String[] args) 
	{
		MainBoard mb = new MainBoard();
		mb.run();
		//mb.useNetCard(new NetCard());
		mb.usePCI(null);
		mb.usePCI(new NetCard());
	}
}
