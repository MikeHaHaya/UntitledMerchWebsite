package app.core.entities.clients;

import app.core.entities.merch.Merch;

import javax.persistence.*;
import java.util.List;

@Entity
public class BusinessClient extends Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name, email, password;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Merch> merchList;
}
