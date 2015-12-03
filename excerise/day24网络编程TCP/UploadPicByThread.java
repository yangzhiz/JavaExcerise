/*
----------------重要------------------
服务端

之前的服务端有局限性，当A客户端连接上之后。被服务端获取到。服务端执行具体流程。
这时候B客户端连接，只有等待。
因为服务端还没有处理完A客户端的请求，还没有循环回来执行下次accept方法。所以暂时获取不到B客户端对象。

那么为了能够让多个客户端同时并发访问服务端。服务端最好将每个客户端封装到一个单独的线中。
这样就可以同时处理多个客户端请求。

如何定义线程呢？

只要明确了每一个客户端要在服务端执行的代码即可。将该代码存入到run方法中。

*/
import java.io.*;
import java.net.*;


class PicThread implements Runnable
{
	private Socket s;
	PicThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		try
		{
			
		}
		catch ()
		{

		}
	}
}
class PicClient  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

class PicServer 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
