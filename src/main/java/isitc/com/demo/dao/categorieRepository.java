package isitc.com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isitc.com.demo.entity.Categorie;

@Repository
public interface categorieRepository  extends JpaRepository<Categorie , Integer>{
	public List<Categorie> findByNomContains(String mc); 
}
