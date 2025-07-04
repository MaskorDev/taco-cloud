package com.maskordev.taco_cloud;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

@Data
public class Taco {
    public Taco() {

    }
    private Long id;

    private Date createdAt = new Date();

    @NonNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @NonNull
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
