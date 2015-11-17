/*
线程间通讯：
其实就是多个线程在操作同一个资源。
但是操作的动作不同。


wait();
notify();
notifyAll();
都是用在同步中，因为要对持有监视器（锁）的线程操作。而只有同步中有锁的概念。

为什么这些方法要定义在Object类中呢？
因为这些方法在操作同步中线程时，都必须要标识它们所操作线程所持有的锁。
只有同一个锁上的被等待线程，可以被同一个锁上的notify唤醒。
不可以对不同锁中的线程进行唤醒。
即，等待和唤醒必须是同一个锁。

锁可以是任意对象，所以可以被任意对象调用的方法要定义在Object类中。
*/
class Res
{
	String name;
	String sex;
	boolean flag = false;
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
			synchronized(r)//Input.class
			{
				if(r.flag)
					try{r.wait();}catch(Exception e){}//java提供的wait抛出类异常；r.wait()用于标识是哪个锁的线程。
			if(x==0) 
			{
			r.name="mike";
			r.sex="male";
			}
			else
			{
			r.name="lily";
			r.sex = "female";
			}
			x = (x+1)%2;
			r.flag = true;
			r.notify();//唤醒线程池中第一个等待的线程
			}
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
			synchronized(r)
			{
				if(!r.flag)
					try{r.wait();}catch(Exception e){}
				System.out.println(r.name+"....."+r.sex);
				r.flag = false;
				r.notify();
			}
		}

	}
}
class InputOutputDemo
{
	public static void main(String[] args) 
	{
		Res r = new Res();

		Input in = new Input(r);
		Output out = new Output(r);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		t1.start();
		t2.start();
	}
}
