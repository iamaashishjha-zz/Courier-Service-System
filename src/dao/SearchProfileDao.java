
package dao;

import bll.Delivery;
import bll.UserAccount;
import java.io.IOException;


public interface SearchProfileDao {
    boolean searchProfile(UserAccount ua) throws IOException;
}
