package DB;

import Entities.MyUserInfo;
import Entities.UserInfo;

import java.util.HashMap;
import java.util.Map;

public class MyUserDB implements  UserDB{
    private Map<String, String> userIDToPasswordTable;

    public MyUserDB() {
        this.userIDToPasswordTable = new HashMap<>();
    }


    public UserInfo getUser(String userID, String userPassword){
        if (userIDToPasswordTable.containsKey(userID)){
            if(userIDToPasswordTable.get(userID).equals(userPassword)){
                return new MyUserInfo(userID, userPassword);
            }
            return null;
        }
        return null;

    }
    public boolean addUser(String userID, String userPassword){
        userIDToPasswordTable.put(userID, userPassword);
        return true;

    }
}
