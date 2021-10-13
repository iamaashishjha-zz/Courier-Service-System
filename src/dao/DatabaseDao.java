
package dao;

import java.io.IOException;
import java.util.ArrayList;


public interface DatabaseDao {
    public ArrayList<String> getDataFromFile(String filename) throws IOException;
    public void writeToFile(String filename,ArrayList<String> list);
}
