package com.muhammedtopgul.ticketservice.service.impl;

import com.muhammedtopgul.messaging.contract.dto.TicketNotificationDto;
import com.muhammedtopgul.ticketservice.entity.TicketEntity;
import com.muhammedtopgul.ticketservice.service.TicketNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
@RequiredArgsConstructor
public class TicketNotificationServiceImpl implements TicketNotificationService {

    private final Source source;

    @Override
    public void sendToQueue(TicketEntity ticketEntity) {
        TicketNotificationDto ticketNotificationDto = new TicketNotificationDto();
        ticketNotificationDto.setAccountId(ticketEntity.getAssignee());
        ticketNotificationDto.setTicketId(ticketEntity.getId());
        ticketNotificationDto.setTicketDescription(ticketEntity.getDescription());

        source.output().send(MessageBuilder.withPayload(ticketNotificationDto).build());
    }
}
