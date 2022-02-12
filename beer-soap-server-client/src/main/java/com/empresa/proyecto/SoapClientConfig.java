package com.empresa.proyecto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

@Configuration
public class SoapClientConfig {

	@Bean
	public Wss4jSecurityInterceptor securityInterceptor() {
		Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
		wss4jSecurityInterceptor.setSecurementActions("UsernameToken");
		wss4jSecurityInterceptor.setSecurementUsername("admin");
		wss4jSecurityInterceptor.setSecurementPassword("secret");
		return wss4jSecurityInterceptor;
	}

	@Bean
	public Jaxb2Marshaller getMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.empresa.proyecto.beer");
		return marshaller;
	}

	@Bean
	public BeerClient getBeerClient() {
		BeerClient beerClient = new BeerClient();
		beerClient.setMarshaller(getMarshaller());
		beerClient.setUnmarshaller(getMarshaller());
		beerClient.setDefaultUri("http://192.168.8.104:8081/beer-server/ws/beers");
		ClientInterceptor[] interceptors = new ClientInterceptor[] { securityInterceptor() };
		beerClient.setInterceptors(interceptors);
		return beerClient;
	}

}
