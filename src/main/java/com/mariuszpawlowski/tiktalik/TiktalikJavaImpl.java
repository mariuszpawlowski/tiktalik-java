package com.mariuszpawlowski.tiktalik;

import com.mariuszpawlowski.tiktalik.entity.Instance;

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

    public void createNewInstance(String hostName, String imageUuid, String networkUuid, String instanceSize, String diskSize ){
        String url = "https://www.tiktalik.com/api/v1/computing/instance";
        RestClient restClient = new RestClient(login, password);
        restClient.createNewInstance(url, hostName, imageUuid, networkUuid, instanceSize, diskSize);
    }

    public void deleteInstance(String vpsUuid) {
        String url = "https://www.tiktalik.com/api/v1/computing/instance/"+vpsUuid;
        RestClient restClient = new RestClient(login, password);
        restClient.deleteInstance(url);
    }
}
