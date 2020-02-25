import java.util.Map;

public class MyUserDB implements  UserDB{
    Map<String, String> userIDToPasswordTable;

    public MyUserDB(Map<String, String> userIDToPasswordTable) {
        this.userIDToPasswordTable = userIDToPasswordTable;
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
