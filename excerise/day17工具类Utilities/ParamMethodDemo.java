/*
JDK1.5�汾���ֵ������ԡ�

�����Ŀɱ������

ע�⣺

��ʹ��ʱע�⣬�ɱ����һ��Ҫ�����ڲ����б�������
*/

class ParamMethodDemo
{
	public static void main(String[] args) 
	{
		//show(3,4);


		//int[] arr = {3,4};
		//show(arr);
		//��Ȼ�ٶ����˶������������ÿ�ζ�Ҫ����һ�����顣��Ϊʵ�ʲ�����


		/*
		�����ԣ�
		�ɱ��������ʵ������һ����������ļ�д��ʽ��
		��Ūÿһ�ζ��ֶ��Ľ����������
		ֻҪ��Ҫ������Ԫ����Ϊ�������ݼ��ɡ�
		��ʽ����Щ������װ�������顣

		*/

		show("hah",2,3,4,5);


	}

	//public static void show(int... arr��String str)//����ʧ��
	public static void show(String str,int... arr) //����ͨ��
	{
		System.out.println(arr);
		System.out.println(arr.length);
	}
	/*
	public static void show(int a,int b)
	{
		System.out.println(a+","+b);
	}
	*/


	/*
	public static void show(int[] arr)
	{
	
	}
	*/
}
