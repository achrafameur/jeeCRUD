package isitc.com.demo.dao.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isitc.com.demo.dao.categorieRepository;
import isitc.com.demo.dao.produitRepository;
import isitc.com.demo.dao.service.IGestion;
import isitc.com.demo.dao.service.IGestionCategorie;
import isitc.com.demo.entity.Categorie;
import isitc.com.demo.entity.Produit;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class Controleur2 {
	
	@Autowired
	IGestion gestionproduit;
	@Autowired
	IGestionCategorie gestioncategorie;
	@Autowired
	produitRepository pr;
	@Autowired
	categorieRepository cr;
	
	@GetMapping("/products")
	public List<Produit> getAllProducts(){
		return gestionproduit.getAllProducts();
	} 
	
	@PostMapping("/addproduct")
	public void AddProduct(@RequestBody Produit p){
		gestionproduit.addProduct(p);
	} 
	
	@DeleteMapping("/deleteproduct/{id}")
	public void deleteProduct(@PathVariable("id") int productId ){
		gestionproduit.delete(productId);
	} 
	
	@GetMapping("/products/{mc}")
	public List<Produit> ProductByMC(@PathVariable("mc") String mot ){
		return gestionproduit.getProduitPMC(mot);
	} 
	
	@GetMapping("/product/{id}")
	public Produit productById(@PathVariable("id") int id ){
		return pr.findById(id).get();
	}
	
	
	@DeleteMapping("/deletecategorie/{id}")
	public void deleteCategorie(@PathVariable("id") int categorieId ){
		Categorie c = cr.findById(categorieId).get();
		for(Produit p : c.getListe())
			p.setCategorie(null);
		cr.delete(c);
	} 
	
}
