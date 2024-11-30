package com.example.exercise157;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ChangeCircleColor extends Application {


    private CirclePane circlePane = new CirclePane();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        //



        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);


        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage


        // Change color of the circle when the user presses the left mouse button and releases it
        circlePane.setOnMousePressed(e -> {
                circlePane.colorBlack();


        });

        circlePane.setOnMouseReleased(e -> {
            circlePane.colorWhite();
        });


    }


    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

