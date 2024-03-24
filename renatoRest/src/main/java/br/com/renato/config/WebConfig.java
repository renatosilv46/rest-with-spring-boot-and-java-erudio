package br.com.renato.config;

import java.awt.PageAttributes.MediaType;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		//URL should look like this "localhost:8080/person?mediaType=xml"
		
		/*	
		//Speaking that the parameters will be in Query Param, and not in Header, too ignores header accept
		configurer.favorParameter(true).parameterName("mediaType").ignoreAcceptHeader(true)
		.useRegisteredExtensionsOnly(false)
		
		//Speaking that the format default of return is json
		.defaultContentType(org.springframework.http.MediaType.APPLICATION_JSON)
		
		//If mediaType equals JSON, return data in format json
		.mediaType("json", org.springframework.http.MediaType.APPLICATION_JSON)
		
		//If mediaType equals XML, return data in format xml
		.mediaType("xml ", org.springframework.http.MediaType.APPLICATION_XML);
		*/
		
		//URL should look like this "localhost:8080/person"
		
		//Speaking that the parameters will be in Query Param, and not in Header, too ignores header accept
		configurer.favorParameter(false).ignoreAcceptHeader(false)
		.useRegisteredExtensionsOnly(false)
		
		//Speaking that the format default of return is json
		.defaultContentType(org.springframework.http.MediaType.APPLICATION_JSON)
		
		//If mediaType equals JSON, return data in format json
		.mediaType("json", org.springframework.http.MediaType.APPLICATION_JSON)
		
		//If mediaType equals XML, return data in format xml
		.mediaType("xml ", org.springframework.http.MediaType.APPLICATION_XML);
	}

}
