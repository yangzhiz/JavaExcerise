
/*
������BufferedReader�������з���readLine��ԭ���
�����Զ���һ�����а���һ�����ܺ�readLineһ�µķ�����
��ģ��һ��BufferedReader
*/
import java.util.*;

class MyBufferedReader extends Reader
{
	private Reader r;
	MyBufferedReader(Reader r)
	{
		this.r = r;
	}
	//����һ�ζ�һ�����ݵķ�����
	public String myReadLine()
	{
		//����һ����ʱ������ԭBufferedReader��װ�����ַ����顣
		//Ϊ����ʾ���㡣����һ��StringBuilder��������Ϊ���ջ���Ҫ�����ݱ���ַ�����
	}
}
class  MybufferedReaderDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
