package com.vente.voiture.repository;


import com.vente.voiture.model.Moteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoteurRepository extends JpaRepository<Moteur,String> {
}
