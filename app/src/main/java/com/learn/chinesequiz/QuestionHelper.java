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

    public static ArrayList<Question> getMediumQuestions() {
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

    public static ArrayList<String> getWrongMediumResponses(){
        ArrayList<String> wrongResponses = new  ArrayList<>();
        wrongResponses.add("Camion");
        wrongResponses.add("Feuille");
        wrongResponses.add("Ville");
        wrongResponses.add("Ciel");
        wrongResponses.add("Colline");
        wrongResponses.add("Tronc");
        wrongResponses.add("Nourriture");
        wrongResponses.add("Sac");
        wrongResponses.add("Plage");
        wrongResponses.add("Etoile");

        return wrongResponses;
    }



}
