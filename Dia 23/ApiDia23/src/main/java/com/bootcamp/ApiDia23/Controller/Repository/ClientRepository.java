package com.bootcamp.ApiDia23.Controller.Repository;

import com.bootcamp.ApiDia23.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,String> {
    Client getClientByDni(String dni);
}
