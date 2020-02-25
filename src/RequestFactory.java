import java.util.Date;

public interface RequestFactory {
    public ClientRequest createClientRequest(UserInfo userInfo, int temp, int hum, int wind, String loc);
    public AdminRequest createAdminRequest(UserInfo userInfo, int temp, int hum, int wind, String loc, Date time);
}
