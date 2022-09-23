package co.edu.uniandes.dse.parcialejemplo.entities;

import lombok.Getter;
import lombok.Setter;
import uk.co.jemos.podam.common.PodamExclude;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Setter
@Getter
@Entity
public class HabitacionEntity extends BaseEntity{
    private int identificacion;
    private int personas;
    private int camas;
    private int baños;

    @PodamExclude
    @ManyToOne
    private HotelEntity hotel;
}
