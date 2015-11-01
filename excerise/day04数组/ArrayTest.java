class ArrayTest
{
	/*
	获取数组中的最大值:1、遍历 2、比较 3、通过定义的变量存储每次比较的最值
	*/
	public static void main(String[] args)
	{
		int[] arr = {2,6,23,8,43,23,56,23,4}; 
		int max = getMax(arr);
		System.out.println("max="+max);
		int max1 = getMax_2(arr);
		System.out.println("max="+max1);
	}
	public static int getMax(int[] arr)
	{
		int max = 0;
		for (int x=0;x<arr.length ;x++ )
		{
			if(arr[x]>max)
				max = arr[x];
		}
		return max;
	}
	public static int getMax_2(int[] arr)
	{
		int max = arr[0];
		for (int x=0;x<arr.length ;x++ )
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}
}