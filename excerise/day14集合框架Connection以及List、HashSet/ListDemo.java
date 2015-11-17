/*
Collection

    |--List:元素是由有序的，元素可以重复。因为该集合体系有索引。
		|--ArrayList：底层的数据结构使用的是数组结构。特点：查询迅速。插入删除稍慢。线程不同步。效率更高。
		|--LinkedList：底层使用的是链表数据结构。特点：插入删除迅速。查询稍慢。
		|--Vector：底层是数组数据结构。等同于ArrayList。但是线程同步。被ArrayList替代。

	|--Set：元素是无序的，元素不可以重复。没有索引。

List:
特有方法：凡是可以操作角标（索引）的方法都是List特有的方法。

增
	add(index,element);
	addAll(index,Collection);
删
	remove(index);
查
	set(index,element);
改
	get(index);
	subList(fromindex,toindex);
	listIterator();

List集合特有的迭代器。listIterator是Iterator的子接口。

在迭代时，不可以通过集合对象的方法操作集合中的元素。
因为会发生ConcurrentModificationException异常。

所以，在迭代时，只能用迭代器的方法操作元素。但是Iterator的方法有限。
只能进行判断（hasNext();），取出（next();），和删除（remove();）
如果想要其他的操作如添加，修改等，就需要使用其子接口listIterator。
该接口只能通过list集合的listIterator方法获取。
*/

import java.util.*;

class ListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");
		System.out.println(al);
	

		//需求：在迭代过程中，准备添加或者删除元素。
	
		ListIterator li = al.listIterator();

		System.out.println(li.hasNext());  //true
		System.out.println(li.hasPrevious()); //false

		while(li.hasNext())
		{
			Object obj = li.next();

			if(obj.equals("java02"))
			li.set("java007");//~~~~~~
			//li.add("java009");
			System.out.println(obj);
		}


		System.out.println(al);
		System.out.println(li.hasNext()); //false
		System.out.println(li.hasPrevious());//true
		/*	
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();

			if(obj.equals("java02"))
			
			a1.add("java008");//it.next();（迭代器的方法）与a1.add("java008");（集合的方法）属于对元素的并发修改，会产生安全隐患，报错。

			it.remove();//将java02的引用从集合中删除。但是obj依然指向它，所以仍然能够打印出来。
			
			System.out.println(obj);
		}
		*/

	}
}
