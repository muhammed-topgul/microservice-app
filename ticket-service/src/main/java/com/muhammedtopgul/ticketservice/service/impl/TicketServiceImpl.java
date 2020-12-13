package com.muhammedtopgul.ticketservice.service.impl;

import com.muhammedtopgul.ticketservice.dto.TicketDto;
import com.muhammedtopgul.ticketservice.entity.TicketEntity;
import com.muhammedtopgul.ticketservice.entity.elasticsearch.TicketElasticEntity;
import com.muhammedtopgul.ticketservice.enumeration.PriorityType;
import com.muhammedtopgul.ticketservice.enumeration.TicketStatus;
import com.muhammedtopgul.ticketservice.repository.TicketRepository;
import com.muhammedtopgul.ticketservice.repository.elasticsearch.TicketElasticRepository;
import com.muhammedtopgul.ticketservice.service.TicketService;
import com.muhammedtopgul.ticketservice.validation.TicketValidator;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final TicketElasticRepository ticketElasticRepository;
    private final ModelMapper modelMapper;

    @Override
    public TicketDto getById(String id) {
        return null;
    }

    @Transactional
    @Override
    public TicketDto save(TicketDto ticketDto) {
        // 1. validate dto
       // TicketValidator.validateTicketDto(ticketDto);

        // 2. convert dto to entity
        TicketEntity ticketEntity = new TicketEntity();
        // TODO confirm from account api
        // ticketEntity.getAssignee();
        ticketEntity.setDescription(ticketDto.getDescription());
        ticketEntity.setNotes(ticketDto.getNotes());
        ticketEntity.setTicketDate(ticketDto.getTicketDate());
        ticketEntity.setTicketStatus(TicketStatus.valueOf (ticketDto.getTicketStatus()));
        ticketEntity.setPriorityType(PriorityType.valueOf(ticketDto.getPriorityType()));

        // 3. save to mysql
        TicketEntity savedTicketEntity = ticketRepository.save(ticketEntity);

        // 4. crate new ticket elastic entity
        TicketElasticEntity ticketElasticEntity = TicketElasticEntity
                .builder()
                .id(savedTicketEntity.getId())
                .description(savedTicketEntity.getDescription())
                .notes(savedTicketEntity.getNotes())
                .ticketDate(savedTicketEntity.getTicketDate())
                .ticketStatus(savedTicketEntity.getTicketStatus().getLabel())
                .priorityType(savedTicketEntity.getPriorityType().getLabel())
                .build();

        // 5. save to elasticsearch
        ticketElasticRepository.save(ticketElasticEntity);

        // 6. return created object
        ticketDto.setId(savedTicketEntity.getId());

        return ticketDto;
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
