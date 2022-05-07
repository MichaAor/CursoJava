package grigoriadis.apiUsers.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String lastName;
    @Column(unique = true)
    private long dni;
    private String phNumber;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public long getDni() {
        return dni;
    }

    public long getId() {
        return id;
    }

    public String getPhNumber() {
        return phNumber;
    }
}
