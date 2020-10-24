package co.edu.uco.tarea.repository;


import co.edu.uco.tarea.entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TareaRepository extends JpaRepository<TareaEntity, Integer> {
}
