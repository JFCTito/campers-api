package com.backend.campersapi.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Data
@Table(name = "signup")

public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "camper_id")
    private Camper camper;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @NotNull(message = "Camper ID is required")
    @Column(name = "camper_id", insertable = false, updatable = false)
    private Long camperId;

    @NotNull(message = "Activity ID is required")
    @Column(name = "activity_id", insertable = false, updatable = false)
    private Long activityId;

}
