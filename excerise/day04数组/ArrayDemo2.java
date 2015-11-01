class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[][] ar = new int[3][4];//定义了名称为arr的二维数组。二维数组中有3个一维数组
									//每一个一维数组中有四个元素。
									// int[][] ar ; int ar[][] ; int[] ar[]   三种等效
	    System.out.println(ar[0]); //[I@1d264bf5   标识的是二维数组的第一维。打印的是第一维第一个数的地址

        /*
		二维数组的初始化1
		*/
		int[][] arr = new int[3][];
		System.out.println(arr);  //[[I@1d264bf5  [[表示二维数组。
		
		System.out.println(arr[0]);//null 标识的是二维数组的第一维。打印的是第一维第一个数的地址。而第一维为null。数组为引用数据类型，默认初始化值为null
		arr[0] = new int[3]; 
		arr[1] = new int[1];
		arr[2] = new int[2];
		System.out.println(arr.length);   //打印的是二维数组的长度 3
		System.out.println(arr[0].length);////打印的是二维数组的第一维数组的长度 3
		/*
		二维数组的初始化2
		*/
		int [][] arr1 = {{3,5,1,7},{2,5,3},{6,2,4,8,1}};
        
		int sum = 0;
		for (int x = 0;x<arr1.length ;x++)
		{
			for (int y=0; y<arr1[x].length;y++ )
			{
				sum = sum + arr1[x][y];
			}
		}
		System.out.println("sum="+sum);
	}
		
}