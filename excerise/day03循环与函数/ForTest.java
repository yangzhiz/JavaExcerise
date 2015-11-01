class ForTest
{
	public static void main(String[] args)
	{
		/*
		for(System.out.println("a");System.out.println("b");System.out.println("c"))
		{
		   System.out.println("d");
		}
	    //编译失败，因为条件表达式既不是true也不是false。应该为boolean类型
		*/

		int x = 1;
		for(System.out.println("a");x<3;System.out.println("c"))
		{
		   System.out.println("d");
		   x++;
		}//执行结果 adcdc

		for(;x<3;System.out.println("c"),x++)//初始化表达式可以为空；操作表达式可以没有或者有多个，用逗号隔开
		{
		   System.out.println("d");
		   x++;
		}//执行结果 adcdc
	}
}