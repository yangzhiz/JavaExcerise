/*
Runtime����
���ಢû���ṩ���캯��
˵��������new����ֱ���뵽�����еķ������Ǿ�̬��
���ָ����л��зǾ�̬������
˵������϶����ṩ������ȡ������󣬶��Ҹ÷����Ǿ�̬�ģ�����ֵ�����Ǳ������͡�

������ص���Կ�������ʹ���˵������ģʽ��ɡ�

�÷�����static Runtime getRuntime();

*/
class RuntimeDemo 
{
	public static void main(String[] args) throws Exception
	{
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("D:\\StudyTools\\Git-2.6.1-64-bit\\Git\\git-bash.exe");//��git-bash
		
		Process p1 = r.exec("notepad.exe  SystemDemo.java");

		Thread.sleep(4000);
		p.destroy();
	}
}
