package sgpp.marty.practicas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="obrasocial")
public class ObraSocial {
	
	@Id
	@GeneratedValue(generator="obrasocial_id_seq")
	private int id;
	@Column(name="razonsocial")
	private String razonSocial;
	
	public ObraSocial() {}
	public ObraSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getId() {
		return id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObraSocial other = (ObraSocial) obj;
		if (razonSocial == null) {
			if (other.razonSocial != null)
				return false;
		} else if (!razonSocial.equals(other.razonSocial))
			return false;
		return true;
	}
	
	
	
}
