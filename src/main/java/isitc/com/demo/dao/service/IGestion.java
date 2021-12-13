package isitc.com.demo.dao.service;

import java.util.List;

import isitc.com.demo.entity.Categorie;
import isitc.com.demo.entity.Produit;

public interface IGestion {
	public void addProduct(Produit p);
	public void addProduct(Produit p,int idc);
	public List<Produit> getAllProducts();
	public List<Produit> getProduitPMC(String mc);
	public void delete(int id);

}
