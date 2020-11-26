package com.example.halalharam;

import android.os.Parcel;
import android.os.Parcelable;

public class HaramJob implements Parcelable {
    private String Name;
    private String Detail;
    private int Photo;

    public HaramJob() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public static Creator<HaramJob> getCREATOR() {
        return CREATOR;
    }

    {
}

    protected HaramJob(Parcel in) {
        Name = in.readString();
        Detail = in.readString();
        Photo = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Detail);
        dest.writeInt(Photo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<HaramJob> CREATOR = new Creator<HaramJob>() {
        @Override
        public HaramJob createFromParcel(Parcel in) {
            return new HaramJob(in);
        }

        @Override
        public HaramJob[] newArray(int size) {
            return new HaramJob[size];
        }
    };
}
