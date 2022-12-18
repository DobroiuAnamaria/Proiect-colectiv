package com.example.demo.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
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

    @Override
    public String toString() {
        return "ClientDTO{" +
                "mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public UserDTO(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }
}
