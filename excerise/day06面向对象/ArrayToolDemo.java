class ArrayToolDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,124,23242,1121,4,121};
		/*
		ArrayTool tool = new ArrayTool();   //�ڱ���ʱ����������⵽������ArrayTool����ʱ����ָ��Ŀ¼/��ǰĿ¼��Ѱ��ArrayTool.class�ļ�����û�У������ArrayTool.java������ֻҪ������һ���˳���Ϳ����С�
		int max = tool.getMax(arr);
		*/
		int max = ArrayTool.getMax(arr);    //��ArrayTool�з�����Ϊ��̬֮�󣬱����ͨ����ֱ�ӵ��á�����Ҫ��������Ķ���
		System.out.println("max="+max);
	}
}
