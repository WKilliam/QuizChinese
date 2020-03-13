package com.learn.chinesequiz;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class QuestionHelper {

    public static ArrayList<Question> getEasyQuestions() {
        ArrayList<Question> easyList = new ArrayList<>();
        easyList.add(new Question("Quel caractère chinois veut dire 'voiture'?", "车","FACILE", R.drawable.car, 0));
        easyList.add(new Question("Quel caractère chinois veut dire 'feu'?", "火", "FACILE",R.drawable.fire, 0));
        easyList.add(new Question("Quel caractère chinois veut dire 'forêt'?", "森","FACILE", R.drawable.forest, 0));
        easyList.add(new Question("Quel caractère chinois veut dire 'lune'?", "月", "FACILE",R.drawable.moon, 0));
        easyList.add(new Question("Quel caractère chinois veut dire 'montaine'?", "山", "FACILE",R.drawable.mountain, 0));
        easyList.add(new Question("Quel caractère chinois veut dire 'soleil'?", "日", "FACILE",R.drawable.sun, 0));
        easyList.add(new Question("Quel caractère chinois veut dire 'l'eau'?", "水", "FACILE",R.drawable.water, 0));
        return easyList;
    }

    public static ArrayList<String> getWrongEasyResponses(){
        ArrayList<String> easyWrongResponses = new  ArrayList<>();
        easyWrongResponses.add("人");
        easyWrongResponses.add("国");
        easyWrongResponses.add("干");
        easyWrongResponses.add("马");
        easyWrongResponses.add("舌");
        easyWrongResponses.add("口");
        easyWrongResponses.add("好");
        easyWrongResponses.add("比");
        easyWrongResponses.add("曰");
        easyWrongResponses.add("吃");

        return easyWrongResponses;
    }

    public static ArrayList<Question> getMediumQuestions() {
        ArrayList<Question> mediumList = new ArrayList<>();
        mediumList.add(new Question("Que signifie ce caractère ?", "maison","INTERMEDIAIRE", R.drawable.home, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "oiseau","INTERMEDIAIRE", R.drawable.bird, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "pluie","INTERMEDIAIRE", R.drawable.rain, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "pays","INTERMEDIAIRE", R.drawable.pays, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "chat", "INTERMEDIAIRE",R.drawable.cat, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "nuage","INTERMEDIAIRE", R.drawable.cloud, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "neige","INTERMEDIAIRE", R.drawable.snow, 0));
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

    public static ArrayList<Question> getHardQuestions() {
        ArrayList<Question> hardList = new ArrayList<>();
        hardList.add(new Question("Que signifie ce caractère ?", "gagner", "DIFFICILE", R.drawable.gagner, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "cuisiner", "DIFFICILE",R.drawable.cuisiner, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "aimer", "DIFFICILE",R.drawable.aimer, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "compliquer","DIFFICILE", R.drawable.compliquer, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "aveugler", "DIFFICILE",R.drawable.aveugle, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "voleur", "DIFFICILE",R.drawable.voleur, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "givre", "DIFFICILE",R.drawable.givre, 0));
        return hardList;
    }

    public static ArrayList<String> getWrongHardResponses(){
        ArrayList<String> hardWrongResponses = new  ArrayList<>();
        hardWrongResponses.add("silence");
        hardWrongResponses.add("prochain");
        hardWrongResponses.add("salle");
        hardWrongResponses.add("immeuble");
        hardWrongResponses.add("bimbimbap");
        hardWrongResponses.add("restaurant");
        hardWrongResponses.add("appetit");
        hardWrongResponses.add("assiette");
        hardWrongResponses.add("fouchette");
        hardWrongResponses.add("manger");

        return hardWrongResponses;
    }





}
