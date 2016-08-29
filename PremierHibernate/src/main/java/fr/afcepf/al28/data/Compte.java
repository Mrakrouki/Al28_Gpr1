package fr.afcepf.al28.data;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numero", nullable = false)
	private Integer numero;
	@Column(name="libelle", nullable = false)
	private String libelle;
	@ManyToOne
	@JoinColumn(name="id_personne")
	private Personne pers;
	@OneToMany(mappedBy="compte")
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
