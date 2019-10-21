package model;

import java.sql.Date;


import javax.persistence.*;

@Entity
public class Carro {
	
	@Id
	@Column(name = "PLACA")
	private String placa;
	
	@Column(name = "CPF_PROPRIETARIO")
	private String cpfProprietario;
	
	@Column(name = "MODELO")
	private String modelo;
	
	@Column(name = "ANO")
	private Date ano;
	
	@Column(name = "MARCA")
	private String marca;
	
	public Carro() {}
	
	public Carro(String placa, String cpfProprietario, String modelo, Date ano, String marca) {
		this.placa = placa;
		this.cpfProprietario = cpfProprietario;
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCpfProprietario() {
		return cpfProprietario;
	}

	public void setCpfProprietario(String cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public boolean temProprietario() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((cpfProprietario == null) ? 0 : cpfProprietario.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (cpfProprietario == null) {
			if (other.cpfProprietario != null)
				return false;
		} else if (!cpfProprietario.equals(other.cpfProprietario))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", cpfProprietario=" + cpfProprietario + ", modelo=" + modelo + ", ano=" + ano
				+ ", marca=" + marca + "]";
	}
	

}
