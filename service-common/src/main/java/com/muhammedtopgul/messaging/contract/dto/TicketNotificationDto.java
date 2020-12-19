package com.muhammedtopgul.messaging.contract.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// this is a contract class that will use by ticket and notification service
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TicketNotificationDto {

    private String ticketId;
    private String accountId;
    private String ticketDescription;
}
