class ArrayDemo
{
	public static void main(String[] args)
	{
		//元素类型[] 数组名 = new 元素类型[元素个数或数组长度]；或者 元素类型 数组名[]  = new 元素类型[元素个数或数组长度]；
		int[] x = new int[3]; //x为数组类型，并非int类型
        int[] arr = new int[]{3,1,6,5,4}; //等价于 int[] arr = {3,1,6,5,4};

		System.out.println(x[0]);//0

		int[] arr1 = new int[3]; 
		System.out.println(arr1[3]);//编译成功，运行失败：ArrayIndexOutOfBoundsException:3 操作数组时，访问到了数组中不存在的角标。
		arr1 = null;
		System.out.println(arr1[1]);//编译成功，运行失败：NullPointerException:空指针异常：当引用没有任何指向，即值为null的情况，该引用还在用于操作实体。
	}
}