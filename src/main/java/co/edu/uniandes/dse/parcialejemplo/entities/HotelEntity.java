package co.edu.uniandes.dse.parcialejemplo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import uk.co.jemos.podam.common.PodamExclude;

/**
 * Entidad genérica de la que heredan todas las entidades. Contiene la
 * referencia al atributo id
 *
 * @author CristianCaro
 */

@Getter
@Setter
@Entity
public abstract class HotelEntity extends BaseEntity{

	private String nombre;
    private String direccion;
    private Integer numStars;
    
    @PodamExclude
	@OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
	private List<HabitacionEntity> habitaciones = new ArrayList<>();
}
