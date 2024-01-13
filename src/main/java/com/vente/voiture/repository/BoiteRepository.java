package com.vente.voiture.repository;


import com.vente.voiture.model.Boite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoiteRepository extends JpaRepository<Boite,String> {
}
