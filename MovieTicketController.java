package com.example.movieticketbooking.controller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import com.example.movieticketbooking.model.MovieTicket;
import com.example.movieticketbooking.service.MovieTicketService;

@RestController
@RequestMapping("/tickets")
public class MovieTicketController {

    private final MovieTicketService service;

    public MovieTicketController(MovieTicketService service) {
        this.service = service;
    }

    @PostMapping
    public MovieTicket bookTicket(
            @Valid @RequestBody MovieTicket ticket) {
        return service.bookTicket(ticket);
    }

    @GetMapping
    public List<MovieTicket> getAllTickets() {
        return service.getAllTickets();
    }

    @GetMapping("/{id}")
    public MovieTicket getTicketById(
            @PathVariable("id") int id) {
        return service.getTicketById(id);
    }
}