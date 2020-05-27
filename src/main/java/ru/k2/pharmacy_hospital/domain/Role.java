package ru.k2.pharmacy_hospital.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "roles")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "role_name")
    String roleName;

    String description;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable( name = "roles_users",
        joinColumns = @JoinColumn (name = "role_id"), inverseJoinColumns = @JoinColumn(name = "user_id")
    )
 private   Set<Person> users ;

}