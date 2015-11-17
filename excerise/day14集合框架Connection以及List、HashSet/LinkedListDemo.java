/*
LinkedList:特有方法。

addFirst();//每次添加的元素都置于集合首位
addLast();
------>offerFirst()：JDK1.6更新
------>offerLast()

getFirst();//印该方法显示的是首位的元素，集合为空则抛出异常。NoSuchElementException。
getLast();
------>peekFirst():获取第一个元素，为空则返回null
------>peekLast()

removeFirst();//印该方法显示的是remove的元素,同时元素被删除。
removeLast();
------>pollFirst():获取并移除第一个元素，为空则返回null
------>pollLast()

*/
import java.util.*

class LinkedListDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
