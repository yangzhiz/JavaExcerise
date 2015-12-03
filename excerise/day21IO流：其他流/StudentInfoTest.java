/*
有五个学生，每个学生有3门课的成绩
从键盘输入以上数据（保罗姓名，三门课成绩）
输入的格式：如：yang,99,98,100 计算出总成绩
并把学生的信息和计算出的总分数按高低顺序存放在磁盘文件“stud.txt”中

1、描述学生对象。
2、定义一个可操作学生对象的工具类。

思想：
1、通过获取键盘录入的一行数据，并将该行中的信息取出封装成学生对象。
2、学生对象有很多，那么就需要存储，使用到集合。因为要对学生的总分排序。
	所以可以使用TreeSet。
3、将集合的信息写入到一个文件中。



*/
import java.io.*;
import java.util.*;

class StudentInfoTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
