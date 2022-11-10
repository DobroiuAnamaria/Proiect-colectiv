package Entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Getter @Id @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Getter
    @Setter
    private String mail; //adresa de mail
    @Getter
    @Setter
    private String password; // parola de logare
    @Getter
    @Setter
    private String nameClient; //nume fam + prenume

    @Override
    public String toString() {
        return "Client{" +
                "username='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", NameClient='" + nameClient + '\'' +

                '}';
    }
    public Client(String username, String password, String nameClient) {
        this.mail = username;
        this.password = password;
        this.nameClient = nameClient;
    }
}