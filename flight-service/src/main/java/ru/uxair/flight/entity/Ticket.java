package ru.uxair.flight.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "passenger")
    private String passenger;
    @Column(name = "booking")
    private String booking;
    @Column(name = "seat_category")
    private String seatCategory;
    @Column(name = "in_flight_service")
    private String inflightService;
    @Column(name = "fare")
    private float fare;
    @Column(name = "currency")
    private String currency;
    @Column(name = "flight")
    private String flight;
}