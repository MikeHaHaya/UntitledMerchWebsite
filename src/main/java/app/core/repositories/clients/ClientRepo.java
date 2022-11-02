package app.core.repositories.clients;

import app.core.entities.clients.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("clientRepo")
public abstract interface ClientRepo extends JpaRepository<Client, Integer> {

    boolean existsClientByEmailAndPassword(String email, String password);

    boolean existsClientByEmail(String email);

    boolean existsClientByName(String name);

    Client findClientByEmailAndPassword(String email, String password);

}
