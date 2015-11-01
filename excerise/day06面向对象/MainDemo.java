/*
public static void main(String[] args)
主函数：是一个特殊的函数。作为程序的入口，可以被jvm调用

定义：
public： 代表着该函数访问权限是最大的。
static： 代表主函数随着类的加载就已经存在了。
void:    主函数没有具体的返回值。
main:    不是关键字，但是是一个特殊的单词，可以被jvm识别
(String[] arr):函数的参数，参数类型是一个数组，该数组中的元素是字符串。即字符串类型的数组。 arr可以自己起 arg==arguments

主函数是固定格式的：jvm只识别此格式。

JVM调用主函数，传递的实参是什么呢？   只有两种情况：null；或者是数组实体
-------[Ljava.lang.String;@3d44d0c6说明传递了一个数组,且长度为0。即new String[0]

注意：java MainDemo yangzhi
*/
class MainDemo
{
	public static void main(String[] args)  //jvm只识别此格式的主函数:public static void main(String[] xxx)
	{
		System.out.println("hello");
		System.out.println(args);		   //[Ljava.lang.String;@3d44d0c6
		System.out.println(args.length);
		System.out.println(args[0]);       //如果执行java MainDemo，则会失败，因为数组长度为0，此举越界
										   //如果执行java MainDemo yangzhi 则会输出yang。因为在输入java 后，会调用虚拟机。而在虚拟机调用MainDemo类时，又会调用main方法，并传递yang zhi这些参数。
	    String[] arr = {"1","2","3","4","5"};
		MainTest.main(arr);
	}
    public static void main(int x)         //编译通过，相当于函数重载
	{
		System.out.println("hello");       //并不会执行
	}
}
class MainTest
{
	public static void main(String[] args)
	{
		for(int x=0; x<args.length;x++)
			System.out.println(args[x]);   // 1 2 3 4 5 
	}
}