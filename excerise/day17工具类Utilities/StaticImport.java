/*
StaticImport ��̬���롣

����������ʱ����Ҫָ������İ�����
����������ʱ��ָ���߱������Ķ�������ࡣ

packa/Demo.class
packb/Demo.class

import packa.*;
import packb.*;

new packa.Demo();
*/

import java.util.*;
import static java.util.Arrays.*; //�������Arrays������е����о�̬��Ա��

import static java.lang.System.*;


class  StaticImport
{
	public static void main(String[] args) 
	{
		int[] arr = {3,1,5};

		/*
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr,1);
		System.out.println(Arrays.toString(arr));
		System.out.println("Index="+index);
		*/
		sort(arr);
		int index = binarySearch(arr,1);

		out.println("��̬����java.lang.System.*���Ӵ˲�дSystem��");
		out.println(Arrays.toString(arr));
		out.println("Index="+index);

	}
}
