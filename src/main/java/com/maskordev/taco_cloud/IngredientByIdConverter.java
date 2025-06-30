package com.maskordev.taco_cloud;

import com.maskordev.taco_cloud.Ingredient;
import com.maskordev.taco_cloud.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
   private IngredientRepository ingredientRepository;

   @Autowired
   public IngredientByIdConverter(IngredientRepository ingredientRepository) {
       this.ingredientRepository = ingredientRepository;
   }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id).orElse(null);
    }
}
