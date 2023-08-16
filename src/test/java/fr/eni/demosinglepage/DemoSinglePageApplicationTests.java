package fr.eni.demosinglepage;

import fr.eni.demosinglepage.bo.Personne;
import fr.eni.demosinglepage.dal.PersonneDao;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest



class DemoSinglePageApplicationTests {
    @Autowired
    private PersonneDao personneDao;

    @Autowired
    private EntityManager em;

    @Transactional
    @Rollback(false)
    @Test
    void testHeritage() {
//        Medecin m = new Medecin();
//        m.setNom("Maisel");
//        m.setPrenon("Lucas");
//        m.setAdresse("aaa");
//        m.setSpecialite("Cardio");
//        m.setTarif(25);
//        em.persist(m);
//
//        Patient p = new Patient();
//        p.setNom("Table");
//        p.setPrenon("Djamila");
//        p.setNss("123456");
//        p.setDiagnostic("Burne OUT");//
//        em.persist(p);
//
//        Personne pers1 = new Personne();
//        pers1.setNom("Moi1");
//        pers1.setPrenom("moi1");
//        pers1.setAdresse("chz moi1");
//        em.persist(pers1);
//
//        Personne pers2 = new Personne();
//        pers2.setNom("Moi2");
//        pers2.setPrenom("moi2");
//        pers2.setAdresse("chz moi2");
//        em.persist(pers2);
//
//        Personne pers3 = new Personne();
//        pers3.setNom("Moi3");
//        pers3.setPrenom("moi3");
//        pers3.setAdresse("chz moi3");
//        em.persist(pers3);
    }

    @Test
    @Transactional
    @Rollback(value = false)
    void testQueriesPersonne() {

//        Personne pers4 = new Personne();
//        pers4.setNom("Moi4");
//        pers4.setPrenom("moi4");
//        pers4.setAdresse("chz moi4");
//
//
//       List<Personne> pers = personneDao.findByNomIgnoreCase("moi4");
//        System.out.println(pers);
//
//       assertEquals(pers4, pers.get(0));
    }

    @Test
    void custumQueryJPQL() {
//        Personne pers4 = new Personne();
//        pers4.setNom("Moi4");
//        pers4.setPrenom("moi4");
//        pers4.setAdresse("chz moi4");
//
//        List<Personne> pers = personneDao.findCustum("chz moi4");
//        System.out.println(pers);
//
//        assertEquals(pers4.getAdresse(), pers.get(0).getAdresse());
    }

    @Test
    void custumQueryPersonByPrenom() {
        Personne pers3 = new Personne();
        pers3.setNom("Moi3");
        pers3.setPrenom("moi3");
        pers3.setAdresse("chz moi3");

        Personne pers = personneDao.findPersonneByPrenom("Moi3");
        System.out.println(pers);

        assertEquals(pers3.getPrenom(), pers.getPrenom());
    }

    @Test
    void contextLoads() {
    }

}
