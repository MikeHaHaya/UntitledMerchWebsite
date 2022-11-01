package app.core.entities.merch;

import app.core.entities.clients.BusinessClient;

import javax.persistence.*;

@Entity
public abstract class Merch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private BusinessClient businessClient;

}
