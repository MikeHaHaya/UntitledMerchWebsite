package app.core.entities.clients;

import app.core.entities.merch.Merch;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PrivateClient extends Client {

    @ManyToMany(fetch = FetchType.LAZY) // TODO -- Find the best way to do this
    @JoinTable(name = "p-clients_merch", joinColumns = @JoinColumn(name = "p-clients_id"), inverseJoinColumns = @JoinColumn(name = "merch_id"))
    private List<Merch> merchList;

    @Override
    public String toString() {
        return "PrivateClient{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", password='" + this.getPassword() +  '\'' +
                ", merchList=" + this.getMerchList() +
                '}';
    }

    // TODO -- Set equals and hashCode correctly
    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
