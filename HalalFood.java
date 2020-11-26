package com.example.halalharam;

import android.os.Parcel;
import android.os.Parcelable;

public class HalalFood implements Parcelable {
    private String NameHalal;
    private String DetailHalal;
    private int PhotoHalal;

    protected HalalFood(Parcel in) {
        NameHalal = in.readString();
        DetailHalal = in.readString();
        PhotoHalal = in.readInt();
    }

    public static final Creator<HalalFood> CREATOR = new Creator<HalalFood>() {
        @Override
        public HalalFood createFromParcel(Parcel in) {
            return new HalalFood(in);
        }

        @Override
        public HalalFood[] newArray(int size) {
            return new HalalFood[size];
        }
    };

    public HalalFood(){

    }

    public String getName() {
        return NameHalal;
    }

    public void setName(String name) {
        NameHalal = name;
    }

    public String getDetail() {
        return DetailHalal;
    }

    public void setDetail(String detail) {
        DetailHalal = detail;
    }

    public int getPhoto() {
        return PhotoHalal;
    }

    public void setPhoto(int photo) {
        PhotoHalal = photo;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(NameHalal);
        parcel.writeString(DetailHalal);
        parcel.writeInt(PhotoHalal);
    }
}


