package com.mariuszpawlowski.tiktalik;


import com.sun.jersey.core.impl.provider.entity.StringProvider;
import sun.misc.BASE64Encoder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TiktalikJavaApplication {

    public static void main(String[] args) {

        String url = "https://www.tiktalik.com/api/v1/computing/instance";

        String name = "mario";
        String password = "1415926535";
        String authString = name + ":" + password;
        String authStringEnc = new BASE64Encoder().encode(authString.getBytes());
        System.out.println("Base64 encoded auth string: " + authStringEnc);
        Client restClient = Client.create();
        WebResource webResource = restClient.resource(url);
        ClientResponse resp = webResource.accept("application/json")
                .header("Authorization", "Basic " + authStringEnc)
                .get(ClientResponse.class);

        System.out.println(resp.getEntity(String.class));

    }
}
