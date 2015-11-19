package com.mariuszpawlowski.tiktalik;

import com.mariuszpawlowski.tiktalik.entity.Instance;
import com.owlike.genson.ext.jaxrs.GensonJsonConverter;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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

    public void createNewInstance(String url, String imageUuid, String hostName) {
        WebResource webResource = getClient().resource(url);
        Form form = new Form();
        form.param("image_uuid", imageUuid);
        form.param("size", "2s");
        form.param("hostname", hostName);

        Response response = webResource.accept(MediaType.APPLICATION_JSON)
                .post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE));

        System.out.println(response.getStatus());
    }
}
