package com.mariuszpawlowski.tiktalik;

import com.google.gson.Gson;
import com.mariuszpawlowski.tiktalik.entity.Instance;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import jdk.nashorn.internal.parser.JSONParser;

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

    public List getListOfInstances() {
        String url = "https://www.tiktalik.com/api/v1/computing/instance";
        RestClient restClient = new RestClient(login, password);

        WebResource webResource = restClient.getClient().resource(url);
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        int status = response.getStatus();
        if (ClientResponse.Status.OK.getStatusCode() == status) {
            String restResponse = response.getEntity(String.class);
            Instance[] restResponse2 = response.getEntity(Instance[].class);
            Gson gson = new Gson();
            Instance[] instance =  gson.fromJson(restResponse, Instance[].class);

            System.out.println(response);
        } else {

        }


        return null;
    }
}
