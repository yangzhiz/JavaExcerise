/*

Set集合的功能和Collection是一致的。

|--Set：元素是无序的（存入和取出的顺序不一定一致），元素不可以重复。没有索引。

	|--HashSet：底层数据结构是哈希表。线程是非同步的。
	
		Set集合的功能和Collection是一致的。
			
		HashSet是如何保证元素的唯一性的呢？
		是通过元素的两个方法，hashCode和equals来完成。
		如果元素的HashCode值相同，才会判断equals是否为true。
		如果元素的HashCode的值不同，不会调用equals。

		注意：对于判断元素是否存在，以及删除操作，依赖的方法是元素的hashCode和equals方法。
			  而ArrayList是依赖于equals方法。

记住，排序时，当主要条件相同时，一定要判断下次要条件。

	|--TreeSet：可以对Set集合中的元素进行排序。


*/

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
