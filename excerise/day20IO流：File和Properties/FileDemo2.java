/*
File[]   listRoots();	//�г����õ��ļ�ϵͳ���� 

String[] list(); //ע�����list������file��������Ƿ�װ��һ��Ŀ¼����Ŀ¼��������ڡ� 

String[] list(FilenameFilter filter); 
*/

import java.io.*;
class FileDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public static void listRootsDemo()
	{
		File[] files = File.listRoots();
	}
}
