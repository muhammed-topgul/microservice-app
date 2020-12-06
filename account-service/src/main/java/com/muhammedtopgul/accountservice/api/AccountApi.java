package com.muhammedtopgul.accountservice.api;

import com.muhammedtopgul.accountservice.entity.AccountEntity;
import com.muhammedtopgul.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account")
@RestController
public class AccountApi {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountEntity> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(accountService.get(id));
    }

    @PostMapping
    public ResponseEntity<AccountEntity> save(@RequestBody AccountEntity accountEntity) {
        return ResponseEntity.ok(accountService.save(accountEntity));
    }

    @PutMapping
    public ResponseEntity<AccountEntity> update(@RequestBody AccountEntity accountEntity) {
        return ResponseEntity.ok(accountService.update(accountEntity));
    }

    @DeleteMapping
    public void delete(String id) {
        accountService.delete(id);
    }
}
