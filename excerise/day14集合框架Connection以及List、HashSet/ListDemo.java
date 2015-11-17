/*
Collection

    |--List:Ԫ����������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
		|--ArrayList���ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯѸ�١�����ɾ���������̲߳�ͬ����Ч�ʸ��ߡ�
		|--LinkedList���ײ�ʹ�õ����������ݽṹ���ص㣺����ɾ��Ѹ�١���ѯ������
		|--Vector���ײ����������ݽṹ����ͬ��ArrayList�������߳�ͬ������ArrayList�����

	|--Set��Ԫ��������ģ�Ԫ�ز������ظ���û��������

List:
���з��������ǿ��Բ����Ǳ꣨�������ķ�������List���еķ�����

��
	add(index,element);
	addAll(index,Collection);
ɾ
	remove(index);
��
	set(index,element);
��
	get(index);
	subList(fromindex,toindex);
	listIterator();

List�������еĵ�������listIterator��Iterator���ӽӿڡ�

�ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�ء�
��Ϊ�ᷢ��ConcurrentModificationException�쳣��

���ԣ��ڵ���ʱ��ֻ���õ������ķ�������Ԫ�ء�����Iterator�ķ������ޡ�
ֻ�ܽ����жϣ�hasNext();����ȡ����next();������ɾ����remove();��
�����Ҫ�����Ĳ�������ӣ��޸ĵȣ�����Ҫʹ�����ӽӿ�listIterator��
�ýӿ�ֻ��ͨ��list���ϵ�listIterator������ȡ��
*/

import java.util.*;

class ListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");
		System.out.println(al);
	

		//�����ڵ��������У�׼����ӻ���ɾ��Ԫ�ء�
	
		ListIterator li = al.listIterator();

		System.out.println(li.hasNext());  //true
		System.out.println(li.hasPrevious()); //false

		while(li.hasNext())
		{
			Object obj = li.next();

			if(obj.equals("java02"))
			li.set("java007");//~~~~~~
			//li.add("java009");
			System.out.println(obj);
		}


		System.out.println(al);
		System.out.println(li.hasNext()); //false
		System.out.println(li.hasPrevious());//true
		/*	
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();

			if(obj.equals("java02"))
			
			a1.add("java008");//it.next();���������ķ�������a1.add("java008");�����ϵķ��������ڶ�Ԫ�صĲ����޸ģ��������ȫ����������

			it.remove();//��java02�����ôӼ�����ɾ��������obj��Ȼָ������������Ȼ�ܹ���ӡ������
			
			System.out.println(obj);
		}
		*/

	}
}
