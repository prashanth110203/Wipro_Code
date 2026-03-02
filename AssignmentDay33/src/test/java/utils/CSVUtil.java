package utils;

import java.io.*;
import java.util.*;

public class CSVUtil {

    public static Object[][] getCSVData(String filePath) {

        List<Object[]> data = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data.toArray(new Object[0][]);
    }
}
