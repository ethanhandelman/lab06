package com.csc308.lab06.lab06;

import java.util.Random;
import javafx.scene.shape.Rectangle;

public class BoxBuilder implements Runnable{

    private int width = 5;

    private Repository repo;

    private double xbounds;

    private double ybounds;
    // bounds of x

    public BoxBuilder(Repository repository, double xloc, double yloc){
        repo = repository;
        xbounds = xloc;
        ybounds = yloc;
    }

    private Rectangle buildBox(double x, double y){
        Rectangle r = new Rectangle(x, y);
        r.setTranslateX(x * Math.random());
        r.setTranslateY(y * Math.random());

    }

    @Override
    public void run() {
        Rectangle r = buildBox(xbounds, ybounds);
        repo.addBox(r);
    }
}
