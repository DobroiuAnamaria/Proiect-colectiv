package com.example.demo.Entitites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name="UsersInfo")
public class UserInfo {
    @Getter
    @Id
    @Setter
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID ID;
    @Getter @Setter
    @Column(name="First Name")
    private String firstName;
    @Getter @Setter
    @Column(name="Last Name")
    private String lastName;
    @Getter @Setter
    @Column(name="Date Of Birth")
    private String dateOfBirth;
    @Getter @Setter
    @Column(name = "Phone Number")
    private String phoneNumber;

    public UserInfo(String firstName, String lastName, String dateOfBirth, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public UserInfo(UUID ID, String firstName, String lastName, String dateOfBirth, String phoneNumber) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
}
