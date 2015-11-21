/*
字符流：（Reader、Writer）

FileReader  （InputStreamReader）
FileWriter	（OutputStreamWriter）

BufferedReader
BufferedWriter

字节流：（InputStream、OutputStream）
FileInputStream 
FileOutputStream

BufferedinputStream
BufferedOutputStream

需求：想要操作图片数据。这时就要用到字节流。

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
