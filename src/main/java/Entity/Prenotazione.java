package Entity;

import jakarta.persistence.*;

@Entity
public class Prenotazione {
    @EmbeddedId
    private Prenotazione_id prenotazioneID;
    @ManyToOne
    @JoinColumn(name="id")
    private Utente prenotante;

    @ManyToOne
    @JoinColumn(name="campo_id")
    private Campo campo_prenotato;
    
}
