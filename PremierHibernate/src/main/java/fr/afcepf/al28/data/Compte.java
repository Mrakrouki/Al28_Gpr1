package fr.afcepf.al28.data;

import java.util.Set;

public class Compte {

	private Integer numero;
	private String libelle;
	private Personne pers;
	private Set<Operation> operations;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Personne getPers() {
		return pers;
	}
	public void setPers(Personne pers) {
		this.pers = pers;
	}
	
	public Set<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(Integer numero, String libelle, Personne pers) {
		super();
		this.numero = numero;
		this.libelle = libelle;
		this.pers = pers;
	}
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", libelle=" + libelle + ", pers=" + pers + "]";
	}
	
	
}
