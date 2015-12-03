/*
创建图形化界面：
1、穿件frame窗体
2、对窗体进行基本设置。大小，位置，布局（流式布局，边界式布局）
3、定义组件
4、将组件通过窗体的add方法添加到窗体中
5、让窗体显示，通过setVisible(true)

---------------------------------------------------------------------------------
时间监听机制的特点：

1、事件源
	就是安awt包或者swing包中的那些图形界面组件
2、事件
	每一个事件源都有自己特有的对应事件和共性事件（鼠标键盘事件）
3、监听器
	将可以触发某一个事件的动作（可能不止一个）都已经封装到了监听器中

-------以上三者在java中都已经定义好，直接获取其对象来用即可。我们要做的是动作处理

4、事件处理


*/

import java.awt.*;
import java.awt.event.*;  //通过事件监听产生效果 用到此包


class AwtDemo 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("my awt");  //默认为边界式布局
		f.setSize(500,100);
		f.setLocation(600,500);    //原点为屏幕左上角
		f.setLayout(new FlowLayout());

		Button b = new Button(" i am a new button");
		



		f.add(b);
		
		//3、设置监听器myWin，而且MyWin封装了触发事件的动作。
		//（MyWin继承了windowAdapter适配器，而windowAdapter实现了WindowListener接口。WindowListener接口定义了window的诸多动作）
		
		//适配器的存在只是为了方便创建监听器对象，当listener只有一个方法时，并不需要适配器
		
		f.addWindowListener(new MyWin());    //public void addWindowListener(WindowListener l) 参数为一个接口
		
		/*
		匿名内部类：
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("我关");
				System.exit(0);
			}
			public void windowActivated(WindowEvent e) //窗体前置触发此事件
			{
				System.out.println("我活辣");
			}
			public void windowOpened(WindowEvent e)    //打开窗体触发此事件
			{
				System.out.println("我被打开辣");
			}
		});
		*/

		f.setVisible(true);

		System.out.println("Hello World!");
	}
}
/*
class MyWin implements WindowListener
{
	//覆盖7个方法，可是我们只用到了关闭动作
	//其他动作都没有用到，但是却必须复写。
}
*/

//因为WindowListener的子类WindowAdapter已经实现了WindowListener接口
//并覆盖了其中的所有方法。那么我只要继承自WindowAdapter，并覆盖我需要的方法即可

class MyWin extends WindowAdapter
{
	public void windowClosing(WindowEvent e)  //其中一个事件
	{
		//事件处理
		//System.out.println("window closing----"+e.toString());
		System.exit(0);
	}
}






















