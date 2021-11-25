package com.qa.project.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.qa.project.main.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
