/**
 * Program: Week7
 * File: ThreeCards.java
 * Summary: Displays 3 Random cards
 * Author: Chase Hausman
 * Date: March 31, 2018
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class ThreeCards extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the pane that displays the cards
        Pane pane = new HBox();
        pane.setPadding(new Insets(5, 5, 5, 5));

        // Create All Three Cards with Random Images
        Image card1 = new Image(getRandomCardImagePath());
        Image card2 = new Image(getRandomCardImagePath());
        Image card3 = new Image(getRandomCardImagePath());

        ImageView cardImage1 = new ImageView(card1);
        ImageView cardImage2 = new ImageView(card2);
        ImageView cardImage3 = new ImageView(card3);

        // Add all images to the pane
        pane.getChildren().addAll(cardImage1, cardImage2, cardImage3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Three Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String getRandomCardImagePath() {
        // Pick a random number between 0 and 52.
        int cardNumber = (int) Math.round(Math.random() * 52);

        // Concatenate the rest of the filename
        return "/card/" + cardNumber + ".png";
    }
}
