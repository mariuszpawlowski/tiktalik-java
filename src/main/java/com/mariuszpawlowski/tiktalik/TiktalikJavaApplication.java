package com.mariuszpawlowski.tiktalik;




import sun.misc.BASE64Encoder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TiktalikJavaApplication {

    public static void main(String[] args) {

        String url = "https://www.tiktalik.com/api/v1/computing/instance";

        String name = "";
        String password = "";
        String authString = name + ":" + password;
        String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
        System.out.println("Base64 encoded auth string: " + authStringEnc);
        Client restClient = Client.create();
        WebResource webResource = restClient.resource(url);
        Instance resp = webResource.accept("application/json")
                .header("Authorization", "Basic " + authStringEnc)
                .type("application/json")
                .get(Instance.class);



    }
}
