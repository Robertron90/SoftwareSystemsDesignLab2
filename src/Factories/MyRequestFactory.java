package Factories;

import Entities.Requests.AdminRequest;
import Entities.Requests.ClientRequest;
import Entities.Requests.MyAdminRequest;
import Entities.Requests.MyClientRequest;
import Entities.UserInfo.UserInfo;

import java.util.Date;

public class MyRequestFactory implements  RequestFactory{

    public MyRequestFactory() {
    }

    public ClientRequest createClientRequest(UserInfo userInfo, int temp, int hum, int wind, String loc, Date time) {
        return new MyClientRequest(userInfo.getID(), userInfo.getPassword(), temp, hum,  wind, loc, time);
    }

    public AdminRequest createAdminRequest(UserInfo userInfo, int temp, int hum, int wind, String loc, Date time) {
        return new MyAdminRequest(userInfo.getID(), userInfo.getPassword(), temp, hum,  wind, loc, time);
    }
}
