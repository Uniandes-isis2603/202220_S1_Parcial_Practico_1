package co.edu.uniandes.dse.parcialejemplo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcialejemplo.entities.HotelEntity;
import co.edu.uniandes.dse.parcialejemplo.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialejemplo.repositories.HotelRepository;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class HotelService {
    
    @Autowired
    HotelRepository hotelRepository;

    @Transactional
	    public HotelEntity crearHabitacion(HotelEntity hotel) throws IllegalOperationException {
		    log.info("Inicia proceso de creación del juego");
            for (HotelEntity cadahotel : hotelRepository.findAll()){
                if(cadahotel.getNombre().compareTo(hotel.getNombre())==0){
                    throw new IllegalOperationException("El hotel ya existe");
                }
            }
            if(hotel.getNumStars()<6 && hotel.getNumStars()>0)
            {
                throw new IllegalOperationException("El numero de estrellas no está entre 1-5");
            }
		    return hotelRepository.save(hotel);
	    }  
}