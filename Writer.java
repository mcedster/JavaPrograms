import java.io.*;

public class Writer 
{
	public static void main(String args[]) throws IOException
	{
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("stuff.txt"), "utf-8"));
		
		writer.write("Hello worwld");
		writer.close();
		
	}
}
