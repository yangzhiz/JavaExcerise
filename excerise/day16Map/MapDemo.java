/*
Map集合：该集合存储键值对。一对一对往里存，且要保证键的唯一性。

	1、添加。
		put(K key, V value); //注意返回的是：以前与 key 关联的值，若没有，返回null。
							 //当存入的键已经存在时，新的值会覆盖旧的值。

		putAll(Map<? extends K,? extends V> m);
	2、删除。
		clear();
		remove(Object key); //移除键，返回键对应的值。
	3、判断。
		containsValue(Object value);
		containsKey(Object Key);
		isEmpty();
	4、获取。
		get(Object key);
		//也可以通过get方法的返回值来判断一个键是否存在。（返回值是否为null ）
		size();
		values();

		entrySet();
		keySet();

Map
	|--Hashtable:底层是哈希表数据结构，不可以存在null键null值。该集合是线程同步的。效率低。JDK1.0（面试）
	|--HashMap：底层是哈希表数据结构，允许使用null键null值。该集合是不同步的。效率高。JDK1.2（面试）
	|--HashTree:底层是二叉树数据结构，线程不同步。可以给集合中的键进行排序。

Map与Set很像。
Set底层就是使用了Map方法。

什么时候使用Map集合呢？
当数据之间存在着映射关系时，就要首先想到Map集合。
*/

class MapDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
