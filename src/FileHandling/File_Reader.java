package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

class File_Readerr {

	public static void main(String[] args) {
		try {
		 FileReader fr = new FileReader("output.txt");
		 int c = fr.read();
		 	 
		 System.out.println((char) c);
		 c=fr.read();
		 System.out.println((char) c);
		 c=fr.read();
		 System.out.println((char) c);
		 c=fr.read();
		 System.out.println((char) c);
		 c=fr.read();
		 System.out.println((char) c);
		 c=fr.read();
		 System.out.println((char) c);
		 fr.close();
		 
		 
		 
		 
	}
		catch (Exception e){
			
		}
	}

}
