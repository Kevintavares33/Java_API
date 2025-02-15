package com.eventos.api.domain.address;

import com.eventos.api.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Table
@Entity

public class Address {
    @Id
    @GeneratedValue
    private UUID id;

    private  String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
