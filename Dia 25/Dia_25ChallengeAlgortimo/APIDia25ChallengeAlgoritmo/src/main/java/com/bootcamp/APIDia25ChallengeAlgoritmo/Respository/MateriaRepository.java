package com.bootcamp.APIDia25ChallengeAlgoritmo.Respository;

import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Materia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MateriaRepository extends JpaRepository<Materia,Long> {
    Materia getMateriaByCodMat(long codMat);

    Page<Materia> findAll(Pageable cantidad);

    @Query(value = "select * from materias s where s.nombre = :nombre", nativeQuery = true)
    public ArrayList<Materia> byNombre(@Param("nombre") String nombre);
    boolean existsByCodMat(long codMat);
}
