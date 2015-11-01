class OperateDemo2
{
	public static void main(String[] args)
	{
		int x = 3; //右边赋值给左边
		x += 3;    // 左右之和赋值给左边 x = x + 4;

		short s = 4;
		// s = s + 5; // X   四个八位(int) 无法赋值给 两个八位(short) 丢失精度
		s+=5;     //√    一次赋值运算，区别在于+=会做自动转换   

		int a,b,c;
		a=b=c=5;
   
		System.out.println(3>4); //false（输出）
		System.out.println(3!=4) //true  比较运算符的输出为 true 和 false

	}
}