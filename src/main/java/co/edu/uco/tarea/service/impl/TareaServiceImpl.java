package co.edu.uco.tarea.service.impl;

import co.edu.uco.tarea.command.TareaCommand;
import co.edu.uco.tarea.entity.TareaEntity;
import co.edu.uco.tarea.fabrica.TareaFabrica;
import co.edu.uco.tarea.repository.TareaRepository;
import co.edu.uco.tarea.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    @Autowired
    private TareaFabrica tareaFabrica;

    @Override
    public List<TareaCommand> findAll() {
        return tareaFabrica.entityToCommand(tareaRepository.findAll());
    }

    @Override
    public TareaEntity findById(int idTarea) {
        return tareaRepository.findById(idTarea).orElse(null);
    }
}
