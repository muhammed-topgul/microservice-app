package com.muhammedtopgul.ticketservice.entity;

import com.muhammedtopgul.ticketservice.enumeration.PriorityType;
import com.muhammedtopgul.ticketservice.enumeration.TicketStatus;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ticket")
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@AllArgsConstructor
public class TicketEntity extends BaseEntity {

    @Getter
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private String id;

    @Getter
    @Setter
    @Column(name = "description", length = 600)
    private String description;

    @Getter
    @Setter
    @Column(name = "notes", length = 4000)
    private String notes;

    @Getter
    @Setter
    @Column(name = "assignee", length = 100)
    private String assignee;

    @Getter
    @Setter
    @Column(name = "ticket_date")
    private LocalDate ticketDate;

    @Getter
    @Setter
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "priority_type")
    private PriorityType priorityType;

    @Getter
    @Setter
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ticket_status")
    private TicketStatus ticketStatus;
}
