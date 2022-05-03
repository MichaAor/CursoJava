package com.bootcamp.Dia21_PairProgramming.Repository;

import com.bootcamp.Dia21_PairProgramming.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
