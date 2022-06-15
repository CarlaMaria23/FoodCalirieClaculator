package com.example.foodCalorieCalculator.ui.mainMenu;

import com.example.foodCalorieCalculator.ui.ingredient.IngredientController;
import com.example.foodCalorieCalculator.ui.recipe.RecipeController;
import org.springframework.stereotype.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Controller
public class MainMenuController {
    private final MainMenuFrame mainMenuFrame;
    private final IngredientController ingredientController;
    private final RecipeController recipeController;

    public MainMenuController(MainMenuFrame mainMenuFrame,
                              IngredientController ingredientController,
                              RecipeController recipeController) {
        this.mainMenuFrame = mainMenuFrame;
        this.ingredientController = ingredientController;
        this.recipeController = recipeController;
    }

    public void prepareAndOpenFrame() {

        mainMenuFrame.getBtnRecipe().addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                recipeController.prepareAndOpenFrame();
            }
        });

        mainMenuFrame.getBtnIngredient().addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                ingredientController.prepareAndOpenFrame();
            }
        });

        mainMenuFrame.setVisible(true);
    }
}
