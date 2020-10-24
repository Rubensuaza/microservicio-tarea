package co.edu.uco.tarea.service;

import co.edu.uco.tarea.command.TareaCommand;
import co.edu.uco.tarea.entity.TareaEntity;

import java.util.List;

public interface TareaService {

    List<TareaCommand> findAll();

    TareaEntity findById(int idTarea);
}
