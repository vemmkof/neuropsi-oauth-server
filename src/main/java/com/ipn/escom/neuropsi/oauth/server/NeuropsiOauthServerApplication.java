package com.ipn.escom.neuropsi.oauth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient
@RibbonClient(name = "neuropsi-oauth-service")
@SpringBootApplication
@EntityScan("com.ipn.escom.neuropsi.commons.entity")
public class NeuropsiOauthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeuropsiOauthServerApplication.class, args);
    }

}
