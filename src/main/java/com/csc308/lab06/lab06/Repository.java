package com.csc308.lab06.lab06;

public class Repository {
    private static Repository _instance;
    private List<>

    private Repository(){

    }

    public static Repository getInstance(){
        if(_instance == null){
            _instance = new Repository();
        }
        return _instance;
    }

}
