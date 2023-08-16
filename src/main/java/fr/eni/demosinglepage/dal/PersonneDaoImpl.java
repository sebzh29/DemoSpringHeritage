package fr.eni.demosinglepage.dal;

import fr.eni.demosinglepage.bo.Personne;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonneDaoImpl implements PersonneDaoCustum{

    @Autowired
    private EntityManager em;
    @Override
    public Personne findPersonneByPrenom(String prenom) {
        TypedQuery<Personne> tQuery =em.createQuery(
                "SELECT p FROM Personne p WHERE p.prenom LIKE :prenom",
                Personne.class
        );
        tQuery.setParameter("prenom","%"+prenom+"%");

        return tQuery.getSingleResult();
    }
}
