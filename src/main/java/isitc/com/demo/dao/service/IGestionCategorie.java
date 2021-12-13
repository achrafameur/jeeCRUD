package isitc.com.demo.dao.service;

import java.util.List;
import java.util.Optional;

import isitc.com.demo.entity.Categorie;
import isitc.com.demo.entity.Produit;


public interface IGestionCategorie {
	
	public List<Categorie> getAllCategories();
	public Categorie getCategorie(int idc);
	public List<Categorie> getCategoriePMC(String mc);
	public void addCategorie(Categorie c);
	public void deleteCategorie(int id);

}
