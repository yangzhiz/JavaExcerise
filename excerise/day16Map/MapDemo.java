/*
Map���ϣ��ü��ϴ洢��ֵ�ԡ�һ��һ������棬��Ҫ��֤����Ψһ�ԡ�

	1����ӡ�
		put(K key, V value); //ע�ⷵ�ص��ǣ���ǰ�� key ������ֵ����û�У�����null��
							 //������ļ��Ѿ�����ʱ���µ�ֵ�Ḳ�Ǿɵ�ֵ��

		putAll(Map<? extends K,? extends V> m);
	2��ɾ����
		clear();
		remove(Object key); //�Ƴ��������ؼ���Ӧ��ֵ��
	3���жϡ�
		containsValue(Object value);
		containsKey(Object Key);
		isEmpty();
	4����ȡ��
		get(Object key);
		//Ҳ����ͨ��get�����ķ���ֵ���ж�һ�����Ƿ���ڡ�������ֵ�Ƿ�Ϊnull ��
		size();
		values();

		entrySet();
		keySet();

Map
	|--Hashtable:�ײ��ǹ�ϣ�����ݽṹ�������Դ���null��nullֵ���ü������߳�ͬ���ġ�Ч�ʵ͡�JDK1.0�����ԣ�
	|--HashMap���ײ��ǹ�ϣ�����ݽṹ������ʹ��null��nullֵ���ü����ǲ�ͬ���ġ�Ч�ʸߡ�JDK1.2�����ԣ�
	|--HashTree:�ײ��Ƕ��������ݽṹ���̲߳�ͬ�������Ը������еļ���������

Map��Set����
Set�ײ����ʹ����Map������

ʲôʱ��ʹ��Map�����أ�
������֮�������ӳ���ϵʱ����Ҫ�����뵽Map���ϡ�
*/

class MapDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
