package sgpp.marty.practicas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="importe")
public class Importe {

	@Id
	@GeneratedValue(generator="importe_id_seq")
	private int id;
	@ManyToOne
	private ObraSocial obraSocial;
	@ManyToOne
	private TipoPractica tipoPractica;
	private double arancel;
	private double honorarios;
	@Column(name="fecha_creacion")
	private Date fechaCreacion;
	
	public Importe() {}

	public int getId() {
		return id;
	}

	public ObraSocial getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	public TipoPractica getTipoPractica() {
		return tipoPractica;
	}

	public void setTipoPractica(TipoPractica tipoPractica) {
		this.tipoPractica = tipoPractica;
	}

	public double getArancel() {
		return arancel;
	}

	public void setArancel(double arancel) {
		this.arancel = arancel;
	}

	public double getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(double honorarios) {
		this.honorarios = honorarios;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	
		
}
