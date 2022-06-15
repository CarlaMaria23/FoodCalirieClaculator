package com.example.foodCalorieCalculator.ui.ingredient;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class IngredientFrame extends JFrame {

    private final IngredientPanel ingredientPanel;

    public IngredientFrame(IngredientPanel ingredientPanel) {
        this.ingredientPanel = ingredientPanel;
    }

    @PostConstruct
    private void prepareFrame() {
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
    }

    private void initComponents() {
        add(ingredientPanel, BorderLayout.CENTER);
    }

}
