/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import rogeriolucon.locadora.model.Brand;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.time.Duration;


/**
 *
 * @author Rogerio
 */
public class FipeApi {
    private static String baseURL = "http://fipeapi.appspot.com/api/1/carros";

    public static <T> List<T> fetchData(String url, TypeReference<T> typeRef) throws Exception{
        List<T> list;
        
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
        
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(baseURL+url))
                .build();
        
        CompletableFuture<HttpResponse<String>> response =
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        String result = response.thenApply(HttpResponse::body).get(60, TimeUnit.SECONDS);

//        System.out.println(result);
        
        ObjectMapper mapper = new ObjectMapper();
//        
        list = (List<T>) mapper.readValue(result, typeRef);
//          
        return list;
    }
}
