package com.muhammedtopgul.ticketservice.service;

import com.muhammedtopgul.ticketservice.entity.TicketEntity;

public interface TicketNotificationService {

    void sendToQueue(TicketEntity ticketEntity);
}
