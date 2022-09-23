package co.edu.uniandes.dse.parcialejemplo.services;

import co.edu.uniandes.dse.parcialejemplo.entities.HabitacionEntity;
import co.edu.uniandes.dse.parcialejemplo.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialejemplo.repositories.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

public class HabitacionService {
    @Autowired
    private HabitacionRepository repositorio;

    @Transactional
    public HabitacionEntity createHabitacion(HabitacionEntity habitacion) throws IllegalOperationException {
        if (habitacion.getBaños() > habitacion.getCamas())
            throw new IllegalOperationException("El numero de banos no puede superar al numero de camas de la habitacion");

        return repositorio.save(habitacion);


    }

}