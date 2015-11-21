/*

读取键盘录入。
System.out：对应的是标准输出设备。控制台

System.in：对应标准的输入设备。键盘


需求：
通过键盘录入数据。
当录入一行数据后，就将改行数据进行打印。
如果录入的数据是over，那么停止录入。

通过刚才的键盘录入一行数据并打印其大写，发现其实就是读一行数据的原理
即readLine方法

能不能直接使用readLine方法来完成键盘录入的一行数据的读取呢？

但是readLine方法是字符流BufferedReader类中的方法。

而键盘录入的read方法是字节流InputStream方法。

那么能不能将字节流转换成字符流 再使用字符流的缓冲区readLine方法呢。

详情见TransStreamDemo.java

*/
import java.io.*;

class ReadIn
{
	public static void main(String[] args) throws IOException
	{
		InputStream in = System.in;

		/*
		int by = in.read();

		System.out.println(char(by));
		System.out.println('\r'+0);
		System.out.println('\n'+0));
		*/
	}
}
