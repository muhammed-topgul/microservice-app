package com.muhammedtopgul.ticketservice.service.impl;

import com.muhammedtopgul.ticketservice.dto.TicketDto;
import com.muhammedtopgul.ticketservice.service.TicketService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public TicketDto getById(String id) {
        return null;
    }

    @Override
    public TicketDto save(TicketDto ticketDto) {
        return null;
    }

    @Override
    public TicketDto update(String id, TicketDto ticketDto) {
        return null;
    }

    @Override
    public Page<TicketDto> getPagination(Pageable pageable) {
        return null;
    }
}
