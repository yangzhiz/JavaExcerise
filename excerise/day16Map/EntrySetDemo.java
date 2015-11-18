/*
Map.Entry ��ʵEntryҲ��һ���ӿڣ�����Map�е�һ���ڲ��ӿڡ�

���ص��ڲ��߼���
interface Map
{
	public static interface Map.Entry
	{
		public abstract Object getKey();
		public abstract Object getValue();
	}
}

class HashMap implements Map
{
	class Haha implements Map.Entry
	{
	}
	public Object getKey(){}
	public Object getValue(){}
}
*/

import java.util.*;

class EntrySetDemo
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String,String>();

		map.put("1","yang");

		Set<Map.Entry<String,String>> entrySet = map.entrySet();

		Iterator<Map.Entry<String,String>> it = entrySet.iterator();

		while(it.hasNext())
		{
			Map.Entry<String,String> me = it.next();

			System.out.println("me:"+me); //me:1=yang

			String key = me.getKey();
			String value = me.getValue();

			System.out.println("key:"+key);
			System.out.println("value:"+value);
		}
	}

}