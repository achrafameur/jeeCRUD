package isitc.com.demo.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isitc.com.demo.dao.produitRepository;
import isitc.com.demo.entity.Produit;

@Service
public class gestionProduit implements IGestion{

	@Autowired
	produitRepository pr;
	
	@Override
	public void addProduct(Produit p) {
		// TODO Auto-generated method stub
		pr.save(p);
		
	}

	@Override
	public void addProduct(Produit p, int idc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produit> getAllProducts() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public List<Produit> getProduitPMC(String mc) {
		// TODO Auto-generated method stub
		return pr.findByNomContains(mc);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
		
	}

}
