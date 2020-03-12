package com.learn.chinesequiz;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;

public class Levels implements Parcelable {

    private int size;
    private int wrongchoice;
    private int goodchoice;

    public Levels(int size, int wrongchoice, int goodchoice) {
        this.size = size;
        this.wrongchoice = wrongchoice;
        this.goodchoice = goodchoice;
    }

    protected Levels(Parcel in) {
        size = in.readInt();
        wrongchoice = in.readInt();
        goodchoice = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(size);
        dest.writeInt(wrongchoice);
        dest.writeInt(goodchoice);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Levels> CREATOR = new Creator<Levels>() {
        @Override
        public Levels createFromParcel(Parcel in) {
            return new Levels(in);
        }

        @Override
        public Levels[] newArray(int size) {
            return new Levels[size];
        }
    };

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWrongchoice() {
        return wrongchoice;
    }

    public void setWrongchoice(int wrongchoice) {
        this.wrongchoice = wrongchoice;
    }

    public int getGoodchoice() {
        return goodchoice;
    }

    public void setGoodchoice(int goodchoice) {
        this.goodchoice = goodchoice;
    }
}
