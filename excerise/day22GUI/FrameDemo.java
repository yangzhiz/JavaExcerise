

import  java.awt.*;
import java.awt.event.*;

class FrameDemo 
{
	//定义该图形中所需组件的引用。
	private Frame f;
	private Button but;

	FrameDemo() //构造函数
	{
		init();
	}
	
	//图形化界面初始化
	public void init()
	{
		f = new Frame("my frame");
		//对frame进行基本设置
		f.setBounds(300,100,500,400);//坐标和长宽
		f.setLayout(new FlowLayout()); //自定义布局

		but = new Button("my button");

		//将组件添加到frame中
		f.add(but);
		
		//加载窗体上事件
		myEvent();

		//显示窗体
		f.setVisible(true);
	}
	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()    //窗口监听
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		//让按钮具备退出程序功能
		/*
		按钮就是事件源。那么选择哪个监听器呢？
		通过关闭窗体实例，了解到想要知道哪个组件具备什么样的特有监听器。
		需要查看该组件对象的功能。  
		通过查阅button的描述发现按钮支持一个特有监听：
		 void addActionListener(ActionListener l) 
 
		*/
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) //活动监听
			{
				System.out.println("button to close");
				System.exit(0);
			}
		}); 
 
	}

	public static void main(String[] args) 
	{
		new FrameDemo();
	}
}
