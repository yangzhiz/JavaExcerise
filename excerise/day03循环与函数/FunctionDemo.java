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
	//��ƺ�����֤���������Ƿ���ͬ
    public static boolean compare(int a,int b)
	{
		if(a==b)
			return true;
		return false; 
		// return (a==b)?true:false;
		// retrun a==b; ���ַ����Կɣ����һ����ã��Ǵ����Ż��Ľ����
	}
}