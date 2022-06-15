package com.example.foodCalorieCalculator.ui.mainMenu;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@Component
@Setter
@Getter
public class MainMenuFrame extends JFrame {
    private JButton btnRecipe;
    private JButton btnIngredient;

    private final MainMenuPanel mainMenuPanel;

    public MainMenuFrame(MainMenuPanel mainMenuPanel) {
        this.mainMenuPanel = mainMenuPanel;
    }

    @PostConstruct
    private void prepareFrame() {
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        mainMenuPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(mainMenuPanel);
        mainMenuPanel.setLayout(new CardLayout(0, 0));
    }

    private void initComponents() {
        btnRecipe = new JButton("Retete");
        btnRecipe.setBounds(20, 20, 100, 50);

        btnIngredient = new JButton("Ingrediente");
        btnIngredient.setBounds(150, 20, 100, 50);

        add(btnRecipe);
        add(btnIngredient);
    }

    public JButton getBtnRecipe() {
        return btnRecipe;
    }

    public void setBtnRecipe(JButton btnRecipe) {
        this.btnRecipe = btnRecipe;
    }

    public JButton getBtnIngredient() {
        return btnIngredient;
    }

    public void setBtnIngredient(JButton btnIngredient) {
        this.btnIngredient = btnIngredient;
    }
}
