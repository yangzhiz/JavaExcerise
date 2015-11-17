/*

TreeSet：可以对Set集合中的元素进行排序。
		 底层数据结构是二叉树。
		 保证元素唯一性的依据：compareTo方法 return 0;若为0，表示两个对象完全相同。

		 TreeSet排序的第一种方式：让元素自身具备比较性。元素需要实现compareTo方法。
		 元素需要实现compareTo接口。覆盖compareTo方法。
		 也称这种方法为元素的自然顺序，或者叫做默认顺序。

		 TreeSet排序的第二种方式：当元素自身不具备比较性时，或者具备的比较性不是所需要的。
		 这时需要让集合自身具备比较性。
		 在集合初始化时就有了比较方式。


当元素自身不具备比较性。或者具备的比较性不是所需要的。
这时需要让容器自身具备比较性。
定义一个比较器，将比较器对象作为参数传递给TreeSet集合的构造函数。

当两种比较都存在时，以比较器为主。

定义一个类，实现Comparator接口，覆盖compare方法。

而对象实现的Comparable接口，覆盖的是compareTo方法。

*/

class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
