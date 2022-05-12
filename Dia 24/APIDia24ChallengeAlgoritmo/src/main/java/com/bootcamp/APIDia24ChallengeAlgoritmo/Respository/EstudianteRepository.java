package com.bootcamp.APIDia24ChallengeAlgoritmo.Respository;

import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
    Estudiante getEstudianteByDni(long dni);

    boolean existsByDni(long dni);

    @Query(value = "select * from estudiantes s order by s.nombre asc", countQuery = "SELECT count(*) FROM estudiantes", nativeQuery = true)
    public Page<Estudiante> ascendant(Pageable ammount);
    @Query(value = "select * from estudiantes s order by s.nombre desc",countQuery = "SELECT count(*) FROM estudiantes", nativeQuery = true)
    public Page<Estudiante> descendant(Pageable ammount);

    @Query(value = "select * from estudiantes s where s.nombre = :nombre", nativeQuery = true)
    public ArrayList<Estudiante> byNombre(@Param("nombre") String nombre);

    @Query(value = "select * from estudiantes s where s.apellido = :apellido", nativeQuery = true)
    public ArrayList<Estudiante> byApellido(@Param("apellido") String apellido);
}
