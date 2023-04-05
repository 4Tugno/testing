package Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Campo {

    @Id
    private int campo_id;

    @OneToMany(mappedBy = "campo_prenotato")
    private Prenotazione prenotazione;
}
