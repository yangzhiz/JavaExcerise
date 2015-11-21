/*
�������ļ���������д��

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
			fw = new FileWriter("demo.txt",true);//����һ�������������������е��ļ������������ļ���ĩβ������������д��

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

