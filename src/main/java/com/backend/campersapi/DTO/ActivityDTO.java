package com.backend.campersapi.DTO;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ActivityDTO {
    private Long id;

    @NotNull(message = "Activity name is required")
    private String name;

    @Positive(message = "Difficulty must be a positive number")
    private Integer difficulty;
}