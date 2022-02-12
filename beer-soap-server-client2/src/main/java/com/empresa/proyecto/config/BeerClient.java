package com.empresa.proyecto.config;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.empresa.proyecto.beer.GetBeerRequest;
import com.empresa.proyecto.beer.GetBeerResponse;

public class BeerClient extends WebServiceGatewaySupport {

	public GetBeerResponse getBeer(GetBeerRequest request) {
		return (GetBeerResponse) getWebServiceTemplate().marshalSendAndReceive(request);
	}
}
