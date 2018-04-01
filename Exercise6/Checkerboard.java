/**
 * Program: Week7
 * File: .java
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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Checkerboard extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Establish the colors we want to use
        Color black = new Color(0, 0, 0, 1);
        Color white = new Color(1, 1, 1, 1);

        ArrayList<Rectangle> rects = new ArrayList<Rectangle>(64);
        int top = 0;
        int left = 0;
        boolean color = false; // Alternate between the two colors
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Create a rectangle and put it somewhere on the screen
                Rectangle rect = new Rectangle(20, 20);
                rect.setX(left);
                rect.setY(top);

                // Alternate colors as we move down the row
                if(color) {
                    rect.setFill(black);
                    color = false;
                } else {
                    rect.setFill(white);
                    color = true;
                }

                rects.add(rect);

                // Move the next spot over by one rectangle
                left = left + 20;
            }

            // Restart the row, and move down one rectangle height
            left = 0;
            top = top + 20;

            // Invert the color so we alternate each row
            color = !color;
        }

        pane.getChildren().addAll(rects);

        // Setup the scene
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.setHeight(160);
        primaryStage.setWidth(160);
        primaryStage.show();
    }
}
