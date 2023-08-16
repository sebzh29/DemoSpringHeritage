package fr.eni.demosinglepage.bo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "personne")
@Data
@AllArgsConstructor
@NoArgsConstructor
//Table_Per_Class
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//joined_table
//@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
@DiscriminatorValue(value = "pers")


//on vire pour Table_per_class pas pour single-page
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type")
//@DiscriminatorValue(value = "pers")
public class Personne implements Serializable {


    @Serial
    private static final long serialVersionUID = -8324627800669200252L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "personne_sequence",allocationSize = 1)
    private Integer id;
    private String prenom;
    private String nom;
    private String adresse;
    private LocalDate dateNaissance;

}
