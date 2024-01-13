package com.vente.voiture.repository;

import com.vente.voiture.model.Carburant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarburantRepository extends JpaRepository<Carburant,String> {
}
