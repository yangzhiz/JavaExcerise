/*
��� jar

jar -cf haha.jar packa packk //��packa packkѹ����haha.jar��
jar -tf haha.jar   //�۲�jar���е��ļ�

jar -tf haha.jar >d:\haha.txt  //��dos�µ������Ϣ����d���µ�haha.txt�ļ��� �����ض���
���ѹ����ɾ����ԭ�еİ��ļ��У�����Ҫ��jar���ŵ�classpath�¡��ſ��Լ������ʡ�
*/

package packk;

import packa.*; 

class  JarDemo
{
	public static void main(String[] args) 
	{
		DemoA a = new DemoA();
		a.show();
		System.out.println("Hello jar pack");
	}
}
