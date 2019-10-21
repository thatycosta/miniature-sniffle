package model;

import java.sql.Date;

import javax.persistence.*;


@Entity
public class Pessoa{
	@Column(name = "NOME")
	private String nome;
	
	@Id
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "DATA")
	private Date data;

	
	public Pessoa(){}

	public Pessoa(String nome, String cpf, Date data){
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getCpf(){
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public Date getData(){
		return data;
	}

	public void setData(Date data){
		this.data = data;
	}

	public boolean comprarCarro(String placaCarro) {
		return true;
	}
	
	public boolean vendeCarro(String placaCarro) {
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", data=" + data + "]";
	}

}