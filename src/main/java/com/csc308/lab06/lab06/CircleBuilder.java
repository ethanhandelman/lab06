package com.csc308.lab06.lab06;

import java.util.Random;
import javafx.scene.shape.Circle;

public class CircleBuilder implements Runnable {

    private int width = 5;
    private Repository repo;
    private double xbounds;
    private double ybounds;

    public CircleBuilder(Repository repository, double xloc, double yloc){
        repo = repository;
        xbounds = xloc;
        ybounds = yloc;

    }

    private Circle buildCircle(double x, double y) {
        Circle c = new Circle(width);
        c.setTranslateX(xbounds * Math.random());
        c.setTranslateY(ybounds * Math.random());

    }

    @Override
    public void run() {

        Circle c = buildCircle(xbounds, ybounds);
        repo.addCircle(c);

    }
}
