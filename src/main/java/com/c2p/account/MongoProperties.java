package com.c2p.account;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoProperties {
 
    private String host;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
 
    // other fields with standard getters and setters
}
