
import java.io.*;

class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		//创建一个文件读取流对象，和指定文件名的文件相关联。
		//要保证该文件是已经存在的，如果不存在，会发生异常FileNotFoundException

		FileReader fr = new FileReader("demo.txt");

		//调用读取流对象的read方法。
		//read():一个读一个字符。而且会自动往下读。到达流的末尾，则返回-1
		
		/*
		int ch = fr.read();
		
		System.out.println("ch="+(char)ch);
		*/
		int ch1 = 0;

		while((ch1=fr.read())!=-1)
		{
			System.out.println((char)ch1);
		}

		fr.close();

		/*
		while(true)
		{
			int ch1 = fr.read();
			if(ch1==-1)
				break;
			System.out.println("ch1="+(char)ch1);
		}
		
		*/
	}
}
