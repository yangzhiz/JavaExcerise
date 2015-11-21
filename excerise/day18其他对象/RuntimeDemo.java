/*
Runtime对象
该类并没有提供构造函数
说明不可以new对象。直接想到该类中的方法都是静态的
发现该类中还有非静态方法。
说明该类肯定会提供方法获取本类对象，而且该方法是静态的，返回值类型是本类类型。

由这个特点可以看出该类使用了单利设计模式完成。

该方法是static Runtime getRuntime();

*/
class RuntimeDemo 
{
	public static void main(String[] args) throws Exception
	{
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("D:\\StudyTools\\Git-2.6.1-64-bit\\Git\\git-bash.exe");//打开git-bash
		
		Process p1 = r.exec("notepad.exe  SystemDemo.java");

		Thread.sleep(4000);
		p.destroy();
	}
}
