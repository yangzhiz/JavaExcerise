/*
代码优化

当线程有多个时：要用while代替if；            //原因：让被唤醒的线程再一次判断标记。
				notifyAll()代替notify()	     //原因：为的是唤醒对方线程。只用notify，统一出现只唤醒本方线程的情况。导致程序中的所有线程都等待。

*/

class Res
{
	private String name;
	private String sex;
	private boolean flag = false;
	public synchronized void set(String name,String sex)
	{
		if(flag)
		try{this.wait();}catch(Exception e){}//java提供的wait抛出类异常；r.wait()用于标识是哪个锁的线程。
		this.name = name;
		this.sex  = sex;
		flag = true;
		this.notify();//唤醒线程池中第一个等待的线程
	}

	public synchronized void out()
	{
		if(!flag)
		try{this.wait();}catch(Exception e){}
		System.out.println(name+"...."+sex);
		flag = false;
		this.notify();
	}
}

class Input implements Runnable
{
	private Res r;
	Input(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while (true)
		{		
			if(x==0) 
				r.set("mike","male");
			else
				r.set("lily","female");
		    x=(x+1)%2;
		}
	} 
}

class Output implements Runnable 
{
	private Res r;
	Output(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		
		while (true)
		{
			r.out();
		}

	}
}
class InputOutputDemo
{
	public static void main(String[] args) 
	{
		Res r = new Res();
		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();
/*
		Input in = new Input(r);
		Output out = new Output(r);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		t1.start();
		t2.start();
*/
	}
}