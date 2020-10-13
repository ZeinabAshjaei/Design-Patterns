package com.company.momentoExercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;


public class History {

    private Deque<DocMemento> states = new ArrayDeque<>();

    public void push(DocMemento state){
        states.add(state);
    }

    public DocMemento pop (){

        return states.pop();
    }
}
