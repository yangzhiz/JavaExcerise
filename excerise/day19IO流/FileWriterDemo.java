/*
字符流和字节流：

字节流的两个基类：

InputStream  OutputStream

字符流的两个基类：

Reader       Writer

既然IO流是操作数据的，
那么数据的最常见体现形式是：文件。

先以操作文件为主来演示。

需求：在硬盘上，创建一个文件并写入数据。

找到专门操作文件的Writer子类对象。FileWriter
后缀名是父类名。 前缀名是该流对象的功能。
*/

import java.io.*;

class FileWriterDemo 
{
	public static void main(String[] args)  throws IOException
	{
		FileWriter fw = new FileWriter("demo.txt");//默认在当前文件夹

		//调用write方法将字符串写入流中。
		fw.write("abcde");
		
		//刷新流对象中的缓冲中的数据。
		//将数据刷到目的地中。
		fw.flush();
		
		fw.write("yang");

		//关闭流，但是要先刷新一次。且此操作之后，不能再写入数据
		fw.close();

		//fw.write("aaaa");//error
	}
}
