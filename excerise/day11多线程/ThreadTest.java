class Ticket implements Runnable
{
	private int tick = 500;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)   //同步代码块
			{
				if(tick>0)
				{
					try{Thread.sleep(10);}catch(Exception e){} //释放执行权
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

		Thread t1 = new Thread(t);//创建了一个线程
		Thread t2 = new Thread(t);//创建了一个线程
		Thread t3 = new Thread(t);//创建了一个线程
		Thread t4 = new Thread(t);//创建了一个线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}
}
