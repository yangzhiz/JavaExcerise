class VarDemo1
{
	public static void main(String[] args)
	{
	//��������ĸ�ʽ��
	//�������� ������ = ��ʼ��ֵ��
	//����һ��int ���ͱ�����ȡֵΪ4��
          int x=4; 
          System.out.println(x);
              x=10;//x�Ѿ������ڴ棬�����á�
          System.out.println(x);
  	  
 	  byte b = 2;	  //-128~127
          //byte b1 = 128;  //������ʧ���ȣ�wrong

          //float f = 2.3;   //��ʧ���ȣ�С����2.3����java��Ĭ��Ϊdouble����
          float f = 2.3f;  //��

          char ch = '4';
          char ch1 = '+';
	      char ch2 = ' ';
	      char ch3 = 'a';
    
          boolean bo = true;  // true �� ture ��
          boolean bo1 = false;

          /*��ʱ��������������ݲ�ȷ����ʱ����Ҫ�����ݽ��д洢ʱ���Ͷ���һ����������ɴ洢������*/
          
          int a = 5;
          a = a + 6;

          //���͵�ת��
          byte b2 = 3;
          //b2=b2+2;   // �� b2Ϊbyte���ͣ�ռһ��8λ����2Ϊ���ͣ�ռ4��8λ����ͬ�������Ͳ�����ӡ���Ҫ�õ��Զ���������
          b2=(byte)(b2+2);//�� ǿ��ת��
          System.out.println(b2); // 5

	  System.out.println('a'+1);//98 ASCII���У�	1 49 ...... A 65 ...... a 97 b 98
	  System.out.println((char)('a'+1));//b
	  System.out.println('1'+0);//49

	}
}