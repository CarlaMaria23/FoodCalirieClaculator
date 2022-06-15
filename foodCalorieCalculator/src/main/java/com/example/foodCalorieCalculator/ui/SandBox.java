package com.example.foodCalorieCalculator.ui;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class SandBox extends JFrame {
        private final JPanel contentPane;

        public SandBox() {
            String data[][]={ {"100", "Cozonac","100","200"},
                    {"101","Paine","300","200"},
                    {"102","Placinta","400","500"}};
            String column[]={"ID","Nume reteta","Glucide","Lipide"};

            // Initial bounds
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(new CardLayout(0, 0));

            // Panel
            final JPanel home = new JPanel();
            contentPane.add(home, "name_714429679706141");
            home.setLayout(null);

            final JPanel recipe = new JPanel();  // MOVED UP
            contentPane.add(recipe, "name_714431450350356");  // MOVED UP
            recipe.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Retete", TitledBorder.CENTER, TitledBorder.TOP));
            recipe.setLayout(null);  // MOVED UP

            final JPanel addRecipe = new JPanel();  // MOVED UP
            contentPane.add(addRecipe, "name_714831450350356");  // MOVED UP
            addRecipe.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Adauga Retete", TitledBorder.CENTER, TitledBorder.TOP));
            addRecipe.setLayout(null);  // MOVED UP

            final JPanel ingredients = new JPanel();  // MOVED UP
            contentPane.add(ingredients, "name_714431450888356");  // MOVED UP
            ingredients.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Ingrediente", TitledBorder.CENTER, TitledBorder.TOP));
            ingredients.setLayout(null);  // MOVED UP

            //Tables
            JTable recipeTable = new JTable(data, column);
            recipeTable.getTableHeader().setBackground(Color.lightGray);
//		recipeTable.setBounds(20, 100, 200, 200);
            JScrollPane scrollTableRecipe = new JScrollPane(recipeTable);
            scrollTableRecipe.setBounds(20, 100, 400, 150);
            recipe.add(scrollTableRecipe);

            // Functionality buttons
            // Retete
            JButton btnRecipe = new JButton("Retete");
            btnRecipe.addActionListener(new ActionListener() {
                public void actionPerformed(final ActionEvent e) {
                    home.setVisible(false);
                    recipe.setVisible(true);
                }
            });
            btnRecipe.setBounds(20, 20, 100, 50);
            home.add(btnRecipe);

            JButton btnAddRecipe = new JButton("Adauga Reteta");
            btnAddRecipe.addActionListener(new ActionListener() {
                public void actionPerformed(final ActionEvent e) {
                    recipe.setVisible(false);
                    addRecipe.setVisible(true);
                }
            });
            btnAddRecipe.setBounds(150, 20, 100, 50);
            recipe.add(btnAddRecipe);

            JButton btnSaveRecipe = new JButton("Salveaza Reteta");
            btnSaveRecipe.addActionListener(new ActionListener() {
                public void actionPerformed(final ActionEvent e) {
                    recipe.setVisible(false);
                    addRecipe.setVisible(true);
                }
            });
            btnSaveRecipe.setBounds(150, 20, 100, 50);
            addRecipe.add(btnSaveRecipe);

            JLabel recipeNameLabel = new JLabel("Nume reteta");
            recipeNameLabel.setBounds(20, 100, 200, 20);
            JTextField recipeName = new JTextField();
            recipeName.setBounds(180, 100, 200, 20);

            JLabel recipeGlucideLabel = new JLabel("Glucide");
            recipeGlucideLabel.setBounds(20, 130, 200, 20);
            JTextField recipeGlucide = new JTextField();
            recipeGlucide.setBounds(180, 130, 200, 20);

            JLabel recipeLipideLabel = new JLabel("Glucide");
            recipeLipideLabel.setBounds(20, 160, 200, 20);
            JTextField recipeLipide = new JTextField();
            recipeLipide.setBounds(180, 160, 200, 20);

            addRecipe.add(recipeNameLabel);
            addRecipe.add(recipeName);
            addRecipe.add(recipeGlucideLabel);
            addRecipe.add(recipeGlucide);
            addRecipe.add(recipeLipideLabel);
            addRecipe.add(recipeLipide);

            // Ingrediente
            JButton btnIngredients = new JButton("Ingrediente");
            btnIngredients.addActionListener(new ActionListener() {
                public void actionPerformed(final ActionEvent e) {
                    home.setVisible(false);
                    ingredients.setVisible(true);
                }
            });
            btnIngredients.setBounds(150, 20, 100, 50);
            home.add(btnIngredients);

            // Back buttons
            JButton btnHomeRecipe = new JButton("Back");
            btnHomeRecipe.addActionListener(new ActionListener() {
                public void actionPerformed(final ActionEvent e) {
                    recipe.setVisible(false);
                    home.setVisible(true);
                }
            });
            JButton btnHomeIngredients = new JButton("Back");
            btnHomeIngredients.addActionListener(new ActionListener() {
                public void actionPerformed(final ActionEvent e) {
                    ingredients.setVisible(false);
                    home.setVisible(true);
                }
            });
            btnHomeRecipe.setBounds(20, 20, 100, 50);
            btnHomeIngredients.setBounds(20, 20, 100, 50);

            recipe.add(btnHomeRecipe);
            ingredients.add(btnHomeIngredients);

        }
}
