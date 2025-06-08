package control;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVController {
    public static void getCSVdata(String fileName){
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                System.out.println(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try{
                reader.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
