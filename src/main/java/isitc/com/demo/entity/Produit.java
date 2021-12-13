package isitc.com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;


@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min = 2 , max = 30,message="la taille du nom doit etre entre 2 et 30")
	@Column(name = "nomProduit")
	private String nom;
	@DecimalMin(value="0")
	@DecimalMax(value="20000")
	private double prix;
	private int quantite;
	
	@ManyToOne
	private Categorie categorie;
	
	public int getId() {
		return id;
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

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + ", categorie="
				+ categorie + "]";
	}

	public Produit(int id, @Size(min = 2, max = 10, message = "la taille du nom doit etre entre 2 et 10") String nom,
			@DecimalMin("0") @DecimalMax("20000") double prix, int quantite, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
		this.categorie = categorie;
	}

	public Produit() {
		super();
	}
	
}