package com.example.action;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class MainStage extends Application {
    public static int circle_x = 250;
    public static int circle_y = 250;
    @Override
    public void start(Stage stage){

        Circle circle = new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setRadius(50);

        Button left = new Button("Left");
        left.setLayoutX(0);
        left.setLayoutY(250);

        Button right = new Button("Right");
        right.setLayoutX(460);
        right.setLayoutY(250);

        Button up = new Button("Up");
        up.setLayoutX(250);
        up.setLayoutY(0);

        Button down = new Button("Down");
        down.setLayoutX(250);
        down.setLayoutY(460);

        left.setOnAction(e->{
            Controler c_left = new Controler();
            c_left.left();
            circle.setCenterX(circle_x);
        });

        right.setOnAction(e->{
            Controler c_right = new Controler();
            c_right.right();
            circle.setCenterX(circle_x);
        });

        up.setOnAction(e->{
            Controler c_up = new Controler();
            c_up.up();
            circle.setCenterY(circle_y);
        });

        down.setOnAction(e->{
            Controler c_down = new Controler();
            c_down.down();
            circle.setCenterY(circle_y);
        });


        Pane pane = new Pane();
        pane.getChildren().addAll(left, right, up, down, circle);


        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("simple");
        stage.show();


    }

}
