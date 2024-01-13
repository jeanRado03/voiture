package com.vente.voiture.repository;


import com.vente.voiture.model.Couleur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouleurRepository extends JpaRepository<Couleur,String> {
}
