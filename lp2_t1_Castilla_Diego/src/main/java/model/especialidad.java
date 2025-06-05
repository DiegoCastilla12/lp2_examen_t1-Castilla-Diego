package model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_especialidad")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter

public class especialidad {
	@Id
	@Column(name = "id_especialidad")
	@EqualsAndHashCode.Include
    private int idEspecialidad;
	
	@Column(name = "titulo")
	private String titulo;
	
	@OneToMany(mappedBy = "especialidad")
    private List<dentista> dentista;

    @Override
    public String toString() {
        return titulo;
    }
	
}
