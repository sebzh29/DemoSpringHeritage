package fr.eni.demosinglepage.bo;

import java.util.List;

import jakarta.persistence.*;

@Entity

public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String question;
    @ElementCollection
    private List<String> options;
    @ElementCollection
    private List<Boolean> bonneReponses;
}
