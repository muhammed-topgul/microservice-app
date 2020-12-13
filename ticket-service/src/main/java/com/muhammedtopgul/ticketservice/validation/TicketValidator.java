package com.muhammedtopgul.ticketservice.validation;

import com.muhammedtopgul.ticketservice.dto.TicketDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TicketValidator {

    public static void validateTicketDto(TicketDto ticketDto) {
        if (ticketDto.getDescription() == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
    }
}
