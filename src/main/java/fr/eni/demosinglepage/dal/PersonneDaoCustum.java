package fr.eni.demosinglepage.dal;

import fr.eni.demosinglepage.bo.Personne;

public interface PersonneDaoCustum {

    Personne findPersonneByPrenom(String prenom);
}
