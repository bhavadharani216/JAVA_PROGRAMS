package FileHandling;
import java.io.FileWriter;
public class File_Writer {

	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("output.txt",true);
		fw.append("  Mine");
		fw.close();
		System.out.println("success");
		}
		catch(Exception e) {
			System.out.println("something is happened");
			
		}
		

	}

}
