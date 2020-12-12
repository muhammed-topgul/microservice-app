package com.muhammedtopgul.accountservice.service;

import com.muhammedtopgul.accountservice.entity.AccountEntity;
import com.muhammedtopgul.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountEntity get(String id) {
        return accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public AccountEntity save(AccountEntity accountEntity) {
        return accountRepository.save(accountEntity);
    }

    public AccountEntity update(String id, AccountEntity accountEntity) {
        Assert.isNull(id, "Id cannot be null");
        return AccountEntity.builder().id("test-id").build();
    }

    public void delete(String id) {

    }

    public List<AccountEntity> findAll() {
        return accountRepository.findAll();
    }
}
