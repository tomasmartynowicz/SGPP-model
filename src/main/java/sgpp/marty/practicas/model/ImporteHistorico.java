package sgpp.marty.practicas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="importe_historico")
public class ImporteHistorico {
	@Id
	@GeneratedValue(generator="importe_historico_id_seq")
	private int id;
	private String obraSocial;
	private String tipoPractica;
	private double arancel;
	private double honorarios;
	@Column(name="fecha_creacion")
	private Date fechaCreacion;
	@Column(name="fecha_vencimiento")
	private Date fechaVencimiento;
	
	public ImporteHistorico() {}

	public int getId() {
		return id;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public String getTipoPractica() {
		return tipoPractica;
	}

	public void setTipoPractica(String tipoPractica) {
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

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImporteHistorico other = (ImporteHistorico) obj;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (fechaVencimiento == null) {
			if (other.fechaVencimiento != null)
				return false;
		} else if (!fechaVencimiento.equals(other.fechaVencimiento))
			return false;
		if (obraSocial == null) {
			if (other.obraSocial != null)
				return false;
		} else if (!obraSocial.equals(other.obraSocial))
			return false;
		if (tipoPractica == null) {
			if (other.tipoPractica != null)
				return false;
		} else if (!tipoPractica.equals(other.tipoPractica))
			return false;
		return true;
	}
}
