package com.learn.chinesequiz;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class QuestionHelper {

    public static ArrayList<Question> getEasyQuestions() {
        ArrayList<Question> easyList = new ArrayList<>();
        easyList.add(new Question("Cette image signifie quel caractère?", "车", R.drawable.car, 0));
        easyList.add(new Question("Cette image signifie quel caractère?", "火", R.drawable.fire, 0));
        easyList.add(new Question("Cette image signifie quel caractère?", "森", R.drawable.forest, 0));
        //easyList.add(new Question("Cette image signifie quel caractère?", "月", R.drawable.moon, 0));
        //easyList.add(new Question("Cette image signifie quel caractère?", "山", R.drawable.mountain, 0));
        //easyList.add(new Question("Cette image signifie quel caractère?", "日", R.drawable.sun, 0));
        //easyList.add(new Question("Cette image signifie quel caractère?", "水", R.drawable.water, 0));
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
        mediumList.add(new Question("Que signifie ce caractère ?", "maison", R.drawable.home, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "oiseau", R.drawable.bird, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "pluie", R.drawable.rain, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "pays", R.drawable.pays, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "chat", R.drawable.cat, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "nuage", R.drawable.cloud, 0));
        mediumList.add(new Question("Que signifie ce caractère ?", "neige", R.drawable.snow, 0));
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
        hardList.add(new Question("Que signifie ce caractère ?", "gagner", R.drawable.gagner, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "cuisiner", R.drawable.cuisiner, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "aimer", R.drawable.aimer, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "compliquer", R.drawable.compliquer, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "aveugler", R.drawable.aveugle, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "voleur", R.drawable.voleur, 0));
        hardList.add(new Question("Que signifie ce caractère ?", "givre", R.drawable.givre, 0));
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
