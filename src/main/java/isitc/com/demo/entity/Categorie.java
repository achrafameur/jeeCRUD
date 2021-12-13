package isitc.com.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;


@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min = 2 , max = 30,message="la taille du nom doit etre entre 2 et 30")
	private String nom;
	@OneToMany(mappedBy = "categorie")
	private List<Produit>liste=new ArrayList<Produit>();

	
	public int getId() {
		return id;
	}
	public Categorie() {
		super();
	}
	public Categorie(int id, String nom, List<Produit> liste) {
		super();
		this.id = id;
		this.nom = nom;
		this.liste = liste;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", liste=" + liste + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Produit> getListe() {
		return liste;
	}
	public void setListe(List<Produit> liste) {
		this.liste = liste;
	}

	
	

}
