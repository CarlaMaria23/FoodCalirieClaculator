package com.example.foodCalorieCalculator.service.ingredient;

import com.example.foodCalorieCalculator.entities.Ingredient;
import com.example.foodCalorieCalculator.repository.IngredientRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService{
    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public void save(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }

    @Override
    public void remove(Ingredient ingredient) {
        ingredientRepository.delete(ingredient);
    }
}
