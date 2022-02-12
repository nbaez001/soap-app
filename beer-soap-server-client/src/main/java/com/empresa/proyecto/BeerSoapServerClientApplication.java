package com.empresa.proyecto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empresa.proyecto.beer.GetBeerRequest;
import com.empresa.proyecto.beer.GetBeerResponse;

public class BeerSoapServerClientApplication {

	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        System.out.println(context.getBeanDefinitionCount());
        BeerClient client = context.getBean(BeerClient.class);

        GetBeerRequest request = new GetBeerRequest();
        request.setId(2);
        GetBeerResponse resp = client.getBeer(request);
        System.out.println("response: " + resp.getBeer().getId()+"  - "+ resp.getBeer().getName());
    }

}
