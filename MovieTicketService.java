package com.example.movieticketbooking.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movieticketbooking.model.MovieTicket;

@Service
public class MovieTicketService {

    private final List<MovieTicket> tickets =
            new ArrayList<>();

    public MovieTicket bookTicket(MovieTicket ticket) {
        tickets.add(ticket);
        return ticket;
    }

    public List<MovieTicket> getAllTickets() {
        return tickets;
    }

    public MovieTicket getTicketById(int id) {
        return tickets.stream()
                .filter(t -> t.getTicketId() == id)
                .findFirst()
                .orElse(null);
    }
}