package com.bootcamp.APIDia25ChallengeAlgoritmo.Respository;

import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Inscripcion;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Materia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion,Long> {
    public boolean existsByMateria(Materia materia);
    public boolean existsByEstudiante(Estudiante estudiante);
    Page<Inscripcion> findAll(Pageable cantidad);

    @Query(value = "SELECT * FROM inscripciones ie INNER JOIN estudiantes es ON ie.estudiante_dni = es.dni WHERE es.nombre = :nombre ", nativeQuery = true)
    public List<Inscripcion> byEstudianteNomb(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM inscripciones ie INNER JOIN materias ma ON ie.materia_cod_mat = ma.cod_mat WHERE ma.nombre = :nombre", nativeQuery = true)
    public List<Inscripcion> byMateriaNomb(@Param("nombre") String nombre);

}
