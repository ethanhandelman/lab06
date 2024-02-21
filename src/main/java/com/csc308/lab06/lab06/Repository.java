package com.csc308.lab06.lab06;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository _instance;

    private List<Rectangle> boxes;
    private List<Circle> circles;

    private Repository(){
        boxes = new ArrayList<>();
        circles = new ArrayList<>();
    }

    private void addBox(Rectangle rect){
        boxes.add(rect);
    }

    private void addCircle(Circle circ){
        circles.add(circ);
    }

    public static Repository getInstance(){
        if(_instance == null){
            _instance = new Repository();
        }
        return _instance;
    }

}
