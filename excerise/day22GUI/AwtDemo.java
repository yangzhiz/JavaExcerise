/*
����ͼ�λ����棺
1������frame����
2���Դ�����л������á���С��λ�ã����֣���ʽ���֣��߽�ʽ���֣�
3���������
4�������ͨ�������add������ӵ�������
5���ô�����ʾ��ͨ��setVisible(true)

---------------------------------------------------------------------------------
ʱ��������Ƶ��ص㣺

1���¼�Դ
	���ǰ�awt������swing���е���Щͼ�ν������
2���¼�
	ÿһ���¼�Դ�����Լ����еĶ�Ӧ�¼��͹����¼����������¼���
3��������
	�����Դ���ĳһ���¼��Ķ��������ܲ�ֹһ�������Ѿ���װ���˼�������

-------����������java�ж��Ѿ�����ã�ֱ�ӻ�ȡ��������ü��ɡ�����Ҫ�����Ƕ�������

4���¼�����


*/

import java.awt.*;
import java.awt.event.*;  //ͨ���¼���������Ч�� �õ��˰�


class AwtDemo 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("my awt");  //Ĭ��Ϊ�߽�ʽ����
		f.setSize(500,100);
		f.setLocation(600,500);    //ԭ��Ϊ��Ļ���Ͻ�
		f.setLayout(new FlowLayout());

		Button b = new Button(" i am a new button");
		



		f.add(b);
		
		//3�����ü�����myWin������MyWin��װ�˴����¼��Ķ�����
		//��MyWin�̳���windowAdapter����������windowAdapterʵ����WindowListener�ӿڡ�WindowListener�ӿڶ�����window����ද����
		
		//�������Ĵ���ֻ��Ϊ�˷��㴴�����������󣬵�listenerֻ��һ������ʱ��������Ҫ������
		
		f.addWindowListener(new MyWin());    //public void addWindowListener(WindowListener l) ����Ϊһ���ӿ�
		
		/*
		�����ڲ��ࣺ
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("�ҹ�");
				System.exit(0);
			}
			public void windowActivated(WindowEvent e) //����ǰ�ô������¼�
			{
				System.out.println("�һ���");
			}
			public void windowOpened(WindowEvent e)    //�򿪴��崥�����¼�
			{
				System.out.println("�ұ�����");
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
	//����7����������������ֻ�õ��˹رն���
	//����������û���õ�������ȴ���븴д��
}
*/

//��ΪWindowListener������WindowAdapter�Ѿ�ʵ����WindowListener�ӿ�
//�����������е����з�������ô��ֻҪ�̳���WindowAdapter������������Ҫ�ķ�������

class MyWin extends WindowAdapter
{
	public void windowClosing(WindowEvent e)  //����һ���¼�
	{
		//�¼�����
		//System.out.println("window closing----"+e.toString());
		System.exit(0);
	}
}






















