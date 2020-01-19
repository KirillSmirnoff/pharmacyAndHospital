package ru.k2.pharmacy_hospital.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long Id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String login;
    private String password;

//    @Temporal(TemporalType.DATE)
    private Date birthday;

    private String disease;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;
    private boolean status;
    private String gender;
    private int role;

    public String getPassword() {
        return password;
    }
}
