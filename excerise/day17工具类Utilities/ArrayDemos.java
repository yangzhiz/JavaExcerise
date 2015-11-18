/*
Arrays:用于操作数组的工具类。

里边都是静态方法。

asList: 将数组变成List集合。
		这样就可以使用集合中的思想和方法来操作数组中的元素。(contains get indexOf() subList())

	String[] arr = {"abc","def","omg"};
	List<String> list = Array.asList(arr);

注意：将数组变成集合后，不可以使用集合的增删方法。否则报错：UnsupportedOperationException
	  因为数组的长度是固定的。

	  如果数组中的元素都是对象。那么变成集合时，数组中的元素就直接转成集合中的元素。
	  如果数组中的元素都是基本数据类型，那么会将该数组作为集合中的元素存在。
	  注意区别： int[] nums = {2,4,5};
				 Integer[] num = {3,4,5};
*/

class ArrayDemos 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
