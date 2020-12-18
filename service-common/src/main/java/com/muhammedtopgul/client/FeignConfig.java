package com.muhammedtopgul.client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
// with @EnableFeignClients annotation feign clients will be active in other service that use
// service-common module as a dependency (ticket-service)
// ticket-service enough because it is client to account service
@EnableFeignClients
public class FeignConfig {
}
