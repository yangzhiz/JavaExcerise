/*
�ڶ��ַ�ʽ��ͨ���ַ�������ж�ȡ��
*/

import java.io.*;

class FileReaderDemo2 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("demo.txt");

		//����һ���ַ������顣���ڴ洢�������ַ���
		//��read(char[]) ���ص��Ƕ������ַ�������
		
		char[] buf = new char[1024];
		
		int num =0;

		while((num=fr.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,num));
		}
/*
		
		
		int num = fr.read(buf);
		
		System.out.println("num="+num+"..."+new String(buf));//num=2...ab
		
		int num1 = fr.read(buf);
		
		System.out.println("num1="+num1+"..."+new String(buf));//num1=2...cd
		
		
		int num2 = fr.read(buf);
		
		System.out.println("num2="+num2+"..."+new String(buf));//num2=1...ed
		
		int num2 = fr.read(buf);
		
		System.out.println("num2="+num2+"..."+new String(buf,0,num2));//num2=1...e
		
		int num3 = fr.read(buf);
		
		System.out.println("num3="+num3+"..."+new String(buf));//num3=-1...ed

*/
		fr.close();
	}
}
