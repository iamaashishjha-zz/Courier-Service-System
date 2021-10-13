package dao;

import bll.Delivery;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchReportDaoImpl implements SearchReportDao {

    @Override
    public boolean searchReport(Delivery d) throws IOException {
        boolean foundRecord = false;

        try {
            FileReader fr = new FileReader("DeliveryDetails.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;

            while ((line = br.readLine()) != null) {
                splt = line.split(",");

                if (splt[0].equals(d.getCID())) {
                    d.setCAddr(splt[1]);
                    d.setCName(splt[2]);
                    d.setCContact(splt[3]);
                    d.setStatus(splt[4]);
                    d.setFeedback(splt[5]);
                    d.setODate(splt[6]);
                    d.setDDate(splt[7]);
                    d.setCost(splt[8]);
                    d.setDeliveredBy(splt[9]);
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
