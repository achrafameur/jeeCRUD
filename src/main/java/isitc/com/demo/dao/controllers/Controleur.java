package isitc.com.demo.dao.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import isitc.com.demo.dao.produitRepository;
import isitc.com.demo.dao.service.IGestion;
import isitc.com.demo.dao.service.IGestionCategorie;
import isitc.com.demo.entity.Categorie;
import isitc.com.demo.entity.Produit;

@Controller
@RequestMapping("/app")
public class Controleur {

//	@Autowired
//	produitRepository pr;
	
	
	@Autowired
	IGestion gestpr;
	@Autowired
	IGestionCategorie gestcat;
	
	
	@GetMapping("/home")
	public String getHome() {
	return "home";
	}
	@GetMapping("/product")
	public String getProduct(Model m) {
		m.addAttribute("categories",gestcat.getAllCategories());
		return "addP";
	}
	@GetMapping("/categorie")
	public String getCategorie() {
	return "addC";
	}
	
	
//	Product 
	@GetMapping("/products")
	public String getAllProducts(Model m) {
		List<Produit> l = gestpr.getAllProducts();
		m.addAttribute("liste",l);
		m.addAttribute("categories",gestcat.getAllCategories());
		return "allP";
	}
	
	@PostMapping("/addproduit")
	public String ajouterProduit(@Valid Produit produit ,BindingResult br,  int cc,Model m ) {
		if(br.hasErrors()){
			List<Produit> l = gestpr.getAllProducts();
			m.addAttribute("liste",l);
			m.addAttribute("categories",gestcat.getAllCategories());
			return "addP";
		}else{
			Categorie categorie = gestcat.getCategorie(cc);
			produit.setCategorie(categorie);
			gestpr.addProduct(produit);
			return "redirect:/app/products";
		}
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable final int id) {
		gestpr.delete(id);
		return "redirect:/app/products";
	}
	
	
	@PostMapping("/recherche.php")
	public String rechercheProduit( String mc , Model m ) {
		List<Produit> l = gestpr.getProduitPMC(mc);
		m.addAttribute("liste",l);
		return "allP";
	}
	
	
	
	
//	Category
	
	@GetMapping("/categories")
	public String getAllCategories(Model m) {
		List<Categorie> l = gestcat.getAllCategories();
		m.addAttribute("listeCat",l);
		return "allC";
	}
	@PostMapping("/addcategorie")
	public String ajouterCategorie(@Valid Categorie categorie ,BindingResult br,Model m ) {
		if(br.hasErrors()){
			List<Categorie> l = gestcat.getAllCategories();
			m.addAttribute("listeCat",l);
			return "addC";
		}else{
			gestcat.addCategorie(categorie);
			return "redirect:/app/categories";
		}
	}
	
	@GetMapping("/deleteCat/{id}")
	public String deleteCategorie(@PathVariable final int id) {
		gestcat.deleteCategorie(id);
		return "redirect:/app/categories";
	}
	
	@PostMapping("/rechercheCat.php")
	public String rechercheCat( String mc , Model m ) {
		List<Categorie> l = gestcat.getCategoriePMC(mc);
		m.addAttribute("listeCat",l);
		return "allC";
	}
}
