/*
StringBuffer���ַ�����������
��һ��������

ע�⣺
1�������ǿɱ仯��
2�����Բ��������������
3�����ջ�ͨ��toString��������ַ���

CURE  create update read delete

1���洢��
   StringBuffer append(String); //��ָ��������Ϊ������ӵ��������ݵĽ�β����ע�ⷵ�ص���Ϊ�������͡�sb.append("dasd").append("asda")....
   StringBuffer insert(insert,String)  //�����ݲ��뵽ָ��indexλ�á�
2��ɾ����
	StringBuffer delete(startindex,endindex):ɾ�������������ݣ���ͷ����β
	StringBuffer deleteCharAt(index):ɾ����������ָ��λ�õ�����
3����ȡ��
    char charAt(index);
	int indexOf(String);
	int lastIndexOf(String);
	int length();
	String substring(start,end);
4���޸ġ�
	void setCharAt(index,char);
	StringBuffer replace(start,end,string); 
5����ת��
    StringBuffer reverse();
6������������ָ�����ݴ洢��ָ���ַ�������
	void getChars(int srcBeginIndex, int srcEndIndex, char[] dst, int dstBeginIndex) 
 
��JDK1.5�汾֮�󣬳�����StringBuilder��

StringBuffer���߳�ͬ����		 �ʺ��ڶ��߳�
StringBuilder���̲߳�ͬ����      �ʺ��ڵ��߳�
�Ժ󿪷�����ʹ��StringBuilder ���Ч�ʡ�

������Ҫ�أ�
1�����Ч��
2������д
3����߰�ȫ��

*/

class StringBuffer 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
