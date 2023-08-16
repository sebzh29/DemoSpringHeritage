package fr.eni.demosinglepage.bo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//joined_table
@DiscriminatorValue(value = "pat")

//on vire pour Table_per_class pas pour single-page
//@DiscriminatorValue(value = "pat")
public class Patient extends Personne {

    private String nss;
    private String diagnostic;


}
