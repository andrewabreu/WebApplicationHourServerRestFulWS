/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Hour [hourserver]<br>
 * USAGE:
 * <pre>
 *        ClientJavaLocalHourServerRestFulWS client = new ClientJavaLocalHourServerRestFulWS();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Andrew
 */
public class ClientJavaLocalHourServerRestFulWS {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/HourServerRestFulWS/webresources";

    public ClientJavaLocalHourServerRestFulWS() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("hourserver");
    }

    public void putJson(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public String getJson() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public void close() {
        client.close();
    }
    
}
