package ru.k2.pharmacy_hospital.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "users")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String login;
    private String password;

    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.PERSIST})
    @JoinTable(name = "roles_users",
        joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id")
    )
      private   Set<Role> roles = new HashSet<>() ;

//    @Temporal(TemporalType.DATE)
    private Date birthday;

    private String disease;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;
    private String gender;

}
