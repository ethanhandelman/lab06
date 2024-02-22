package com.csc308.lab06.lab06;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.util.Collections;

public class Eye extends Group {
    private Circle eyeVisualOuter;
    private Circle eyeVisualInner;
    public Eye(Rectangle rect){

    }
    public Eye(double x, double y){
        eyeVisualOuter = new Circle(x + 8 , y + 8, 8);
        eyeVisualInner = new Circle(x + 4, y + 4, 3, Color.WHITE);
        getChildren().add(eyeVisualOuter);
    }

    public void add(Node shape){
        getChildren().clear();
        getChildren().add(shape);
        getChildren().add(eyeVisualOuter);
        getChildren().add(eyeVisualInner);
        //Collections.reverse(getChildren());
    }
}
