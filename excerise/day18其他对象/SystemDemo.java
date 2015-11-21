/*
System:���еķ��������Զ��Ǿ�̬�ġ�
out:��׼�����Ĭ���ǿ���̨��
in:��׼���룬Ĭ���Ǽ��̡�

����ϵͳһЩ��Ϣ��

����ϵͳ������Ϣ��Properties getProperties();
*/

import java.util.*;
class SystemDemo 
{
	public static void main(String[] args) 
	{

		Properties prop = System.getProperties();
		
		//��ΪProperties��Hashtable�����࣬Ҳ����Map���ϵ�һ���������
		//��ô����ͨ��map�ķ���ȡ���ü����е�Ԫ�ء�
		//�ü����д洢�Ķ����ַ�����û�з��Ͷ��塣

		//�����ϵͳ���Զ���һЩϵͳ��Ϣ

		System.setProperty("mykey","myvalue");
		
		//��ȡָ��������Ϣ

		String osvalue = System.getProperty("os.name");

		System.out.println("value="+osvalue);
		
		//�ɲ�������JVM����ʱ����̬�ؼ���һЩ������Ϣ
		//-D<name>=<value>  ����ϵͳ����


		//��ȡ����������Ϣ

		for(Object obj : prop.keySet())
		{
			String value = (String)prop.get(obj);

			System.out.println(obj+"::"+value);
		}
		
	}
}
