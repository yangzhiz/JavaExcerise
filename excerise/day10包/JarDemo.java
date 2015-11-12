/*
命令： jar

jar -cf haha.jar packa packk //将packa packk压缩至haha.jar包
jar -tf haha.jar   //观察jar包中的文件

jar -tf haha.jar >d:\haha.txt  //将dos下的输出信息放入d盘下的haha.txt文件夹 数据重定向
如果压缩后删除了原有的包文件夹，则需要将jar包放到classpath下。才可以继续访问。
*/

package packk;

import packa.*; 

class  JarDemo
{
	public static void main(String[] args) 
	{
		DemoA a = new DemoA();
		a.show();
		System.out.println("Hello jar pack");
	}
}
