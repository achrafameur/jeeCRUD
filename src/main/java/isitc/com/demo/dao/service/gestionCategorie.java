package isitc.com.demo.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isitc.com.demo.dao.categorieRepository;
import isitc.com.demo.dao.produitRepository;
import isitc.com.demo.entity.Categorie;

@Service
public class gestionCategorie implements IGestionCategorie {
	@Autowired
	categorieRepository cr;
	
	
	@Override
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return cr.findAll();
		
	}

	@Override
	public Categorie getCategorie(int idc) {
		// TODO Auto-generated method stub
		return cr.findById(idc).get();
	}

	@Override
	public void addCategorie(Categorie c) {
		// TODO Auto-generated method stub
		cr.save(c);		
	}

	@Override
	public void deleteCategorie(int id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public List<Categorie> getCategoriePMC(String mc) {
		// TODO Auto-generated method stub
		return cr.findByNomContains(mc);
	}

}
