
/*
明白了BufferedReader类中特有方法readLine的原理后
可以自定义一个类中包含一个功能和readLine一致的方法。
来模拟一下BufferedReader
*/
import java.util.*;

class MyBufferedReader extends Reader
{
	private Reader r;
	MyBufferedReader(Reader r)
	{
		this.r = r;
	}
	//可以一次读一行数据的方法。
	public String myReadLine()
	{
		//定义一个临时容器。原BufferedReader封装的是字符数组。
		//为了演示方便。定义一个StringBuilder容器。因为最终还是要将数据变成字符串。
	}
}
class  MybufferedReaderDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
