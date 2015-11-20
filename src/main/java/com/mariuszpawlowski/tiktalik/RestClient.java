package com.mariuszpawlowski.tiktalik;

import com.mariuszpawlowski.tiktalik.entity.Instance;
import com.owlike.genson.ext.jaxrs.GensonJsonConverter;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mariusz.Pawlowski on 2015-11-19.
 */
public class RestClient {
    private String login;
    private String password;

    public RestClient(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Client getClient() {
        ClientConfig clientConfig = new DefaultClientConfig(GensonJsonConverter.class);
        Client client = Client.create(clientConfig);
        HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter(login, password);
        client.addFilter(authFilter);
        client.setConnectTimeout(10 * 1000);
        return client;
    }

    public List<Instance> getListOfInstances(String url) {
        WebResource webResource = getClient().resource(url);
        Instance[] response = webResource.accept(MediaType.APPLICATION_JSON).get(Instance[].class);
        return Arrays.asList(response);
    }

    public void createNewInstance(String url, String hostName, String imageUuid, String networkUuid, String instanceSize, String diskSize) {
        WebResource webResource = getClient().resource(url);
        List<String> networks = new ArrayList<String>();
        networks.add(networkUuid);

        MultivaluedMap<String, String> map = new MultivaluedMapImpl();
        map.putSingle("image_uuid", imageUuid);
        map.putSingle("size", instanceSize);
        map.putSingle("hostname", hostName);
        map.putSingle("disk_size_gb", diskSize);
        map.put("networks[]", networks);

        ClientResponse response = webResource.type("application/x-www-form-urlencoded")
                .post(ClientResponse.class, map);

    }
}
