package app.core.entities.clients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Admin extends Client {

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", password='" + this.getPassword() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin admin)) return false;

        if (getId() != admin.getId()) return false;
        if (getName() != null ? !getName().equals(admin.getName()) : admin.getName() != null) return false;
        if (getEmail() != null ? !getEmail().equals(admin.getEmail()) : admin.getEmail() != null) return false;
        return getPassword() != null ? getPassword().equals(admin.getPassword()) : admin.getPassword() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }
}