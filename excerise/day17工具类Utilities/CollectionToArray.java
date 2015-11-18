/*
集合变数组。
Collection接口中的toArray方法。



*/

import java.util.*;

class CollectionToArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("yang");
		al.add("yan");
		al.add("ya");

		String[] arr = al.toArray(new String[1]);

		System.out.println(Arrays.toString(arr));//[yang, yan, ya]

		String[] arr1 = al.toArray(new String[5]);

		System.out.println(Arrays.toString(arr1));//[yang, yan, ya, null, null]

		/*
		1、指定类型的数组到底要定义多长呢？
			当指定类型的数组长度小于集合的size，那么该方法内部会创建一个新的数组。长度为集合的size。
			当指定类型的数组长度大于了集合的size，就不会新创建数组。而是使用传递进来的数组。
			所以创建一个刚刚好的数组最优。
			String[] arr1 = al.toArray(new String[al.size()]);

		2、为什么要将集合变数组呢？
		为了限定对元素的操作。不允许进行增删。
		*/
	}
}
