package com.java11.feature.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class HttpClientExample {

	// This API provides non-blocking request and response semantics through CompletableFuture. 
	// The API supports both HTTP 1.1 and HTTP 2.
	// This API is the recommended alternative to URLConnection API.
	// HttpRequest : This class encapsulates HTTP request's URI, headers and body.
	// HttpRequest.Builder : This builder helps us to prepare HttpRequest object
	// HttpClient : This class is used to send HTTP requests and to receive their responses
	// HttpResponse : The instance of this class is returned as a result of sending an HttpRequest 
	
	public static void main(String[] args) {
        //building request
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create("http://www.example.com/"))
                                         .GET()//used by default if we don't specify
                                         .build();
        //creating response body handler
        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();

        //sending request and receiving response via HttpClient
        HttpClient client = HttpClient.newHttpClient();
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, bodyHandler);
		/*
		 * future.thenApply(HttpResponse::body) .thenAccept(System.out::println)
		 * .join();
		 */
    }
		
}
