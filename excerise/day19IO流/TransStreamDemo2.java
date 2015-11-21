
/*
1、需求：
源：键盘录入
目的：控制台

2、需求：想把键盘录入的数据存储到一个文件中。

源：键盘
目的：文件

3、需求：想要将一个文件的数据打印在控制台上

源：文件
目的：控制台

总结：流操作的基本规律

最痛苦的就是流对象有很多，不知道该用哪一个！


三个明确：

1、明确源和目的
	源：输入流。	InputStream \ Reader
	目的：输出流。  OutputStream \ Writer
2、操作的数据是否是纯文本。
	是：字符流
	不是：字节流
3、当体系明确后，再明确要使用那个具体对象。
	通过设备来进行区分：
	源设备：内存，硬盘，键盘
	目的设备：内存，硬盘，控制台

设计：

1、将一个文本文件的数据存储到另一个文件中。（复制文件）

	源： 因为是源，所以使用读取流。 InputStream Reader
		 操作的是文本文件，所以使用Reader

			接下来明确要使用该体系中哪个对象。
			明确设备：硬盘上的文件
			Reader体系中可以操作文件的对象是FileReader

				是否需要提高效率：加入Reader体系中的缓冲区

	FileReader fr = new FileReader("a.txt");

	BufferedReader bufr = new BufferedReader(fr);

	目的：OutputStream Writer
			   操作的是文本文件，所以使用Writer
			   设备：硬盘，一个文件。
			   Writer体系中可以操作文件的对象是FileWriter

				是否需要提高效率：加入Reader体系中的缓冲区

	FileWriter fw = new FileWriter("b.txt");

	BufferedWriter bufr = new Bufferedwriter(fw);

练习：将一个图片文件的数据存储到另一个文件中。（复制文件）

2、需求：将键盘录入的数据保存到一个文件中。
	源： InputStream Reader
		是纯文本 Reader

		设备：键盘。对应的对象是 System.in
			  然而System.in 对应的是字节流啊
			  为了操作键盘的文本数据方便。需要转成字符流，按字符串操作更加方便
			  所以既然明确了Reader，就将System.in转成Reader
			  用到了Reader体系中的转换流：InputStreamReader

			  InputStreamReader isr = new InputStreamReader(System.in)

			  需要提高效率吗？

			  BufferedReader bufr = new Bufferedreader(isr);

	目的：OutputStream Writer
			是纯文本 Writer
		
		设备：硬盘 一个文件  FileWriter

		FileWriter fw = new FileWriter("c.txt");

		需要提高效率吗？
		BufferedWriter bufw = new BufferedWriter(fw);

***********************************************************************************
		扩展：想要把录入的数据按照指定的编码表（utf-8），将数据存到文件中。

			
			目的：OutputStream Writer
					是纯文本 Writer
				
				设备：硬盘 一个文件  FileWriter
				但是FileWriter使用的默认编码表。GBK

				但是存储时需要加入指定的编码表，而指定的编码表需要用到转换流
				所以要用的对象是OutputStreamWriter.
				但是对象要接受一个字节输出流。而且还可以操作文件的字节输出流 FileOutputStream

				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d.txt"),"UTF-8");

				需要高效么？
				Bufferedwriter bufw = new BufferedWriter(osw);

				所以，记住。转换流什么时候使用。字符和字节之间的桥梁，通常，涉及到字符编码转换时，需要转换流。





*/

import java.io.*;
class TransStreamDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
