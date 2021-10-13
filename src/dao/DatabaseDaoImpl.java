
package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class DatabaseDaoImpl implements DatabaseDao{

    @Override
    public ArrayList<String> getDataFromFile(String filename) throws IOException {
         ArrayList<String> fileData = new ArrayList<>();
        FileReader fr;
        try {
            fr = new FileReader(new File(filename));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                fileData.add(line);
            }

        } catch (FileNotFoundException ex) {
            
        }
        return fileData;
    }

    @Override
    public void writeToFile(String filename, ArrayList<String> list) {
        try {
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(new File(filename)));
            try (PrintWriter pw = new PrintWriter(buffWriter)) {
                for (String x : list) {
                    pw.println(x);
                    pw.flush();
                }
            }
        } catch (IOException e) {

        }
    }
    
}
