/*
ͨ������������һ��.java�ļ�
*/
class CopyTextByBuf
{
	public static void main(String[] args) 
	{
		bufr = new BufferedReader(new FileReader("BufferedWriterDemo.java"));
		bufw = new BufferedWriter(new FileWriter("BufferedWriterDemo.txt"));

		String line = null;

		while ((line=bufr.readLine())!=null)
		{
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
	}
}
