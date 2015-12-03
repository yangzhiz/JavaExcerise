import java.awt.*;
import java.awt.event.*;

class MouseAndKeyEvent 
{
	//定义该图形中所需组件的引用。
	private Frame f;
	private Button but;

	private TextField tf;

	MouseAndKeyEvent() //构造函数
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

		tf = new TextField(10);

		but = new Button("my button");

		//将组件添加到frame中
		f.add(but);
		f.add(tf);

		//加载窗体上事件
		myEvent();

		//显示窗体
		f.setVisible(true);
	}
	private void myEvent()
	{
		//窗口监听 事件源：窗口
		f.addWindowListener(new WindowAdapter()    
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		//文本监听 事件源：文本框
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				int code = e.getKeyCode();
				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9))  //如果不是数字，则为非法输入
				{
					System.out.println(code+"是非法的");
					e.consume(); //屏蔽键
				}
			}
		});


		//活动监听 事件源：按钮
		but.addActionListener(new ActionListener()  //活动事件。光标点击与否都会发生。
													//光标不点击按钮的情况下执行时（使用键盘空格键），此事件依然发生并作处理
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("action ok");	//注意：点击Click的处理优先于活动Action
			}
		});

		//鼠标监听 事件源：按钮
		but.addMouseListener(new MouseAdapter()
		{
			private int count = 1;
			private int clickCount = 1;
			public void mouseEntered(MouseEvent e)
			{
				System.out.println("鼠标进入到该组件"+count++);
			}
			public void mouseClicked(MouseEvent e)
			{
				//if(e.getClickCount()==1)
				//System.out.println("单击动作"+clickCount++);
				if(e.getClickCount()==2)
					System.out.println("双击动作"+clickCount++);
			}
		
		});
		
		//键盘监听 窗口：按钮
		but.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				//System.out.println(e.getKeyChar()+"..."+e.getKeyCode());
				//System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"..."+e.getKeyCode());
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE)  
					System.exit(0);
				//使用组合键
				if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER)  
					System.out.println("ctrl+enter is run");
			}
		});

 
	}

	public static void main(String[] args) 
	{
		new MouseAndKeyEvent();
	}
}
