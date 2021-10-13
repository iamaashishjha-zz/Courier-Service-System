
package dao;

import bll.UserAccount;
import java.io.IOException;


public interface UserLoginDao {
    public boolean checkUser(UserAccount ul) throws IOException;
}
