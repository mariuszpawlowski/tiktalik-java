package com.mariuszpawlowski.tiktalik;

import com.mariuszpawlowski.tiktalik.entity.Instance;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by mario on 17/11/15.
 */
public class TiktalikJavaImpl implements TiktalikJava{

    private String login;
    private String password;

    public TiktalikJavaImpl(String login, String password){
        this.login = login;
        this.password = password;
    }

    public List<Instance> getListOfInstances() {
        String url = "https://www.tiktalik.com/api/v1/computing/instance";
        RestClient restClient = new RestClient(login, password);
        List<Instance> instancesList = restClient.getListOfInstances(url);
        return instancesList;
    }

    public void createNewInstance(String imageUuid, String hostName){
        String url = "https://www.tiktalik.com/api/v1/computing/instance";
        RestClient restClient = new RestClient(login, password);
        restClient.createNewInstance(url, imageUuid, hostName);
    }
}
