package dao;

import bll.UserAccount;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserLoginDaoImpl implements UserLoginDao {

    @Override
    public boolean checkUser(UserAccount ul) throws IOException {
        boolean found = false;
        try {
            FileReader fr = new FileReader("UserLoginDetails.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (splt[2].equals(ul.getUsername()) && splt[3].equals(ul.getPassword())) {
                    ul.setRole(splt[4]);
                    found = true;
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }
}
