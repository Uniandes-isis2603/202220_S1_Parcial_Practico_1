package co.edu.uniandes.dse.parcialejemplo.entities;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

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
public abstract class HabitacionEntity extends BaseEntity{

	private Integer numIdentificacion;
	private Integer numPersonas;
	private Integer numCamas;
	private Integer numBanios;
	
	@PodamExclude
	@ManyToOne
	private HotelEntity hotel;
}