package fr.eni.demosinglepage.dal;

import fr.eni.demosinglepage.bo.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonneDao extends JpaRepository<Personne, Integer>, PersonneDaoCustum {

    List<Personne> findByNomIgnoreCase(String nom);

    @Query("SELECT p FROM Personne p WHERE p.adresse = ?1")
    List<Personne> findCustum(String adresse);




}
