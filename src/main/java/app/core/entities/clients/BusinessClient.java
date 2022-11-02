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
public class BusinessClient extends Client {

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Merch> merchList;

    @Override
    public String toString() {
        return "BusinessClient{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", password='" + this.getPassword() + '\'' +
                ", merchList=" + this.getMerchList() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessClient that)) return false;

        if (getId() != that.getId()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getEmail() != null ? !getEmail().equals(that.getEmail()) : that.getEmail() != null) return false;
        if (getPassword() != null ? !getPassword().equals(that.getPassword()) : that.getPassword() != null)
            return false;
        return getMerchList() != null ? getMerchList().equals(that.getMerchList()) : that.getMerchList() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getMerchList() != null ? getMerchList().hashCode() : 0);
        return result;
    }
}
