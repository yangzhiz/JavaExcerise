/*
public static void main(String[] args)
����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm����

���壺
public�� �����Ÿú�������Ȩ�������ġ�
static�� ����������������ļ��ؾ��Ѿ������ˡ�
void:    ������û�о���ķ���ֵ��
main:    ���ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
(String[] arr):�����Ĳ���������������һ�����飬�������е�Ԫ�����ַ��������ַ������͵����顣 arr�����Լ��� arg==arguments

�������ǹ̶���ʽ�ģ�jvmֻʶ��˸�ʽ��

JVM���������������ݵ�ʵ����ʲô�أ�   ֻ�����������null������������ʵ��
-------[Ljava.lang.String;@3d44d0c6˵��������һ������,�ҳ���Ϊ0����new String[0]

ע�⣺java MainDemo yangzhi
*/
class MainDemo
{
	public static void main(String[] args)  //jvmֻʶ��˸�ʽ��������:public static void main(String[] xxx)
	{
		System.out.println("hello");
		System.out.println(args);		   //[Ljava.lang.String;@3d44d0c6
		System.out.println(args.length);
		System.out.println(args[0]);       //���ִ��java MainDemo�����ʧ�ܣ���Ϊ���鳤��Ϊ0���˾�Խ��
										   //���ִ��java MainDemo yangzhi ������yang����Ϊ������java �󣬻������������������������MainDemo��ʱ���ֻ����main������������yang zhi��Щ������
	    String[] arr = {"1","2","3","4","5"};
		MainTest.main(arr);
	}
    public static void main(int x)         //����ͨ�����൱�ں�������
	{
		System.out.println("hello");       //������ִ��
	}
}
class MainTest
{
	public static void main(String[] args)
	{
		for(int x=0; x<args.length;x++)
			System.out.println(args[x]);   // 1 2 3 4 5 
	}
}