/*
�̼߳�ͨѶ��
��ʵ���Ƕ���߳��ڲ���ͬһ����Դ��
���ǲ����Ķ�����ͬ��


wait();
notify();
notifyAll();
��������ͬ���У���ΪҪ�Գ��м��������������̲߳�������ֻ��ͬ���������ĸ��

Ϊʲô��Щ����Ҫ������Object�����أ�
��Ϊ��Щ�����ڲ���ͬ�����߳�ʱ��������Ҫ��ʶ�����������߳������е�����
ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͬһ�����ϵ�notify���ѡ�
�����ԶԲ�ͬ���е��߳̽��л��ѡ�
�����ȴ��ͻ��ѱ�����ͬһ������

������������������Կ��Ա����������õķ���Ҫ������Object���С�
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
					try{r.wait();}catch(Exception e){}//java�ṩ��wait�׳����쳣��r.wait()���ڱ�ʶ���ĸ������̡߳�
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
			r.notify();//�����̳߳��е�һ���ȴ����߳�
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
