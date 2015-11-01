class FunctionOverload
{
	public static void main(String[] args)
	{
		add(4,5);
		add(4,5,6);
	}
	//定义一个加法运算，获取两个整数的和
	public static int add(int x,int y)
	{
		return x+y;
	}
	public static int add(int x,int y,int z)
	{
		return x+y+z;
	}
}