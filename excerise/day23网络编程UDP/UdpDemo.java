/*
Socket

������ͨ�����˶��е�Socket��ͨ��IO����


����ͨ��UDP���䷽ʽ����һ���������ݷ��ͳ�ȥ��
˼·��
1������updsocket����
2���ṩ���ݣ��������ݷ�װ�����ݰ��С�
3��ͨ��socket����ķ��͹��ܣ������ݰ�����ȥ��
4���ر���Դ��
*/
import java.net.*;

class UdpSend 
{
	public static void main(String[] args) throws Exception
	{
		//1��ͨ������������
		DatagramSocket ds = new DatagramSocket(8888);
		//2��ȷ�����ݣ�����װ�����ݰ�
		byte[] buf = "udp is come".getBytes();
		DatagramPacket dp = 
				new DatagramPacket(buf,buf.length,InetAddress.getByName("172.29.66.146"),10000);

		//3��ͨ��socket���񣬽�Ӵ�е����ݰ����ͳ�ȥ��ͨ��send������
		ds.send(dp);

		//4���ر���Դ
		ds.close();
	}
}


/*
����
����һ��Ӧ�ó������ڽ���UDPЭ�鴫������ݲ�����

����udp�Ľ��նˡ�
˼·��
1������udpsocket����ͨ�������һ���˿ڡ���ʵ���Ǹ������������Ӧ�ó��������ֱ�ʶ��
   ��������ȷ��Щ���ݹ���Ӧ�ó�����Դ���
2������һ�����ݰ�����ΪҪ�洢���յ����ֽ����ݡ���Ϊ���ݰ��������и��๦�ܿ�����ȡ�ֽ������еĲ�ͬ������Ϣ��
3��ͨ��socket�����receive�������յ������ݴ����Ѿ�����õ����ݰ���
4��ͨ�����ݰ���������й��ܡ�����Щ��ͬ����ȡ������ӡ�ڿ���̨�ϡ�
5���ر���Դ��
*/
class UdpReceive
{
	public static void main(String[] args) throws Exception
	{
		//1���������񣬽����˵�
		DatagramSocket ds = new DatagramSocket(10000);//���ݶ˿�10000����������
		while(true)
		{
		//2���������ݰ������ڴ洢����
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);

		//3��ͨ��socket�����receive�������յ������ݴ����Ѿ�����õ����ݰ���
		ds.receive(dp); //����ʽ����

		//4��ͨ�����ݰ��ķ�����ȡ���е�����
		String ip = dp.getAddress().getHostAddress(); //getAddress����ip�����ٻ�ȡ��ip��ַ

		String data = new String(dp.getData(),0,dp.getLength());

		int port = dp.getPort();

		System.out.println(ip+"::"+data+"::"+port);
		}
		//5���ر���Դ
		ds.close();
	}
		
}



























