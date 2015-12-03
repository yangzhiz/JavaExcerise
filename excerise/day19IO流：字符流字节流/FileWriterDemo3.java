/*
对已有文件的数据续写。

FileWriter(String fileName, boolean append)

*/

import java.io.*;

class FileWriterDemo3
{
	public static void main(String[] args) 
	{
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("demo.txt",true);//传递一个参数，代表不覆盖已有的文件。并在已有文件的末尾处进行数据续写。

			fw.write("hello\r\nhandsome");
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try
			{
				if(fw!=null)
				fw.close();
			}
			catch (IOException e)
			{
				System.out.println(e.toString());
			}
			
		}
	}
}

