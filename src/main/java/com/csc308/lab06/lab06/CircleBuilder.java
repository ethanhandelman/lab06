package com.csc308.lab06.lab06;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class CircleBuilder extends ShapeBuilder implements Runnable {

    public CircleBuilder(double xMax, double yMax){
        super(xMax, yMax);
    }

    Shape build() {
        Circle c = new Circle(genRandomDouble(xMax), genRandomDouble(yMax), genRandomDouble(MIN_SIZE, MAX_SIZE));
        c.setFill(genRandomColor());
        return c;
    }

    @Override
    public void run() {
        Circle c = (Circle)build();
        Repository.getInstance().addCircle(c);
    }
}
