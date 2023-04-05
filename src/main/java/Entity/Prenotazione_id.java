package Entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Prenotazione_id implements Serializable {

    private String data;
    private String orario;



}
