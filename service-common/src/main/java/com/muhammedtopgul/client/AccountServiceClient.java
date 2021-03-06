package com.muhammedtopgul.client;

import com.muhammedtopgul.client.contract.dto.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("account-service") // this service id equal with account service eureka registered id
public interface AccountServiceClient {

    @RequestMapping("/account/{id}")
    ResponseEntity<AccountDto> get(@PathVariable("id") String id);
}
