package com.csc308.lab06.lab06;

import javafx.scene.shape.Circle;

public class CircleBuilder implements Runnable {

    private int width = 5;
    private Repository repo;
    private int x;
    private int ybounds;

    public CircleBuilder(Repository repository, int xloc, int yloc){
        repo = repository;
        x = xloc;
        y = yloc;

    }

    public void buildCircle(int x, int y){
        Circle c = new Circle(width);
        c.setTranslateX(x);
        c.setTranslateY(y);

    }

    @Override
    public void run() {

        buildCircle(x, y);
    }
}
