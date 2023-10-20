package com.yash.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.entity.Ticket;
@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
