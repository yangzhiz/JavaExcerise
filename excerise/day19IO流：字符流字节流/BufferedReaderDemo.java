/*
字符读取流缓冲区：

该缓冲区提供了一次读一行的方法，方便于对文本数据的获取。
当返回null时，表示读到文件末尾。

readLine();读取一个文本行。

readLine方法返回的时候只返回回车符之前的数据内容。并不返回回车符。（不包括行终止符）

readLine方法的原理：无论是读一行，还是读取多个字符。最终都是在硬盘上一个一个读取。
所以最终使用的还是read一次读一个的方法。


*/

import java.io.*;

class BufferedReaderDemo 
{
	public static void main(String[] args) 
	{
		//创建一个读取流对象和文件相关联

		//为了提高效率。加入缓冲技术。将字符读取流对象作为参数传递给缓冲对象的构造函数。
	}
}
