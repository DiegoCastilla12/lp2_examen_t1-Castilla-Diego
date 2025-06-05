package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_equipo_dental")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class equipo {
	@Id
	@Column(name = "nro_equipo")
	@EqualsAndHashCode.Include
    private int nroEquipo;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "costo")
    private double costo;
	
	@Column(name = "fecha_adquisicion")
	private LocalDate fechaAdquisicion;

	@Column(name = "estado")
    private String estado;
	
	
	@ManyToOne
	@JoinColumn(name = "id_dentista")
	private dentista dentista;
	
}
