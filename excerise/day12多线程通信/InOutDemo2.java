/*
�����Ż�

���߳��ж��ʱ��Ҫ��while����if��            //ԭ���ñ����ѵ��߳���һ���жϱ�ǡ�
				notifyAll()����notify()	     //ԭ��Ϊ���ǻ��ѶԷ��̡߳�ֻ��notify��ͳһ����ֻ���ѱ����̵߳���������³����е������̶߳��ȴ���

*/

class Res
{
	private String name;
	private String sex;
	private boolean flag = false;
	public synchronized void set(String name,String sex)
	{
		if(flag)
		try{this.wait();}catch(Exception e){}//java�ṩ��wait�׳����쳣��r.wait()���ڱ�ʶ���ĸ������̡߳�
		this.name = name;
		this.sex  = sex;
		flag = true;
		this.notify();//�����̳߳��е�һ���ȴ����߳�
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