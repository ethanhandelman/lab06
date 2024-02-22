package com.csc308.lab06.lab06;

import javafx.scene.Node;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    //this is an example of the Singleton pattern
    private static Repository _instance;

    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    private List<Node> boxes;
    private List<Node> circles;

    private Repository(){
        boxes = new ArrayList<>();
        circles = new ArrayList<>();
    }

    public void addBox(Node rect){
        boxes.add(rect);
        changes.firePropertyChange("newBox", null, rect);
    }

    public void addCircle(Node circ){
        circles.add(circ);
        changes.firePropertyChange("newCirc", null, circ);
    }

    public void addPropertyChangeListener(PropertyChangeListener l){
        changes.addPropertyChangeListener(l);
    }

    public static Repository getInstance(){
        if(_instance == null){
            _instance = new Repository();
        }
        return _instance;
    }

}
