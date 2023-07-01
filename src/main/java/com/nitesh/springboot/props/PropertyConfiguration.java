package com.nitesh.springboot.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("testapp")
public class PropertyConfiguration {

	
	
	private Map<String, String> messages = new HashMap<String, String>();
	
}
