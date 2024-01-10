package com.suleman.techjob.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
/**
 * Represents a user in the system with a unique identifier, username, email, and password.
 * Users can be associated with multiple roles for authorization.
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Entity
public class User {



        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;

        @Column( nullable = false, unique=true)
        private String username;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false)
        private String password;



        public User(String username, String email, String password, List<Role> roles) {
            this.username = username;
            this.email = email;
            this.password = password;
            this.roles = roles;
        }

        //potentially need reference type
        @ManyToMany(fetch= FetchType.EAGER, cascade=CascadeType.ALL)
        @JoinTable(name="user_roles", joinColumns={@JoinColumn(name="user_id",referencedColumnName = "id")}, inverseJoinColumns={@JoinColumn(name="role_id",referencedColumnName = "id")})
        private List<Role> roles = new ArrayList<>();


        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }



    }
