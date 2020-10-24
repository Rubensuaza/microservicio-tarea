package co.edu.uco.tarea.util;


import co.edu.uco.tarea.model.Tarea;
import co.edu.uco.tarea.model.businessexception.BusinessException;

import java.util.Date;

public class Validator {

    public Validator() {super();
    }

    public static void numberNull(Integer valor, String mensaje) throws BusinessException{
        if(valor==null){
            throw new BusinessException(mensaje);

        }
    }

    public static void textNull(String valor, String mensaje) throws BusinessException{
        if(valor==null){
            throw new BusinessException(mensaje);

        }
    }



}
