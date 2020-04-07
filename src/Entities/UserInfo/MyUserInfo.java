package Entities;

public class MyUserInfo implements UserInfo{
    String userID;
    String userPassword;

    public MyUserInfo(String userID, String userPassword) {
        this.userID = userID;
        this.userPassword = userPassword;
    }

    public String getID() {
        return userID;
    }

    public String getPassword() {
        return userPassword;
    }




}
