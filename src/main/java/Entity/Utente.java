package Entity;


import jakarta.persistence.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="Iscritti")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    @ManyToMany
    @JoinTable( name = "corsi_scelti",
                joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name="corso_id",referencedColumnName = "id_corso"))
    private List<Corso> corsi;
    @OneToMany(mappedBy = "Prenotazione")
    private List<Prenotazione> prenotazioni;

    public Utente(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.corsi = new LinkedList<Corso>();
        this.prenotazioni = new LinkedList<Prenotazione>();
    }
}
