/*
File[]   listRoots();	//列出可用的文件系统根。 

String[] list(); //注意调用list方法的file对象必须是封装了一个目录。该目录还必须存在。 

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
