class ArrayDemo3
{
	public static void main(String[] args)
	{
		int[] arr = {2,4,6,8,3,6};
		//Ҫ��ӡ������ ��ֵ��ͨ��Ҫ�õ�������
		for (int x=0;x<arr.length;x++)  //���� ��������.length  ����ֱ�ӻ�ȡ���鳤��
		{
			System.out.println("arr["+x+"]="+arr[x]+";");
		}

		printArray(arr);

		System.out.println(arr);//[I@32a88bc2  ��ʾ�������͵����ã���ŵ���Int���͡� [-���� I-Int���� @-���� 32a88bc2-������ڴ��ŵ�ַ����ϣ�㷨�ó��Ĺ�ϣֵ��ʮ������ֵ��
	}
	//���幦�ܣ����ڴ�ӡ������Ԫ�ء�Ԫ��֮���ö��Ÿ�����
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");	
		}
	}
}