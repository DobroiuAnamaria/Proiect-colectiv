package com.example.demo.entitites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="Users")
@NoArgsConstructor
public class User {
    @Getter @Id @Setter @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Getter
    @Setter
    @Column(name="Email")
    private String mail; //adresa de mail
    @Getter
    @Setter
    @Column(name="Password")
    private String password; // parola de logare
    @Getter
    @Setter
    @Column(name="Username")
    private String userName; //nume fam + prenume
    @Getter
    @Setter
    @OneToOne
    private UserInfo userInfo;
    @Override
    public String toString() {
        return "Client{" +
                "username='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", NameClient='" + userName + '\'' +
                '}';
    }

    public User(String mail, String password, String userName, UserInfo userInfo) {
        this.mail = mail;
        this.password = password;
        this.userName = userName;
        this.userInfo = userInfo;
    }

    public User(UUID ID, String mail, String password, String userName, UserInfo userInfo) {
        this.ID = ID;
        this.mail = mail;
        this.password = password;
        this.userName = userName;
        this.userInfo = userInfo;
    }
}