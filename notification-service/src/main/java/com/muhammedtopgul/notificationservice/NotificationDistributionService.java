package com.muhammedtopgul.notificationservice;

import com.muhammedtopgul.messaging.contract.dto.TicketNotificationDto;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class NotificationDistributionService {

    @StreamListener(Sink.INPUT)
    public void onNotification(TicketNotificationDto ticketNotificationDto) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>----<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>> Notification taken and sending to users <<<");
        System.out.println(ticketNotificationDto.toString());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>----<<<<<<<<<<<<<<<<<<<<<<");
    }
}
