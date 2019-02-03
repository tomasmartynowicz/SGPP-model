package sgpp.marty.practicas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="practica")
public class Practica {

	@Id
	@GeneratedValue(generator="practica_id_seq")
	private int id;
	@ManyToOne
	private Paciente paciente;
	private String obraSocial;
	private String tipoPractica;
	private Date fecha;
	private String lugar;
	private double arancel;
	private double honorarios;
	
	public Practica() {}

	public int getId() {
		return id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
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

	public double calcularImporteTotal() {
		return arancel + honorarios;
	}	
	
}
