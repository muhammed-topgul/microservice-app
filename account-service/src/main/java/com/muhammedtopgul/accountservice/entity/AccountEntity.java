package com.muhammedtopgul.accountservice.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Builder
@Table(value = "account")
public class AccountEntity implements Serializable {

    @PrimaryKey
    private String id = UUID.randomUUID().toString();

    @Column(value = "uname")
    private String username;

    @Column(value = "name")
    private String name;

    @Column(value = "surname")
    private String surname;

    @Column(value = "birth_date")
    private LocalDate birthDate;

    @Column(value = "email")
    private String email;

    @Column(value = "pwd")
    private String password;

    @Column(value = "created_at")
    private LocalDate createdAt;

    @Column(value = "is_active")
    private Boolean isActive;
}
