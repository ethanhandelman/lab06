package com.csc308.lab06.lab06;

import java.util.Random;
import javafx.scene.shape.Rectangle;

public class BoxBuilder implements Runnable{

    private int width = 5;

    private Repository repo;

    private int xbounds;

    private int ybounds;

    public BoxBuilder(Repository repository, int xloc, int yloc){
        repo = repository;
        xbounds = xloc;
        ybounds = yloc;
    }

    public void buildBox(int x, int y){
        Rectangle r = new Rectangle(x, y);
        r.setTranslateX();
        r.setTranslateY(y);

    }

    @Override
    public void run() {
        buildBox(x, y);
    }
}
