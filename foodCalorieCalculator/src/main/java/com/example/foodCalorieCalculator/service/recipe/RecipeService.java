package com.example.foodCalorieCalculator.service.recipe;

import com.example.foodCalorieCalculator.entities.Recipe;

public interface RecipeService {
    void save(Recipe recipe);

    void remove(Recipe recipe);
}
