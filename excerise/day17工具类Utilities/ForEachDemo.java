/*
�߼�forѭ��:ǰ��Ҫ�������͡�

��ʽ��

for(�������� ������ ���������ļ��ϣ�Collection��������)
{}

�Լ��Ͻ��б�����
ֻ�ܻ�ȡԪ�ء����ǲ��ܶԼ��Ͻ��в�����

���������˱����������Խ���remove������Ԫ�صĶ�����
���ʹ��ListIterator���������ڱ��������н�����ɾ�Ĳ�Ķ�����

��ͳfor��߼�for������

�߼�for��һ�������ԡ������б�������Ŀ�ꡣ

�����ڱ��������ʱ�򣬻���ϣ��ʹ�ô�ͳfor��
��Ϊ��ͳfor����
*/
import java.util.*;

class ForEachDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("yang");
		al.add("yan");
		al.add("ya");
		
		for(String s : al)
		{
			System.out.println(s);
		}

		/*
		Iterator<String> it = al.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		int[] arr = {3,5,1};
		
		for(int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
		}
		for(int i : arr)
		{
			System.out.println("i:"+i);
		}

		HashMap<Integer,String> hm = new HashMap<Integer,String>();

		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");

		Set<Integer> keySet = hm.keySet();
		for(Integer i : keySet)
		{
			System.out.println(i+"::"+hm.get(i));
		}
		
		//Set<Map.Entry<Integer,String>> entrySet = hm.entrySet();
		//for(Map.Entry<Integer,String> me : entrySet)
		//�ȼ���

		for(Map.Entry<Integer,String> me : hm.entrySet())
		{
			System.out.println(me.getKey()+"----"+me.getValue());
		}
	}
}
