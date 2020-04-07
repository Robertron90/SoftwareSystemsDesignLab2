package Others;

import DB.User.MyUserDB;
import DB.User.UserDB;
import Entities.UserInfo;

public class MyUserAuthentication implements UserAuthentication {

    private UserDB userDB;

    public MyUserAuthentication() {
        userDB = new MyUserDB();
    }

    public UserInfo loginUser(String userID, String userPassword) {
        return userDB.getUser(userID, userPassword);
    }

    public boolean registerUser(String userID, String userPassword) {
        if (userDB.addUser(userID, userPassword)){
            return true;
        }
        return false;
    }
}
