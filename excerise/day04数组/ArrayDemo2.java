class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[][] ar = new int[3][4];//����������Ϊarr�Ķ�ά���顣��ά��������3��һά����
									//ÿһ��һά���������ĸ�Ԫ�ء�
									// int[][] ar ; int ar[][] ; int[] ar[]   ���ֵ�Ч
	    System.out.println(ar[0]); //[I@1d264bf5   ��ʶ���Ƕ�ά����ĵ�һά����ӡ���ǵ�һά��һ�����ĵ�ַ

        /*
		��ά����ĳ�ʼ��1
		*/
		int[][] arr = new int[3][];
		System.out.println(arr);  //[[I@1d264bf5  [[��ʾ��ά���顣
		
		System.out.println(arr[0]);//null ��ʶ���Ƕ�ά����ĵ�һά����ӡ���ǵ�һά��һ�����ĵ�ַ������һάΪnull������Ϊ�����������ͣ�Ĭ�ϳ�ʼ��ֵΪnull
		arr[0] = new int[3]; 
		arr[1] = new int[1];
		arr[2] = new int[2];
		System.out.println(arr.length);   //��ӡ���Ƕ�ά����ĳ��� 3
		System.out.println(arr[0].length);////��ӡ���Ƕ�ά����ĵ�һά����ĳ��� 3
		/*
		��ά����ĳ�ʼ��2
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