package com.example.projet3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private static final int NUM_ROWS = 1;
    private static final int NUM_COLS = 4;
    private static final int CARD_WIDTH = 100;
    private static final int CARD_HEIGHT = 150;
    private static final String IMAGE2_PATH = "D:\\1SCHO\\3IL\\2_programmation\\java\\3_miniprojet\\Projet3\\src\\main\\resources\\com\\example\\projet3\\grenier.jpeg";
    private static final String IMAGE1_PATH = "D:\\1SCHO\\3IL\\2_programmation\\java\\3_miniprojet\\Projet3\\src\\main\\resources\\com\\example\\projet3\\yugiyoBack.jpeg";

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                final Button button = new Button();
                button.setPrefSize(CARD_WIDTH, CARD_HEIGHT);

                // chargement de l'image 1
                Image image1 = new Image(IMAGE1_PATH);
                ImageView imageView1 = new ImageView(image1);
                imageView1.setFitWidth(CARD_WIDTH);
                imageView1.setFitHeight(CARD_HEIGHT);
                button.setGraphic(imageView1);

                // gestionnaire d'événements pour le clic sur le bouton
                final boolean[] isImage1Displayed = {true};
                button.setOnAction(event -> {
                    if (isImage1Displayed[0]) {
                        // affichage de l'image 2
                        Image image2 = new Image(IMAGE2_PATH);
                        ImageView imageView2 = new ImageView(image2);
                        imageView2.setFitWidth(CARD_WIDTH);
                        imageView2.setFitHeight(CARD_HEIGHT);
                        button.setGraphic(imageView2);
                    } else {
                        // affichage de l'image 1
                        button.setGraphic(imageView1);
                    }
                    isImage1Displayed[0] = !isImage1Displayed[0];
                });

                gridPane.add(button, col, row);
            }
        }

        Scene scene = new Scene(gridPane);
        stage.setTitle("Cartes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
