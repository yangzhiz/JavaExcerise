/*
5����̬��Ӧ�ã�
�ӿڵ�ʵ�֣�������ϣ���߹�����չ�Ժͳ�����չ��
*/


/*
����
��������ʵ����
�������л������塣
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
	public void usePCI(PCI p)//��̬ ��߳�����չ�ԣ� PCI p = new NetCard() �ӿ�������ָ���Լ����������
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
