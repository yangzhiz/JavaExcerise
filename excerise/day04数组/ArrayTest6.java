class ArrayTest6
{
	public static void main(String[] args)
	{
		toHex(60);
	}
    /*
	查表法：将所有的元素临时存储起来。建立对应关系。
	每一次&15以后作为索引去查表。找到对应的元素。

	这个表怎么建立？
	可以通过数组的形式来定义

	可通过StringBuffer 正序输出
    或者使用数组来完成存储！
	*/
	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[8]; //注意：字符在内存中被定义后的默认初始化值为'\u0000'，即空位
		int pos = arr.length;
		while(num!=0)
		{
			int temp = num &15;
			//System.out.println(chs[temp]);
			arr[--pos] = chs[temp];
			num = num >>>4;
		}
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}
}