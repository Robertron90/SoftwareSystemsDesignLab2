public class MyUserAuthentication implements UserAuthentication {

    public MyUserAuthentication(UserDB userDB) {
        this.userDB = userDB;

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
