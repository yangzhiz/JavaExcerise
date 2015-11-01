/*
先初始化对象。
称为：饿汉式。
class Single
{
	private static Single s = new Single();
	private Single(){}
	public static Single getInstance
	{
		return s;
	}
} 
*/

/*
对象是方法被调用时，才初始化，也叫做对象的延时加载。
称为：懒汉式。
*/
class Single
{
	private static Single s = null;
	private Single(){}
	public static Single getInstance() 
	{
		if(s==null)
		     s = new Single();
		return s;
	}
}
class SingleDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
