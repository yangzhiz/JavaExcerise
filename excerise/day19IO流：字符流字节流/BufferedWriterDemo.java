/*
缓冲区的出现是为了提高流的操作效率而出现的。

所以在创建缓冲区之前，必须要先有流对象。
*/

class BufferedWriterDemo 
{
	public static void main(String[] args) 
	{
		//创建一个字符写入流对象。
		//为了提高字符写入流效率。加入缓冲技术。
		//只要将需要被提高效率的流对象作为参数传递给缓冲区的构造函数即可。

		//记住只要用到缓冲区，就要记得刷新。

		//buffer.newLine();//解决了跨平台时的换行问题，且只有缓冲区有。

		//其实关闭缓冲区就是在 关闭缓冲区中的流对象。

		
	}
}
