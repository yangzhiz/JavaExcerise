/*
静态的应用

每一个应用程序中都有共性的功能，可以将这些功能进行抽取，独立封装，以便复用。

虽然可以通过建立ArrayTool对象使用这些工具方法，对数组进行操作。但是：
1、对象是用于封装数据的，可是ArrayTool对象并未封装特有数据。
2、操作数组的每一个方法都没有用到ArrayTool对象中的特有数据。

这是考虑，让程序更严谨，是不需要对象的。
可以将ArrayTool中的方法都定义成静态的。直接通过类名调用即可。
当然该类还是可以被其他程序建立对象的。为了更为严谨，我们强制该类不能建立对象。
所以通过将构造函数私有化完成。

接下来，将ArrayTool.class文件发送给其他人，其他人只要将该文件设置到classpath路径下，就可以使用该工具类。
但是，我们需要说明书告诉对方，该类中有多少个方法。

开始制作说明书。java的说明书通过文档注释来完成。再通过javadoc命令来生成说明书
*/


/**
这是一个可以对数组进行操作的工具类，该类中提供了获取最值的功能。
@author yangzhi
@version v1.1
*/
public class ArrayTool       //用public修饰后，才可以生成说明书。同样private方法也不会被javadoc提取。而public和protected修饰的方法可以
{
	/**
	空参数构造函数。
	*/
	private ArrayTool(){}
	/**
	获取一个整形数组中的最大值。
	@param arr 接受一个int类型的数组。
	@return    会返回一个该数组中的最大值。
	*/
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}
	/**
	获取一个整形数组中的最小值。
	@param arr 接受一个int类型的数组。
	@return    会返回一个该数组中的最小值。
	*/
	public static int getMin(int[] arr)
	{
		int min = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[min])
				min = x;
		}
		return arr[min];
	}
}

/*
一个类中默认会有一个空参数的构造函数。用户看不到的。
默认构造函数的权限是随着类的变化而变化。
*/
