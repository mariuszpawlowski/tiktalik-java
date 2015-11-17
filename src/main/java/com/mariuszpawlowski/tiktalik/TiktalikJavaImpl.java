package com.mariuszpawlowski.tiktalik;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.util.List;

/**
 * Created by mario on 17/11/15.
 */
public class TiktalikJavaImpl implements TiktalikJava{

    private String authStringEnc;

    public TiktalikJavaImpl(String authStringEnc){
        this.authStringEnc = authStringEnc;
    }

    public List getListOfInstances() {
        String url = "https://www.tiktalik.com/api/v1/computing/instance";
        Client restClient = Client.create();
        WebResource webResource = restClient.resource(url);
        ClientResponse resp = webResource.accept("application/json")
                .header("Authorization", "Basic " + authStringEnc)
                .get(ClientResponse.class);

        System.out.println(resp.getEntity(String.class));

        return null;
    }
}
