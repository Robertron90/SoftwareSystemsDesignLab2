import java.util.Date;

public class MyAdminResponse implements AdminResponse {

    String userID;
    String userPassword;
    String response;

    public MyAdminResponse(String userID, String userPassword, String response) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.response = response;
    }

    public String getResponse(){
        return response
    }
    public String getID() {
        return userID;
    }

    public String getPassword() {
        return userPassword;
    }
}
