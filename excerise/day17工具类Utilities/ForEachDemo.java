/*
高级for循环:前提要声明泛型。

格式：

for(数据类型 变量名 ：被遍历的集合（Collection）或数组)
{}

对集合进行遍历。
只能获取元素。但是不能对集合进行操作。

迭代器除了遍历，还可以进行remove集合中元素的动作。
如果使用ListIterator，还可以在遍历过程中进行增删改查的动作。

传统for与高级for的区别：

高级for有一个局限性。必须有被遍历的目标。

建议在遍历数组的时候，还是希望使用传统for。
因为传统for可以
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
		//等价于

		for(Map.Entry<Integer,String> me : hm.entrySet())
		{
			System.out.println(me.getKey()+"----"+me.getValue());
		}
	}
}
