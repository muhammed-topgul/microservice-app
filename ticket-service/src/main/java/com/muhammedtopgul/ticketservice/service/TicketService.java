package com.muhammedtopgul.ticketservice.service;

import com.muhammedtopgul.ticketservice.dto.TicketDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TicketService {

    TicketDto getById(String id);
    TicketDto save(TicketDto ticketDto);
    TicketDto update(String id, TicketDto ticketDto);
    Page<TicketDto> getPagination(Pageable pageable);
}
