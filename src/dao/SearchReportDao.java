
package dao;

import bll.Delivery;
import java.io.IOException;

public interface SearchReportDao {
    boolean searchReport(Delivery d) throws IOException;
}
