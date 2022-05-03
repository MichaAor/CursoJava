package com.bootcamp.Dia21_PairProgramming.Service;

import com.bootcamp.Dia21_PairProgramming.Model.Product;
import com.bootcamp.Dia21_PairProgramming.Model.Ticket;
import com.bootcamp.Dia21_PairProgramming.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TicketService {
        @Autowired
        TicketRepository tr;

        public ArrayList<Ticket> getAllTickets(){
            return (ArrayList<Ticket>) tr.findAll();
        }

        public Ticket getTicketById(long id){
            return tr.getById(id);
        }

        public void registerTicket(Ticket ticket){
            tr.save(ticket);
        }

        public void deleteTicketById(long id){
            tr.deleteById(id);
        }

}
