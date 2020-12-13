package com.muhammedtopgul.ticketservice.enumeration;

import lombok.Getter;

@Getter
public enum TicketStatus {
    OPEN("Açık"),
    IN_PROGRESS("İşlemde"),
    RESOLVED("Çözüldü"),
    CLOSED("Kapandı");

    private final String label;

    TicketStatus(String label) {
        this.label = label;
    }
}
