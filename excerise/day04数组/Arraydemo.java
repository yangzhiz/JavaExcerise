class ArrayDemo
{
	public static void main(String[] args)
	{
		//Ԫ������[] ������ = new Ԫ������[Ԫ�ظ��������鳤��]������ Ԫ������ ������[]  = new Ԫ������[Ԫ�ظ��������鳤��]��
		int[] x = new int[3]; //xΪ�������ͣ�����int����
        int[] arr = new int[]{3,1,6,5,4}; //�ȼ��� int[] arr = {3,1,6,5,4};

		System.out.println(x[0]);//0

		int[] arr1 = new int[3]; 
		System.out.println(arr1[3]);//����ɹ�������ʧ�ܣ�ArrayIndexOutOfBoundsException:3 ��������ʱ�����ʵ��������в����ڵĽǱꡣ
		arr1 = null;
		System.out.println(arr1[1]);//����ɹ�������ʧ�ܣ�NullPointerException:��ָ���쳣��������û���κ�ָ�򣬼�ֵΪnull������������û������ڲ���ʵ�塣
	}
}