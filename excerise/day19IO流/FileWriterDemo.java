/*
�ַ������ֽ�����

�ֽ������������ࣺ

InputStream  OutputStream

�ַ������������ࣺ

Reader       Writer

��ȻIO���ǲ������ݵģ�
��ô���ݵ����������ʽ�ǣ��ļ���

���Բ����ļ�Ϊ������ʾ��

������Ӳ���ϣ�����һ���ļ���д�����ݡ�

�ҵ�ר�Ų����ļ���Writer�������FileWriter
��׺���Ǹ������� ǰ׺���Ǹ�������Ĺ��ܡ�
*/

import java.io.*;

class FileWriterDemo 
{
	public static void main(String[] args)  throws IOException
	{
		FileWriter fw = new FileWriter("demo.txt");//Ĭ���ڵ�ǰ�ļ���

		//����write�������ַ���д�����С�
		fw.write("abcde");
		
		//ˢ���������еĻ����е����ݡ�
		//������ˢ��Ŀ�ĵ��С�
		fw.flush();
		
		fw.write("yang");

		//�ر���������Ҫ��ˢ��һ�Ρ��Ҵ˲���֮�󣬲�����д������
		fw.close();

		//fw.write("aaaa");//error
	}
}
