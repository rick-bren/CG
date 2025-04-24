import java.io.*;

 public class FileReadComparison {


 	public static void readWithFileReader(String path) throws IOException {
     	FileReader reader = new FileReader(path);
     	long start = System.nanoTime();

     	while (reader.read() != -1);

     	long end = System.nanoTime();
     	reader.close();
     	System.out.println("FileReader Time: " + (end - start) / 1_000_000.0 + " ms");
 	}

    	public static void readWithInputStreamReader(String path) throws IOException {
     	InputStreamReader reader = new InputStreamReader(new FileInputStream(path));
     	long start = System.nanoTime();

     	while (reader.read() != -1);
     	long end = System.nanoTime();
     	reader.close();
     	System.out.println("InputStreamReader Time: " + (end - start) / 1_000_000.0 + " ms");
 	}

 	public static void main(String[] args) {
   	        String filePath = "test_500mb.txt";
     	try {
         	System.out.println("Reading file: " + filePath);
             readWithFileReader(filePath);
             readWithInputStreamReader(filePath);
     	} catch (IOException e) {
         	e.printStackTrace();
     	}
 	}
 }

+