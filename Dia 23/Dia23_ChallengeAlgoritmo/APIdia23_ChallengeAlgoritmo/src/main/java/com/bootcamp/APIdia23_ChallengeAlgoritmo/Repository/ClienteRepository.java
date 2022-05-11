package com.bootcamp.APIdia23_ChallengeAlgoritmo.Repository;


import com.bootcamp.APIdia23_ChallengeAlgoritmo.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    public Cliente getByDni(long dni);
}
