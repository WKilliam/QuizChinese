package com.learn.chinesequiz;

import java.util.ArrayList;
import java.util.HashMap;

public class Levels {

    private HashMap<Integer, ArrayList<Question>> difficulty;

    public Levels(ArrayList<Question> easy,ArrayList<Question> medium,ArrayList<Question> hard) {
        this.difficulty.put(1,easy);
        this.difficulty.put(2,medium);
        this.difficulty.put(3,hard);
    }

    public HashMap<Integer, ArrayList<Question>> getDifficulty() {
        return difficulty;
    }
}
