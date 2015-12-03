/*
没有方法的接口称之为 标记接口

静态是不能被序列化的。

对于非静态的成员变量，加上关键字 transient 则变量同样无法被序列化
*/
import java.io.*;

class Person implements Serializable 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
