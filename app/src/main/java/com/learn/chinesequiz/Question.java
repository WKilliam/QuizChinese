package com.learn.chinesequiz;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question implements Parcelable {

    private String question;
    private String goodResult;
    private int picture;
    private int sound;

    public Question(String question, String goodResult, int picture) {
        this.question = question;
        this.goodResult = goodResult;
        this.picture = picture;
    }

    public Question(String question, String goodResult, int picture, int sound) {
        this.question = question;
        this.goodResult = goodResult;
        this.picture = picture;
        this.sound = sound;
    }


    protected Question(Parcel in) {
        question = in.readString();
        goodResult = in.readString();
        picture = in.readInt();
        sound = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(goodResult);
        dest.writeInt(picture);
        dest.writeInt(sound);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getGoodResult() {
        return goodResult;
    }

    public void setGoodResult(String goodResult) {
        this.goodResult = goodResult;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }


    private Question easy1 = new Question("Que signifie ce caractère ?","Voiture", R.drawable.car, 0);
    private Question easy2 = new Question("Que signifie ce caractère ?","Feu", R.drawable.fire, 0);
    private Question easy3 = new Question("Que signifie ce caractère ?","Forêt", R.drawable.forest, 0);
    private Question easy4 = new Question("Que signifie ce caractère ?","Lune", R.drawable.moon, 0);
    private Question easy5 = new Question("Que signifie ce caractère ?","Montagne", R.drawable.mountain, 0);
    private Question easy6 = new Question("Que signifie ce caractère ?","Soleil", R.drawable.sun, 0);
    private Question easy7 = new Question("Que signifie ce caractère ?","Eau", R.drawable.water, 0);

}