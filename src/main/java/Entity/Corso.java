package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;
@Entity
public class Corso {

    @Id
    private Integer id_corso;

    private String Tipo;
    private String Durata;
    private String Istruttore;

    @ManyToMany(mappedBy = "corsi")
    private List<Utente> partecipanti;
}
