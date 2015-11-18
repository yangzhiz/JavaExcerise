/*
StaticImport 静态导入。

当类名重名时，需要指定具体的包名。
当方法重名时，指定具备所属的对象或者类。

packa/Demo.class
packb/Demo.class

import packa.*;
import packb.*;

new packa.Demo();
*/

import java.util.*;
import static java.util.Arrays.*; //导入的是Arrays这个类中的所有静态成员。

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

		out.println("静态导入java.lang.System.*，从此不写System。");
		out.println(Arrays.toString(arr));
		out.println("Index="+index);

	}
}
