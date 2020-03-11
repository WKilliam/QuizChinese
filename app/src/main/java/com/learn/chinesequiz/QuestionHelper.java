package com.learn.chinesequiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionHelper {

    /*
    public static List<Question> getEasyQuestions() {
        ArrayList<Question> easyList = new ArrayList<>();
        easyList.add(new Question("Que signifie ce caractère ?", "Voiture", R.drawable.car, 0));
        easyList.add(new Question("Que signifie ce caractère ?", "Feu", R.drawable.fire, 0));
        easyList.add(new Question("Que signifie ce caractère ?", "Forêt", R.drawable.forest, 0));
        easyList.add(new Question("Que signifie ce caractère ?", "Lune", R.drawable.moon, 0));
        easyList.add(new Question("Que signifie ce caractère ?", "Montagne", R.drawable.mountain, 0));
        easyList.add(new Question("Que signifie ce caractère ?", "Soleil", R.drawable.sun, 0));
        easyList.add(new Question("Que signifie ce caractère ?", "Eau", R.drawable.water, 0));
        return easyList;
    }
    */
    public static ArrayList<String> getWrongEasyResponses(){
        ArrayList<String> easyWrongResponses = new  ArrayList<>();
        easyWrongResponses.add("Camion");
        easyWrongResponses.add("Feuille");
        easyWrongResponses.add("Ville");
        easyWrongResponses.add("Ciel");
        easyWrongResponses.add("Colline");
        easyWrongResponses.add("Tronc");
        easyWrongResponses.add("Nourriture");
        easyWrongResponses.add("Sac");
        easyWrongResponses.add("Plage");
        easyWrongResponses.add("Etoile");

        return easyWrongResponses;
    }

    public static ArrayList<Question> getMediumQuestions() {
        ArrayList<Question> mediumList = new ArrayList<>();
        mediumList.add(new Question("Que signifie ce caractère ?", "车", R.drawable.car, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "火", R.drawable.fire, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "森", R.drawable.forest, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "月", R.drawable.moon, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "山", R.drawable.mountain, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "日", R.drawable.sun, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "水", R.drawable.water, 0));
        return mediumList;
    }

    public static ArrayList<String> getWrongMediumResponses(){
        ArrayList<String> mediumWrongResponses = new  ArrayList<>();
        mediumWrongResponses.add("Camion");
        mediumWrongResponses.add("Feuille");
        mediumWrongResponses.add("Ville");
        mediumWrongResponses.add("Ciel");
        mediumWrongResponses.add("Colline");
        mediumWrongResponses.add("Tronc");
        mediumWrongResponses.add("Nourriture");
        mediumWrongResponses.add("Sac");
        mediumWrongResponses.add("Plage");
        mediumWrongResponses.add("Etoile");

        return mediumWrongResponses;
    }





}
