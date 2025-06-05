package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@Getter
@Setter
public class dentista {
	@Id
	@Column(name = "id_dentista")
    private int idDentista;
	
	@Column(name = "cop")
	private String cop;
	
	@Column(name = "nombre_completo")
    private String nombreCompleto;
	
	@Column(name = "fecha_inicio_contrato")
	private LocalDate fechaInicioContrato;

	@Column(name = "turno")
    private String turno;
	
	@Column(name = "correo")
	private String correo;
	
	@Override
    public String toString() {
        return cop; 
    }
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_especialidad")
	private especialidad especialidad;
	
	@OneToMany(mappedBy = "equipo", fetch = FetchType.LAZY)
    private List<equipo> equipos;
}
