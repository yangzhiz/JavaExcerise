/*
Map集合的取出方式：

1、Set<k的类型> keySet:将Map中所有的键存入到Set集合。因为Set具备迭代器。因此可以用迭代方式取出所有的键，
						根据get方法。获取键对应的值。

   取出原理：将Map集合转成Set集合。在通过迭代器取出。

2、Set<Map.Entry<k的类型,v的类型>> entrySet:将Map集合中的 映射关系 存入到Set集合中，我们把映射关系的数据类型定义为 Map.Entry<>。  注意泛型的嵌套。
   


*/
class MapDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
