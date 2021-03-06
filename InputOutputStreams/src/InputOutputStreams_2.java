import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputStreams_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputFilename = sc.nextLine();
		System.out.println("Enter the output file name");
		String outputFilename = sc.nextLine();
	
		File filein = new File(inputFilename);
		File fileout = new File(outputFilename);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filein));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
			
			int ch;
			while ((ch = br.read()) != -1) {
				bw.write(ch);
			};
			
			System.out.println("File Is Copied");			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
