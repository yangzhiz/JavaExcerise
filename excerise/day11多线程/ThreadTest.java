class Ticket implements Runnable
{
	private int tick = 500;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)   //ͬ�������
			{
				if(tick>0)
				{
					try{Thread.sleep(10);}catch(Exception e){} //�ͷ�ִ��Ȩ
					System.out.println(Thread.currentThread().getName()+"....sale:"+ tick--);
				}
			}
		}
	}
}


class ThreadTest  
{
	public static void main(String[] args) 
	{
		Ticket t  =  new Ticket();

		Thread t1 = new Thread(t);//������һ���߳�
		Thread t2 = new Thread(t);//������һ���߳�
		Thread t3 = new Thread(t);//������һ���߳�
		Thread t4 = new Thread(t);//������һ���߳�
		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}
}
