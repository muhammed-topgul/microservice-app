package com.muhammedtopgul.ticketservice.enumeration;

import lombok.Getter;

@Getter
public enum PriorityType {
    URGENT("Acil"),
    LOW("Düşük"),
    HIGH("Yüksek");

    private final String label;

    PriorityType(String label) {
        this.label = label;
    }
}
