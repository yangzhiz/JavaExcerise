
import java.io.*;

class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		//����һ���ļ���ȡ�����󣬺�ָ���ļ������ļ��������
		//Ҫ��֤���ļ����Ѿ����ڵģ���������ڣ��ᷢ���쳣FileNotFoundException

		FileReader fr = new FileReader("demo.txt");

		//���ö�ȡ�������read������
		//read():һ����һ���ַ������һ��Զ����¶�����������ĩβ���򷵻�-1
		
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
