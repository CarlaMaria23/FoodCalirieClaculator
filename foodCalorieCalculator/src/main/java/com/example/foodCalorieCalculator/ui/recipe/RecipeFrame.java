package com.example.foodCalorieCalculator.ui.recipe;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

public class RecipeFrame extends JFrame {
    private final RecipeFrame recipeFrame;

    public RecipeFrame(RecipeFrame recipeFrame) {
        this.recipeFrame = recipeFrame;
    }


    @PostConstruct
    private void prepareFrame() {
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
    }

    private void initComponents() {
        add(recipeFrame, BorderLayout.CENTER);
    }

}
