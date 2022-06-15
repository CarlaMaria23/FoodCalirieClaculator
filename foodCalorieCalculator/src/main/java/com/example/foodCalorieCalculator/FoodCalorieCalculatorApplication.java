package com.example.foodCalorieCalculator;

import com.example.foodCalorieCalculator.ui.SandBox;
import com.example.foodCalorieCalculator.ui.mainMenu.MainMenuController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class FoodCalorieCalculatorApplication {

	private static void displayMainFrame(ConfigurableApplicationContext context) {
		SwingUtilities.invokeLater(() -> {
			try {
				SandBox sandBox = context.getBean(SandBox.class);
				sandBox.setVisible(true);

				/*
				//Display menu:

				MainMenuController mainMenuController  = context.getBean(MainMenuController.class);
				mainMenuController.prepareAndOpenFrame();
				*/
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	private static ConfigurableApplicationContext createApplicationContext(String[] args) {
		return new SpringApplicationBuilder(FoodCalorieCalculatorApplication.class)
				.headless(false)
				.run(args);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = createApplicationContext(args);
		displayMainFrame(context);
	}
}
