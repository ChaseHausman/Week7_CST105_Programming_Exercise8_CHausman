/**
 * Program: Week7
 * File: ColorAndFont.java
 * Summary:
 * Author: Chase Hausman
 * Date: March 31, 2018
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ColorAndFont extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a place to store everything
        Pane pane = new HBox();
        pane.setPadding(new Insets(20, 5, 5, 5));

        // Set the font that will be used for all 6 words
        Font requiredFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);

        // Store all of the text objects in an ArrayList,
        // Loop through 6 times to get new random values each time
        ArrayList<Text> texts = new ArrayList<Text>(6);
        for (int i = 0; i < 6; i++) {
            Text text = new Text("Java");

            // Create a random color each iteration
            Color randomColor = new Color(getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomNumber());

            // Apply the parameters to each text object.
            text.setFont(requiredFont);
            text.setRotate(90);
            text.setFill(randomColor);
            texts.add(text);
        }

        // Add everything to the pane and setup the scene
        pane.getChildren().addAll(texts);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Colors!");
        primaryStage.setScene(scene);
        primaryStage.setMinHeight(100);
        primaryStage.show();
    }

    private double getRandomNumber() {
        return Math.random();
    }
}
