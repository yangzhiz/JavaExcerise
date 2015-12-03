import java.awt.*;
import java.awt.event.*;

class MouseAndKeyEvent 
{
	//�����ͼ����������������á�
	private Frame f;
	private Button but;

	private TextField tf;

	MouseAndKeyEvent() //���캯��
	{
		init();
	}
	
	//ͼ�λ������ʼ��
	public void init()
	{
		f = new Frame("my frame");
		//��frame���л�������
		f.setBounds(300,100,500,400);//����ͳ���
		f.setLayout(new FlowLayout()); //�Զ��岼��

		tf = new TextField(10);

		but = new Button("my button");

		//�������ӵ�frame��
		f.add(but);
		f.add(tf);

		//���ش������¼�
		myEvent();

		//��ʾ����
		f.setVisible(true);
	}
	private void myEvent()
	{
		//���ڼ��� �¼�Դ������
		f.addWindowListener(new WindowAdapter()    
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		//�ı����� �¼�Դ���ı���
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				int code = e.getKeyCode();
				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9))  //����������֣���Ϊ�Ƿ�����
				{
					System.out.println(code+"�ǷǷ���");
					e.consume(); //���μ�
				}
			}
		});


		//����� �¼�Դ����ť
		but.addActionListener(new ActionListener()  //��¼����������񶼻ᷢ����
													//��겻�����ť�������ִ��ʱ��ʹ�ü��̿ո���������¼���Ȼ������������
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("action ok");	//ע�⣺���Click�Ĵ��������ڻAction
			}
		});

		//������ �¼�Դ����ť
		but.addMouseListener(new MouseAdapter()
		{
			private int count = 1;
			private int clickCount = 1;
			public void mouseEntered(MouseEvent e)
			{
				System.out.println("�����뵽�����"+count++);
			}
			public void mouseClicked(MouseEvent e)
			{
				//if(e.getClickCount()==1)
				//System.out.println("��������"+clickCount++);
				if(e.getClickCount()==2)
					System.out.println("˫������"+clickCount++);
			}
		
		});
		
		//���̼��� ���ڣ���ť
		but.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				//System.out.println(e.getKeyChar()+"..."+e.getKeyCode());
				//System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"..."+e.getKeyCode());
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE)  
					System.exit(0);
				//ʹ����ϼ�
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
