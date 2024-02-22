package com.csc308.lab06.lab06;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

import java.util.Random;

public abstract class ShapeBuilder implements Runnable{
    protected static final double MIN_SIZE = 15;
    protected static final double MAX_SIZE = 110;

    protected final double xMax;
    protected final double yMax;

    public static double genRandomDouble(double max){
        return genRandomDouble(0, max);
    }

    public static double genRandomDouble(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    public static Color genRandomColor() {
        Random random = new Random();
        return Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble());
    }

    public ShapeBuilder(double xMax, double yMax){
        this.xMax = xMax;
        this.yMax = yMax;
    }

    @Override
    public abstract void run();

    abstract Shape build();
}
