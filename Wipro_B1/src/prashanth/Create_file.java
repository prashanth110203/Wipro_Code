package prashanth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Create_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("Tech.txt"));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}br.close();

		}
		catch(IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}

	}

}
