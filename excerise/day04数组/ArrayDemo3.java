class ArrayDemo3
{
	public static void main(String[] args)
	{
		int[] arr = {2,4,6,8,3,6};
		//要打印数组中 的值，通常要用到遍历。
		for (int x=0;x<arr.length;x++)  //利用 数组名称.length  可以直接获取数组长度
		{
			System.out.println("arr["+x+"]="+arr[x]+";");
		}

		printArray(arr);

		System.out.println(arr);//[I@32a88bc2  表示数组类型的引用，存放的是Int类型。 [-数组 I-Int类型 @-引用 32a88bc2-数组的内存存放地址（哈希算法得出的哈希值：十六进制值）
	}
	//定义功能，用于打印数组中元素。元素之间用逗号隔开。
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");	
		}
	}
}