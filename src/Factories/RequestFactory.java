package Factories;

import Entities.Requests.AdminRequest;
import Entities.Requests.ClientRequest;
import Entities.UserInfo.UserInfo;


import java.util.Date;

public interface RequestFactory {
    public ClientRequest createClientRequest(UserInfo userInfo, int temp, int hum, int wind, String loc, Date time);
    public AdminRequest createAdminRequest(UserInfo userInfo, int temp, int hum, int wind, String loc, Date time);
}
