/*
StringBuffer是字符串缓冲区。
是一个容器。

注意：
1、长度是可变化的
2、可以操作多个数据类型
3、最终会通过toString方法变成字符串

CURE  create update read delete

1、存储。
   StringBuffer append(String); //将指定数据作为参数添加到已有数据的结尾处。注意返回的仍为容器类型。sb.append("dasd").append("asda")....
   StringBuffer insert(insert,String)  //将数据插入到指定index位置。
2、删除。
	StringBuffer delete(startindex,endindex):删除缓冲区中数据，包头不包尾
	StringBuffer deleteCharAt(index):删除缓冲区中指定位置的数据
3、获取。
    char charAt(index);
	int indexOf(String);
	int lastIndexOf(String);
	int length();
	String substring(start,end);
4、修改。
	void setCharAt(index,char);
	StringBuffer replace(start,end,string); 
5、反转。
    StringBuffer reverse();
6、将缓冲区中指定数据存储到指定字符数组中
	void getChars(int srcBeginIndex, int srcEndIndex, char[] dst, int dstBeginIndex) 
 
在JDK1.5版本之后，出现了StringBuilder。

StringBuffer是线程同步。		 适合于多线程
StringBuilder是线程不同步。      适合于单线程
以后开发建议使用StringBuilder 提高效率。

升级三要素：
1、提高效率
2、简化书写
3、提高安全性

*/

class StringBuffer 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
