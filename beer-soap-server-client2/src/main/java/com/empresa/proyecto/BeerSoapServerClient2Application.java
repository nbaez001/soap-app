package com.empresa.proyecto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empresa.proyecto.beer.GetBeerRequest;
import com.empresa.proyecto.beer.GetBeerResponse;
import com.empresa.proyecto.config.BeerClient;
import com.empresa.proyecto.config.SoapClientConfig;

//@SpringBootApplication
public class BeerSoapServerClient2Application {

	public static void main(String[] args) {
//		SpringApplication.run(BeerSoapServerClient2Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
		System.out.println(context.getBeanDefinitionCount());
		BeerClient client = context.getBean(BeerClient.class);

		GetBeerRequest request = new GetBeerRequest();
		request.setId(2);
		GetBeerResponse resp = client.getBeer(request);
		System.out.println("response: " + resp.getBeer().getId() + "  -  " + resp.getBeer().getName());
	}

}
