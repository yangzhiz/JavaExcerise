class FunctionOverload
{
	public static void main(String[] args)
	{
		add(4,5);
		add(4,5,6);
	}
	//����һ���ӷ����㣬��ȡ���������ĺ�
	public static int add(int x,int y)
	{
		return x+y;
	}
	public static int add(int x,int y,int z)
	{
		return x+y+z;
	}
}