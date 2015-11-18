/*
JDK1.5版本出现的新特性。

方法的可变参数。

注意：

在使用时注意，可变参数一定要定义在参数列表的最后面
*/

class ParamMethodDemo
{
	public static void main(String[] args) 
	{
		//show(3,4);


		//int[] arr = {3,4};
		//show(arr);
		//虽然少定义了多个方法。但是每次都要定义一个数组。作为实际参数。


		/*
		新特性：
		可变参数。其实就是上一种数组参数的简写形式。
		不弄每一次都手动的建立数组对象。
		只要将要操作的元素作为参数传递即可。
		隐式将这些参数封装成了数组。

		*/

		show("hah",2,3,4,5);


	}

	//public static void show(int... arr，String str)//编译失败
	public static void show(String str,int... arr) //编译通过
	{
		System.out.println(arr);
		System.out.println(arr.length);
	}
	/*
	public static void show(int a,int b)
	{
		System.out.println(a+","+b);
	}
	*/


	/*
	public static void show(int[] arr)
	{
	
	}
	*/
}
