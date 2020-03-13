package com.learn.chinesequiz;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question implements Parcelable {

    private String question;
    private String goodResult;
    private String levelS;
    private int picture;
    private int sound;

    public Question(String question, String goodResult,String levelS, int picture) {
        this.question = question;
        this.goodResult = goodResult;
        this.picture = picture;
        this.levelS=levelS;
    }

    public Question(String question, String goodResult,String levelS, int picture, int sound) {
        this.question = question;
        this.goodResult = goodResult;
        this.picture = picture;
        this.sound = sound;
        this.levelS=levelS;
    }


    protected Question(Parcel in) {
        question = in.readString();
        goodResult = in.readString();
        picture = in.readInt();
        sound = in.readInt();
        levelS=in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(goodResult);
        dest.writeInt(picture);
        dest.writeInt(sound);
        dest.writeString(levelS);
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

    public String getLevelS() {
        return levelS;
    }

    public void setLevelS(String levelS) {
        this.levelS = levelS;
    }

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


}