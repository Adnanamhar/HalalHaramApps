package com.example.halalharam;

import android.os.Parcel;
import android.os.Parcelable;

public class HaramFood implements Parcelable {
    private String NameHaram;

    public HaramFood() {

    }

    public String getNameHaram() {
        return NameHaram;
    }

    public void setNameHaram(String nameHaram) {
        NameHaram = nameHaram;
    }

    public String getDetailHaram() {
        return DetailHaram;
    }

    public void setDetailHaram(String detailHaram) {
        DetailHaram = detailHaram;
    }

    public int getPhotoHaram() {
        return PhotoHaram;
    }

    public void setPhotoHaram(int photoHaram) {
        PhotoHaram = photoHaram;
    }

    public static Creator<HaramFood> getCREATOR() {
        return CREATOR;
    }

    private String DetailHaram;
    private int PhotoHaram; {
}

    protected HaramFood(Parcel in) {
        NameHaram = in.readString();
        DetailHaram = in.readString();
        PhotoHaram = in.readInt();
    }

    public static final Creator<HaramFood> CREATOR = new Creator<HaramFood>() {
        @Override
        public HaramFood createFromParcel(Parcel in) {
            return new HaramFood(in);
        }

        @Override
        public HaramFood[] newArray(int size) {
            return new HaramFood[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(NameHaram);
        parcel.writeString(DetailHaram);
        parcel.writeInt(PhotoHaram);
    }
}
