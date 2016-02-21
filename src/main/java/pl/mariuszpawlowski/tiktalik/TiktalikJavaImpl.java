package com.mariuszpawlowski.tiktalik;

import com.mariuszpawlowski.tiktalik.entity.Image;
import com.mariuszpawlowski.tiktalik.entity.Instance;
import com.sun.jersey.api.client.ClientResponse;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by mario on 17/11/15.
 */
public class TiktalikJavaImpl implements TiktalikJava{

    private final static Logger LOGGER = Logger.getLogger(TiktalikJavaImpl.class.getName());


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
        ClientResponse response = restClient.createNewInstance(url, hostName, imageUuid, networkUuid, instanceSize, diskSize);
        LOGGER.log(Level.FINE, "Create instance response status: " + response.getStatus());
    }

    public void deleteInstance(String vpsUuid) {
        String url = "https://www.tiktalik.com/api/v1/computing/instance/" + vpsUuid;
        RestClient restClient = new RestClient(login, password);
        ClientResponse response = restClient.deleteInstance(url);
        LOGGER.log(Level.FINE, "Delete instance response status: " + response.getStatus());

    }

    public List<Image> getListOfImages() {
        String url = "https://www.tiktalik.com/api/v1/computing/image";
        RestClient restClient = new RestClient(login, password);
        List<Image> imagesList = restClient.getListOfImages(url);
        return imagesList;
    }

    public void stopInstance(String vpsUuid) {
        String url = "https://www.tiktalik.com/api/v1/computing/instance/" + vpsUuid + "/stop";
        RestClient restClient = new RestClient(login, password);
        ClientResponse response = restClient.stopInstance(url);
        System.out.println("Stop instance response status: " + response.getStatus());
    }

    public Instance getInstance(String vpsUuid) {
        String url = "https://www.tiktalik.com/api/v1/computing/instance/" + vpsUuid;
        RestClient restClient = new RestClient(login, password);
        Instance instance = restClient.getInstance(url);
        return instance;
    }

    public void createBackup(String vpsUuid) {
        String url = "https://www.tiktalik.com/api/v1/computing/instance/" + vpsUuid + "/backup";
        RestClient restClient = new RestClient(login, password);
        ClientResponse response = restClient.createBackup(url);
        System.out.println("Create backup response status: " + response.getStatus());
    }

    public void deleteImage(String imageUuid) {
        String url = "https://www.tiktalik.com/api/v1/computing/image/" + imageUuid;
        RestClient restClient = new RestClient(login, password);
        ClientResponse response = restClient.deleteImage(url);
        System.out.println("Delete image response status: " + response.getStatus());
    }
}
