/*
File类的常见方法：
1、创建。
	boolean createNewFile(); //在指定位置创建文件，如果该文件已经存在，则不创建，返回false。
							和输出流不一样，输出流对象一建立就会创建文件。而且文件已经存在，会覆盖。
	boolean mkdir();	//创建文件夹。
	boolean mkdirs();	//创建多级文件夹

2、删除。
	boolean delete();  //删除失败，返回false
	deleteOnExit();   //在程序退出时，删除指定文件。

3、判断。
	boolean canExecute();
	boolean exists();  //文件是否存在

	isDirectory();
	isFile();		//在判断文件对象是否为文件或者目录时，必须要先判断该文件对象封装的内容是否存在。（即 exists();）
	
	isHidden();		//是否为隐藏文件
	isAbsolute();	//是否为绝对路径
4、获取信息。

	String getName();	//
	String getPath();	//相对路径
	String getParent(); //该方法返回的是绝对路径中的父目录。如果获取的是相对路径，返回null
						//如果相对路径中有上一层目录，那么该目录即为返回结果。
	File   getParentFile();	//
	String getAbsolutePath();	//绝对路径

	long  lastModified(); //返回文件最后一次被修改的时间。
	long  length();		//返回文件大小





*/
class FileDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public static void consMethod()
	{
		Files f = new File("a.txt");
	}

	public static void method_1()
	{

	}
}
