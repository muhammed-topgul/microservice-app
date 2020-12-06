package com.muhammedtopgul.accountservice.api;

import com.muhammedtopgul.accountservice.entity.AccountEntity;
import com.muhammedtopgul.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account")
@RestController
@RequiredArgsConstructor
public class AccountApi {

    private final AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountEntity> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(accountService.get(id));
    }

    @PostMapping
    public ResponseEntity<AccountEntity> save(@RequestBody AccountEntity accountEntity) {
        return ResponseEntity.ok(accountService.save(accountEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountEntity> update(@PathVariable("id") String id, @RequestBody AccountEntity accountEntity) {
        return ResponseEntity.ok(accountService.update(id, accountEntity));
    }

    @DeleteMapping
    public void delete(String id) {
        accountService.delete(id);
    }
}
