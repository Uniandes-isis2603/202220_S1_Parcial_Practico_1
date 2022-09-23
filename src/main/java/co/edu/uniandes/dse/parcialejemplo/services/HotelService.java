package co.edu.uniandes.dse.parcialejemplo.services;

import co.edu.uniandes.dse.parcialejemplo.entities.HabitacionEntity;
import co.edu.uniandes.dse.parcialejemplo.entities.HotelEntity;
import co.edu.uniandes.dse.parcialejemplo.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialejemplo.repositories.HabitacionRepository;
import co.edu.uniandes.dse.parcialejemplo.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service

public class HotelService {
    @Autowired
    private HotelRepository  repositorio;

    @Transactional
    public HotelEntity createHotel(HotelEntity hotel) throws IllegalOperationException {
        List<HotelEntity> hoteles = HotelRepository.findAll();

        for (HotelEntity hotelEncontrado: hoteles) {
            if (hotel.getNombre().equals(hotelEncontrado)) throw new IllegalOperationException

        }

        return repositorio.save(hotel);
    }
