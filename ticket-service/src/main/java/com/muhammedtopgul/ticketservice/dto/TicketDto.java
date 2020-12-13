package com.muhammedtopgul.ticketservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

    private String id;
    private String description;
    private String notes;
    private String assignee;
    private String priorityType;
    private String ticketStatus;
}
