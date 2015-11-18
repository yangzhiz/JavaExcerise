/*
���ϱ����顣
Collection�ӿ��е�toArray������



*/

import java.util.*;

class CollectionToArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("yang");
		al.add("yan");
		al.add("ya");

		String[] arr = al.toArray(new String[1]);

		System.out.println(Arrays.toString(arr));//[yang, yan, ya]

		String[] arr1 = al.toArray(new String[5]);

		System.out.println(Arrays.toString(arr1));//[yang, yan, ya, null, null]

		/*
		1��ָ�����͵����鵽��Ҫ����೤�أ�
			��ָ�����͵����鳤��С�ڼ��ϵ�size����ô�÷����ڲ��ᴴ��һ���µ����顣����Ϊ���ϵ�size��
			��ָ�����͵����鳤�ȴ����˼��ϵ�size���Ͳ����´������顣����ʹ�ô��ݽ��������顣
			���Դ���һ���ոպõ��������š�
			String[] arr1 = al.toArray(new String[al.size()]);

		2��ΪʲôҪ�����ϱ������أ�
		Ϊ���޶���Ԫ�صĲ����������������ɾ��
		*/
	}
}
