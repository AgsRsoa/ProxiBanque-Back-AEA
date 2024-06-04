package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long>{
	
	List<Compte> findByClientId(Long idClient);
	List<Compte> findBySoldeLessThan(double solde);
	

}
