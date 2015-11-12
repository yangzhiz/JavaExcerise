/*
声明包一定要写在程序最前面

javac -d . pack.PackageDemo  //-d 指定包存放的位置 . 表示当前文件夹 之后包会生成在当前文件夹

java pack.PackageDemo  //默认在当前目录找。若不在 则需要设置classpath


总结:
1、包与包之间进行访问，被访问的包之间的类以及类中成员，需要public修饰。

2、不同包中的子类还可以直接访问父类中被protected权限修饰的成员。
   包与包之间可以使用的权限只有两种，public    protected   （default）

权限：

               public       protected       default        private

同一个类中		ok				ok			ok			    ok

同一个包中		ok				ok			ok				x

子类			ok				ok			x				x

不同包中		ok				x			x				x



为了简化类名的书写，使用一个关键字：import  //尤其是包名过长的时候
import 导入的时包中的类。

d:\java\packb\DemoA.class
d:\java\packb\haha\DemoB.class

import packb.*    //此举只能导入DemoA.class，而与DemoB.class无关

建议不要写通配符 * ，需要用到哪个类就导入哪个类

建议定义包名不要重复，可以使用url完成定义，url是唯一的。
*/
package pack;//package pack.pack1.pack2


import haha.heihei.xixi.hiahia.DemoC;
import haha.heihei.xixi.hiahia.*;//当类不只有一个时
import packb.*;
import packa.*;


class PackageDemo
{
	public static void main(String[] args)
	{
		//System.out.println("Hello Package");
		//packa.DemoA d = new packa.DemoA();//DemoA d = new DemoA();//error
		//d.show();//当DemoB的method为public时，让A继承B，则通过A可以直接调用B中的方法


		//packb.DemoB d1 = new packb.DemoB(); //而其实主函数可以直接访问DemoB。但是当DemoB的method为protected时，则编译失败。当通过A继承时才可以使用B中方法。
		//d1.method();


		//haha.heihei.xixi.hiahia.DemoC c = new haha.heihei.xixi.hiahia.DemoC(); 费劲，导包后简化书写
		DemoC c = new DemoC();//注意当导入的不同包中有相同类名时，此处必须加包名。
	}
}

/*
javac -d . DemoA.java
javac -d . PackageDemo.java


DemoA d = new DemoA(); 
报错
E:\study\6研一\Others\JavaStudy\BXD\excerise\day10包>javac -d . PackageDemo.java
PackageDemo.java:13: 错误: 找不到符号
                DemoA d = new DemoA();
                ^
  符号:   类 DemoA
  位置: 类 PackageDemo
PackageDemo.java:13: 错误: 找不到符号
                DemoA d = new DemoA();
                              ^
  符号:   类 DemoA
  位置: 类 PackageDemo
2 个错误

错误原因：类名写错

因为类名的全名是  包名.类名


修正：packa.DemoA d = packa.DemoA();报错

PackageDemo.java:13: 错误: DemoA在packa中不是公共的; 无法从外部程序包中对其进行访问
                packa.DemoA d = packa.DemoA();//DemoA d = new DemoA();//error
                     ^
PackageDemo.java:13: 错误: 找不到符号
                packa.DemoA d = packa.DemoA();//DemoA d = new DemoA();//error
                                ^
  符号:   变量 packa
  位置: 类 PackageDemo
2 个错误

错误原因：有了包。范围变大，一个包中的类要被访问，必须要有足够大的权限。
所以被访问的类要被public修饰。

修正：public class DemoA  报错

PackageDemo.java:14: 错误: show()在DemoA中不是公共的; 无法从外部程序包中对其进行访问
                d.show();
                 ^
1 个错误

错误原因：类共有后，被访问的成员也要共有，才能被访问。

修正：public void show()

*/