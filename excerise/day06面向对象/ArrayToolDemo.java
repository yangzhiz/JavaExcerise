class ArrayToolDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,124,23242,1121,4,121};
		/*
		ArrayTool tool = new ArrayTool();   //在编译时，虚拟机会检测到其他类ArrayTool。此时会在指定目录/当前目录下寻找ArrayTool.class文件，若没有，则会找ArrayTool.java。两者只要保留其一，此程序就可运行。
		int max = tool.getMax(arr);
		*/
		int max = ArrayTool.getMax(arr);    //在ArrayTool中方法变为静态之后，便可以通过类直接调用。不需要创建多余的对象。
		System.out.println("max="+max);
	}
}
