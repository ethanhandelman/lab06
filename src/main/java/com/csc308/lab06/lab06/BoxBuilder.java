package com.csc308.lab06.lab06;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class BoxBuilder extends ShapeBuilder implements Runnable{
    public BoxBuilder(double xMax, double yMax){
        super(xMax, yMax);
    }
    Shape build(){
        Rectangle r = new Rectangle(genRandomDouble(super.xMax), genRandomDouble(yMax), genRandomDouble(MIN_SIZE, MAX_SIZE), genRandomDouble(MIN_SIZE, MAX_SIZE));
        r.setFill(genRandomColor());
        return r;
    }

    @Override
    public void run() {
        Rectangle r = (Rectangle)build();
        Eye eye = new Eye(r.getX(), r.getY());
        eye.add(r);
        Repository.getInstance().addBox(eye);
    }
}
