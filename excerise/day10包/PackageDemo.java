/*
������һ��Ҫд�ڳ�����ǰ��

javac -d . pack.PackageDemo  //-d ָ������ŵ�λ�� . ��ʾ��ǰ�ļ��� ֮����������ڵ�ǰ�ļ���

java pack.PackageDemo  //Ĭ���ڵ�ǰĿ¼�ҡ������� ����Ҫ����classpath


�ܽ�:
1�������֮����з��ʣ������ʵİ�֮������Լ����г�Ա����Ҫpublic���Ρ�

2����ͬ���е����໹����ֱ�ӷ��ʸ����б�protectedȨ�����εĳ�Ա��
   �����֮�����ʹ�õ�Ȩ��ֻ�����֣�public    protected   ��default��

Ȩ�ޣ�

               public       protected       default        private

ͬһ������		ok				ok			ok			    ok

ͬһ������		ok				ok			ok				x

����			ok				ok			x				x

��ͬ����		ok				x			x				x



Ϊ�˼���������д��ʹ��һ���ؼ��֣�import  //�����ǰ���������ʱ��
import �����ʱ���е��ࡣ

d:\java\packb\DemoA.class
d:\java\packb\haha\DemoB.class

import packb.*    //�˾�ֻ�ܵ���DemoA.class������DemoB.class�޹�

���鲻Ҫдͨ��� * ����Ҫ�õ��ĸ���͵����ĸ���

���鶨�������Ҫ�ظ�������ʹ��url��ɶ��壬url��Ψһ�ġ�
*/
package pack;//package pack.pack1.pack2


import haha.heihei.xixi.hiahia.DemoC;
import haha.heihei.xixi.hiahia.*;//���಻ֻ��һ��ʱ
import packb.*;
import packa.*;


class PackageDemo
{
	public static void main(String[] args)
	{
		//System.out.println("Hello Package");
		//packa.DemoA d = new packa.DemoA();//DemoA d = new DemoA();//error
		//d.show();//��DemoB��methodΪpublicʱ����A�̳�B����ͨ��A����ֱ�ӵ���B�еķ���


		//packb.DemoB d1 = new packb.DemoB(); //����ʵ����������ֱ�ӷ���DemoB�����ǵ�DemoB��methodΪprotectedʱ�������ʧ�ܡ���ͨ��A�̳�ʱ�ſ���ʹ��B�з�����
		//d1.method();


		//haha.heihei.xixi.hiahia.DemoC c = new haha.heihei.xixi.hiahia.DemoC(); �Ѿ������������д
		DemoC c = new DemoC();//ע�⵱����Ĳ�ͬ��������ͬ����ʱ���˴�����Ӱ�����
	}
}

/*
javac -d . DemoA.java
javac -d . PackageDemo.java


DemoA d = new DemoA(); 
����
E:\study\6��һ\Others\JavaStudy\BXD\excerise\day10��>javac -d . PackageDemo.java
PackageDemo.java:13: ����: �Ҳ�������
                DemoA d = new DemoA();
                ^
  ����:   �� DemoA
  λ��: �� PackageDemo
PackageDemo.java:13: ����: �Ҳ�������
                DemoA d = new DemoA();
                              ^
  ����:   �� DemoA
  λ��: �� PackageDemo
2 ������

����ԭ������д��

��Ϊ������ȫ����  ����.����


������packa.DemoA d = packa.DemoA();����

PackageDemo.java:13: ����: DemoA��packa�в��ǹ�����; �޷����ⲿ������ж�����з���
                packa.DemoA d = packa.DemoA();//DemoA d = new DemoA();//error
                     ^
PackageDemo.java:13: ����: �Ҳ�������
                packa.DemoA d = packa.DemoA();//DemoA d = new DemoA();//error
                                ^
  ����:   ���� packa
  λ��: �� PackageDemo
2 ������

����ԭ�����˰�����Χ���һ�����е���Ҫ�����ʣ�����Ҫ���㹻���Ȩ�ޡ�
���Ա����ʵ���Ҫ��public���Ρ�

������public class DemoA  ����

PackageDemo.java:14: ����: show()��DemoA�в��ǹ�����; �޷����ⲿ������ж�����з���
                d.show();
                 ^
1 ������

����ԭ���๲�к󣬱����ʵĳ�ԱҲҪ���У����ܱ����ʡ�

������public void show()

*/