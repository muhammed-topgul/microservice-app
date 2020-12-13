package com.muhammedtopgul.ticketservice.repository.elasticsearch;

import com.muhammedtopgul.ticketservice.entity.elasticsearch.TicketElasticEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketElasticRepository extends ElasticsearchRepository<TicketElasticEntity, String> {
}
