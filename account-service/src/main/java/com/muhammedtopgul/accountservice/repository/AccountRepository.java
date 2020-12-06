package com.muhammedtopgul.accountservice.repository;

import com.muhammedtopgul.accountservice.entity.AccountEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CassandraRepository<AccountEntity, String> {
}
