package com.muhammedtopgul.ticketservice.repository;

import com.muhammedtopgul.ticketservice.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, String> {
}
