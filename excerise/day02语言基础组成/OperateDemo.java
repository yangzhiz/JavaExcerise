class OperateDemo
{
	public static void main(String[] args)
	{
		int x = 4270;
		x = x/1000 * 1000;
		System.out.println(x); // 4000  println�е�ln��ʾ���У�����һ���������һ�С�
		System.out.println(1%-5); //ȡģ��ȡ�ࣩ 1
		System.out.println(-1%5); // -1   �и���������£���������Ž������㣬���������������뱻ģ������ߣ�һ��
	
		int a=3,b;
		b = a++; // b = b + 4 �� b�����ʼ��ֵ���ܽ��н��м��㡣 �˴�Ϊ��ֵ�� ������a++ ����++a�����a��ֵһ����仯��
		System.out.println(b); //3
		System.out.println(a); //4   
		System.out.println("yang"+"zhi"); //yangzhi 
		System.out.println("5+5="+5+5);   // 5+5=55 �ַ����������κ�����ʹ��+ ���������ӣ�����Ϊ�ַ�����
		System.out.println("5+5="+(5+5)); // 5+5=10
		System.out.println("a="+a+",b="+b);  //a=4,b=3
		/* ת���ַ���ͨ��\��ת�������ĸ���߷��ŵĺ���
		   \n ������
		*/
		System.out.println("hello\nworld"); //hello
		                                    //world
		//System.out.println(""hello"");      //�� ������õ�"hello" ""��ʶ�������ַ�����helloΪ��Ч����
		System.out.println("\"hello\"");    //ת���д�ڱ�ת��ķ���ǰ��,�Ӷ�ʹ"����˵������ַ�
        System.out.println("\\hello\\");    // \hello\
		//System.out.println("\hello\");      // �� �Ƿ�ת��� ת��h��û������
		//char ch = "\n";                       // ת������������ַ���Ӧ���õ�����
		//System.out.println(ch); 
		char ch1 = '\n';					//ת��λ���з� ����Ч
		System.out.println(ch1);			//�������
		char ch2 = '\'';					//ת��ʹ�м�� ' ��ɵ������ַ�
		System.out.println(ch2);			// '
		char ch3 = '��';
		System.out.println(ch3);			// ��
		char ch4 = '��';					//һ������Ϊ�����ֽڣ�
		System.out.println(ch4);			// ��
		}
}