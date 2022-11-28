package file;
import java.io.*;
public class Filee {
	public static void main(String[] args)  {
		/*File f=new File("d:/Abhii");
		System.out.println(f.mkdir());*/
		File f1=new File("d:/ndknd.jtxtn");
		try {
			f1.createNewFile();
			System.out.println("created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
