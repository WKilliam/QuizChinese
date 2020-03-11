package com.learn.chinesequiz;

import android.os.Parcel;
import android.os.Parcelable;

public class Question implements Parcelable {

    private String question;
    private String goodResult;
    private String badResult;
    private String badResult1;
    private String badResult2;
    private int level;
    private int picture;
    private int sound;

    public Question(String question, String goodResult, String badResult, String badResult1, String badResult2, int level, int picture, int sound) {
        this.question = question;
        this.goodResult = goodResult;
        this.badResult = badResult;
        this.badResult1 = badResult1;
        this.badResult2 = badResult2;
        this.level = level;
        this.picture = picture;
        this.sound = sound;
    }

    protected Question(Parcel in) {
        question = in.readString();
        goodResult = in.readString();
        badResult = in.readString();
        badResult1 = in.readString();
        badResult2 = in.readString();
        level = in.readInt();
        picture = in.readInt();
        sound = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(goodResult);
        dest.writeString(badResult);
        dest.writeString(badResult1);
        dest.writeString(badResult2);
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
}
