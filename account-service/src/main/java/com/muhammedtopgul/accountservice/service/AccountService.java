package com.muhammedtopgul.accountservice.service;

import com.muhammedtopgul.accountservice.entity.AccountEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public AccountEntity get(String id) {
        return AccountEntity.builder().id("test-id").build();
    }

    public AccountEntity save(AccountEntity accountEntity) {
        return AccountEntity.builder().id("test-id").build();
    }

    public AccountEntity update(AccountEntity accountEntity) {
        return AccountEntity.builder().id("test-id").build();
    }

    public void delete(String id) {

    }
}
