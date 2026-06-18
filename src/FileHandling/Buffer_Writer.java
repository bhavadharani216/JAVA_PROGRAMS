package FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Buffer_Writer {

	public static void main(String[] args) {
		try {
		 FileWriter fw = new FileWriter("output.txt");
		 BufferedWriter bw = new BufferedWriter(fw);
		 bw.write("hey girll");
		 bw.newLine();
		 bw.write("are u okay ?");
		 bw.close();
		 System.out.println("success");
		 
		}
		catch(Exception e){
			System.out.println("something is happened");;
			
		}

	}

}
