class ArrayTest6
{
	public static void main(String[] args)
	{
		toHex(60);
	}
    /*
	����������е�Ԫ����ʱ�洢������������Ӧ��ϵ��
	ÿһ��&15�Ժ���Ϊ����ȥ����ҵ���Ӧ��Ԫ�ء�

	�������ô������
	����ͨ���������ʽ������

	��ͨ��StringBuffer �������
    ����ʹ����������ɴ洢��
	*/
	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[8]; //ע�⣺�ַ����ڴ��б�������Ĭ�ϳ�ʼ��ֵΪ'\u0000'������λ
		int pos = arr.length;
		while(num!=0)
		{
			int temp = num &15;
			//System.out.println(chs[temp]);
			arr[--pos] = chs[temp];
			num = num >>>4;
		}
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}
}