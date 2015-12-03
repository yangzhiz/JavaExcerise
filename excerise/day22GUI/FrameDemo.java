

import  java.awt.*;
import java.awt.event.*;

class FrameDemo 
{
	//�����ͼ����������������á�
	private Frame f;
	private Button but;

	FrameDemo() //���캯��
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

		but = new Button("my button");

		//�������ӵ�frame��
		f.add(but);
		
		//���ش������¼�
		myEvent();

		//��ʾ����
		f.setVisible(true);
	}
	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()    //���ڼ���
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		//�ð�ť�߱��˳�������
		/*
		��ť�����¼�Դ����ôѡ���ĸ��������أ�
		ͨ���رմ���ʵ�����˽⵽��Ҫ֪���ĸ�����߱�ʲô�������м�������
		��Ҫ�鿴���������Ĺ��ܡ�  
		ͨ������button���������ְ�ť֧��һ�����м�����
		 void addActionListener(ActionListener l) 
 
		*/
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) //�����
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
