package DB.User;

import Entities.UserInfo.UserInfo;

public interface UserDB {
    public UserInfo getUser(String userID, String userPassword);
    public boolean addUser(String userID, String userPassword);
}
