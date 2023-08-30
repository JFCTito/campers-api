package com.backend.campersapi.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor

public class Camper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    @NotNull(message= "name is required")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;
    @Column(name = "age")
    private Integer age;
    @NotNull(message= "username is required")
    @Column(name = "username")
    private String username;
    @NotNull(message= "password is required")
    @Size(min = 8, message = "password must be between 5 and 50 characters")
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "camper")
    private Set<Signup> signups;
}

