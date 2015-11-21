import java.io.*;
import java.util.*;

class SystemInfo 
{
	public static void main(String[] args) throws IOException
	{
		Properties prop = System.getProperties();
		prop.list(new PrintStream("SystemInfo.txt"));
	}
}
