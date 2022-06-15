package com.example.foodCalorieCalculator.service.ingredient;

import com.example.foodCalorieCalculator.entities.Ingredient;
import com.example.foodCalorieCalculator.entities.Recipe;

public interface IngredientService {
    void save(Ingredient ingredient);

    void remove(Ingredient ingredient);
}
