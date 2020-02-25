public interface UserDB {
    public UserInfo getUser(String userID, String userPassword);
    public boolean addUser(String userID, String userPassword);
}
