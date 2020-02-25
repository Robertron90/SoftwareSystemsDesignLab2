public interface UserAuthentication {

    public UserDB userDB;
    public UserInfo loginUser(String userID, String userPassword);
    public boolean registerUser(String userID, String userPassword);
}
