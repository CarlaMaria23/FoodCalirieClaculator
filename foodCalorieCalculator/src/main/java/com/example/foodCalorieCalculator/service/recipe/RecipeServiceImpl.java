package com.example.foodCalorieCalculator.service.recipe;

import com.example.foodCalorieCalculator.entities.Recipe;
import com.example.foodCalorieCalculator.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void save(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    @Override
    public void remove(Recipe recipe) {
        recipeRepository.delete(recipe);
    }
}
