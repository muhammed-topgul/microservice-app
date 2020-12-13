package com.muhammedtopgul.ticketservice.entity.elasticsearch;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@EqualsAndHashCode(of = {"id"})
@Document(indexName = "ticket")
public class TicketElasticEntity implements Serializable {

    @Id
    private String id;
    private String description;
    private String notes;
    private String assignee;
    private LocalDate ticketDate;
    private String priorityType;
    private String ticketStatus;
}
