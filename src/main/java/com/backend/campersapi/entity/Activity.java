package com.backend.campersapi.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Table(name = "activity")

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "difficulty")
    private Integer difficulty;

    @OneToMany(mappedBy = "activity")
    private Set<Signup> signups;
}