/*
Properties是hashtable的子类。
也就是说它具备了map集合的特点，而且它里边存储的键值对都是字符串。

是集合中和IO技术现结合的集合容器。

该对象的特点是：可以用于键值对形式的配置文件。

那么在加载数据时，需要数据有固定格式，键=值

----加载流数据-----
 void load(InputStream inStream) 
          从输入流中读取属性列表（键和元素对）。 
 void load(Reader reader) 
          按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。 

----将集合中的数据存储在流中，从而存储到指定文件中----
 void store(OutputStream out, String comments) 
          以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。 
 void store(Writer writer, String comments) 
          以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。 

*/
class PropertiesDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	//演示，如何将流中的数据存储到集合中。
	//想要将info.txt中的键值对数据存储到集合中进行操作。
	/*
	思路：
	1、用一个流和info.txt文件关联
	2、读取一行数据，将该行数据用"="进行切割。
	3、等号左边作为键，右边为值。存入到Properties集合中。
	*/
}



















