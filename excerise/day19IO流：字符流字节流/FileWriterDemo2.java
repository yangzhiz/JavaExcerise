/*
��׼IO�쳣����ķ�ʽ��


*/

import java.io.*;

class FileWriterDemo2
{
	public static void main(String[] args) 
	{
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("demo.txt");
			fw.write("dasdasd");
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
