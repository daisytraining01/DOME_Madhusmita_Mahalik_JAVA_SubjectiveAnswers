import java.io.*;

public class ReadTextFile
{
	public static void main(String[] args) throws Exception
	{
		//File file = new File()
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\madhusmitam\\Downloads\\JAVA DOCS(IMP)\\abc.txt"));

		String text;
		while ((text = br.readLine()) != null) 
		{
			System.out.println(text);
		}
		
		
		((Appendable) br).append('#');
		System.out.println(("Result after"+ " appending = " + br));
	}
}