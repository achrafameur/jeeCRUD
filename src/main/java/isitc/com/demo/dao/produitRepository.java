package isitc.com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isitc.com.demo.entity.Produit;

@Repository
public interface produitRepository extends JpaRepository<Produit , Integer> {
	
	public List<Produit> findByNomContains(String mc); 
	
}
