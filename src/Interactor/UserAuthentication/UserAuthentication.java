package Interactor.UserAuthentication;

import Entities.UserInfo.UserInfo;

public interface UserAuthentication {
    public UserInfo loginUser(String userID, String userPassword);
    public boolean registerUser(String userID, String userPassword);
}
