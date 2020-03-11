package com.learn.chinesequiz;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question implements Parcelable {

    private String question;
    private String goodResult;
    private int level;
    private int picture;
    private int sound;

    public Question(String question, String goodResult, int level, int picture, int sound) {
        this.question = question;
        this.goodResult = goodResult;
        this.level = level;
        this.picture = picture;
        this.sound = sound;
    }

    protected Question(Parcel in) {
        question = in.readString();
        goodResult = in.readString();
        level = in.readInt();
        picture = in.readInt();
        sound = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(goodResult);
        dest.writeInt(level);
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

    public String getGoodResult() {
        return goodResult;
    }

    public String getQuestion() {
        return question;
    }
}
