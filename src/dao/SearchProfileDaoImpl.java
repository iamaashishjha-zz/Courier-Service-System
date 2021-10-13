package dao;

import bll.UserAccount;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchProfileDaoImpl implements SearchProfileDao {

    @Override
    public boolean searchProfile(UserAccount ua) throws IOException {
        boolean foundRecord = false;

        try {
            FileReader fr = new FileReader("UserLoginDetails.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;

            while ((line = br.readLine()) != null) {
                splt = line.split(",");

                if (splt[0].equals(ua.getUid())) {
                    ua.setFullname(splt[1]);
                    ua.setUsername(splt[2]);
                    ua.setPassword(splt[3]);
                    ua.setRole(splt[4]);
                    
                    foundRecord = true;

                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return foundRecord;
    }
}
