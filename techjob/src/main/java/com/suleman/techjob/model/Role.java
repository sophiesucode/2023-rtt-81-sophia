package com.suleman.techjob.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user role in the system with a unique identifier, name, and associated users.
 */
@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Role(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public Role(Long id, String name, List<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public Role(String name) {
    }

    //mapped by "roles" in User
    @ManyToMany(mappedBy = "roles")
    private List<User> users= new ArrayList<>();




    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

