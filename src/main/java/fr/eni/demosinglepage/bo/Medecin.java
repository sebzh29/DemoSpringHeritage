package fr.eni.demosinglepage.bo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//joined_table
@DiscriminatorValue(value = "med")

//on vire pour Table_per_class pas pour single-page
//@DiscriminatorValue(value = "med")
public class Medecin extends Personne {

    private String specialite;
    private float tarif;

}
