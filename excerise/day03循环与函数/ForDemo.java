class ForDemo
{
	public static void main(String[] args)
	{
		for(int x=0; x<3;x++)
		{
		   System.out.println("x="+x);
		}
	    //System.out.println("x="+x);//X 变量在定义是有自己的作用域，x只在大括号内有效，而while语句是在循环体外定义变量。
		                             //for和while可以互换，但for对内存更加优化，因为执行完循环后，变量不再占用内存
	}
}