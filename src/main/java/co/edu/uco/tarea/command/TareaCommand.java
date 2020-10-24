package co.edu.uco.tarea.command;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TareaCommand {

    private Integer idTarea;
    private String nombreTarea;
    private String descripcionTarea;
    private boolean activo;

}
