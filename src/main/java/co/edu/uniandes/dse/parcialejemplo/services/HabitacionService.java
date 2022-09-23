package co.edu.uniandes.dse.parcialejemplo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcialejemplo.entities.HabitacionEntity;
import co.edu.uniandes.dse.parcialejemplo.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialejemplo.repositories.HabitacionRepository;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class HabitacionService {
    
    @Autowired
    HabitacionRepository habitacionRepository;

    @Transactional
	    public HabitacionEntity crearHabitacion(HabitacionEntity habitacion) throws IllegalOperationException {
		    log.info("Inicia proceso de creación del juego");

		    if(habitacion.getNumIdentificacion() >= habitacion.getNumCamas()) {
			    throw new IllegalOperationException("El numero de camas es mayor o igual al numeor de identificación");
	        }
		    return habitacionRepository.save(habitacion);
	    }  
}
