class FunctionDemo
{
	public static void main(String[] args)
	{
	   int s = getSum();
	   System.out.println(s);
	   int sum = getSum(2,6);
	   System.out.println(sum);
	   boolean b = compare(3,4);
	   System.out.println(b);

	}
	public static int getSum()
	{
		return 3+4;
	}
	public static int getSum(int x, int y)
	{
		return x+y;
	}
	//设计函数，证明两个数是否相同
    public static boolean compare(int a,int b)
	{
		if(a==b)
			return true;
		return false; 
		// return (a==b)?true:false;
		// retrun a==b; 三种方法皆可，最后一种最好，是代码优化的结果。
	}
}