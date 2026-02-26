package prashanth;

import java.io.*;

public class Create_file {

    public static void main(String[] args) {

        File file = new File("Tech.txt");

        try {

            // Step 1: Create file if not exists
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());

                // Write some content into file
                FileWriter writer = new FileWriter(file);
                writer.write("Java Programming\n");
                writer.write("Serialization Example\n");
                writer.write("File Handling in Java\n");
                writer.close();

                System.out.println("Content written successfully.");
            }
            else {
                System.out.println("File already exists.");
            }

            // Step 2: Read file
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nFile Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}




//to do list from this topic 
//to do list from this topic 
//to do list from this topic 
//to do list from this topic 
//to do list from this topic 
//to do list from this topic 



