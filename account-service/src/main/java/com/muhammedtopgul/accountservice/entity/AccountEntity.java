package com.muhammedtopgul.accountservice.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountEntity {
    private String id;
    private String username;
    private String email;
    private String password;
}
