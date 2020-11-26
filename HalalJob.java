package com.example.halalharam;

import android.os.Parcel;
import android.os.Parcelable;

public class HalalJob implements Parcelable {
    private String Name;
    private String Detail;
    private int Photo;

    protected HalalJob(Parcel in) {
        Name = in.readString();
        Detail = in.readString();
        Photo = in.readInt();
    }

    public static final Creator<HalalJob> CREATOR = new Creator<HalalJob>() {
        @Override
        public HalalJob createFromParcel(Parcel in) {
            return new HalalJob(in);
        }

        @Override
        public HalalJob[] newArray(int size) {
            return new HalalJob[size];
        }
    };


    public HalalJob() {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Name);
        parcel.writeString(Detail);
        parcel.writeInt(Photo);
    }
}
