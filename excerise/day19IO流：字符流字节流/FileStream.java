/*
�ַ�������Reader��Writer��

FileReader  ��InputStreamReader��
FileWriter	��OutputStreamWriter��

BufferedReader
BufferedWriter

�ֽ�������InputStream��OutputStream��
FileInputStream 
FileOutputStream

BufferedinputStream
BufferedOutputStream

������Ҫ����ͼƬ���ݡ���ʱ��Ҫ�õ��ֽ�����

*/

import java.io.*;

class FileStream
{
	public static void main(String[] args) throws IOException
	{
		writeFile();
	}

	public static void writeFile() throws IOException
	{
		FileOutputStream fos = new FileOutputStream("fos.txt");
	
		fos.write("abcde".getBytes());
		
		fos.close();
	}
}
