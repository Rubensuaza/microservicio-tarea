package co.edu.uco.tarea.mensajes;

public class MensajesException {


    public class MensajeTareaException{

        private MensajeTareaException() {super();
        }

        public static final String ID_TAREA_VACIO="El campo idTarea no puede ser nulo";
        public static final String NOMBRE_TAREA_VACIO="El campo nombreTarea no puede ser nulo";
        public static final String DESCRIPCION_TAREA_VACIO="El campo descripcionTarea no puede ser nulo";
    }



}
