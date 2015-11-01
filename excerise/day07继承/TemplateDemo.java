/*
���󣺻�ȡһ�γ��������ʱ��
ԭ����ȡ����ʼʱ��ͽ���ʱ�䣬��������ɡ�

��ȡʱ�䣺System.currentTimeMills();

����������Ż��󣬾Ϳ��Խ���������⡣

���ַ�ʽ����Ϊģ�巽�����ģʽ
�����ڶ��幦���ǣ����ܵ�һ������ȷ���ģ�����һ�����ǲ�ȷ���ģ���ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֡�
��ô��ʱ�ͽ���ȷ���Ĳ��ֱ�¶��ȥ���ɸ��������ȥ��ɡ�
*/

abstract class GetTime
{
	public final void getTime()  //��������д
	{
		long start = System.currentTimeMillis();
		runcode(); //����runcode��������д�����õ��������runcode()
		long end = System.currentTimeMillis();
		System.out.println("���룺"+(end-start));
	}
	public abstract void runcode();//��¶
}

class SubTime extends GetTime
{
	public void runcode()
	{
		for (int x=0;x<1000;x++)
		{
			System.out.println(x);
		}
	}
}
class TemplateDemo 
{
	public static void main(String[] args) 
	{
		SubTime gt = new SubTime();
		gt.getTime();//���õĸ����getTime();
	}
}
