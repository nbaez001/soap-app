package com.empresa.proyecto.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.empresa.proyecto.beer.Beer;
import com.empresa.proyecto.beer.GetBeerRequest;
import com.empresa.proyecto.beer.GetBeerResponse;

@Endpoint
public class BeerEndpoint {

	public static final String NAMESPACE_URI = "http://proyecto.empresa.com/beer";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBeerRequest")
	@ResponsePayload
	public GetBeerResponse getBeer(@RequestPayload GetBeerRequest request) {
		GetBeerResponse beerResponse = new GetBeerResponse();
		Beer beer = new Beer();
		beer.setId(request.getId());
		beer.setName("Cristal");
		beerResponse.setBeer(beer);
		return beerResponse;
	}

}