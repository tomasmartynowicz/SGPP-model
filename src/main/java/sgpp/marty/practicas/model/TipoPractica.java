package sgpp.marty.practicas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipopractica")
public class TipoPractica {
	@Id
	@GeneratedValue(generator="tipopractica_id_seq")
	private int id;
	private String tipo;
	
	public TipoPractica() {}
	public TipoPractica(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoPractica other = (TipoPractica) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	};
	
}
