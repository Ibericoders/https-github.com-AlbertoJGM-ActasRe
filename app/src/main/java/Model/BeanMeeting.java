package Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Itheron on 15/08/2017.
 */

public class BeanMeeting implements Parcelable{
    private String title;
    private long date;
    private long next;

    public BeanMeeting(String title, long date, long next) {
        this.title = title;
        this.date = date;
        this.next = next;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }


    public long getNext() {
        return next;
    }

    public void setNext(long next) {
        this.next = next;
    }



    @Override
    public String toString() {
        return "BeanMeeting{" +
                "title='" + title + '\'' +
                "date='" + date + '\'' +
                ", next='" + next + '\'' +
                '}';
    }


    /*
     * Implementacion de Parcelable
     */
    protected BeanMeeting(Parcel in) {
        title = in.readString();
        date = in.readLong();
        next = in.readLong();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeLong(date);
        dest.writeLong(next);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<BeanMeeting> CREATOR = new Parcelable.Creator<BeanMeeting>() {
        @Override
        public BeanMeeting createFromParcel(Parcel in) {
            return new BeanMeeting(in);
        }

        @Override
        public BeanMeeting[] newArray(int size) {
            return new BeanMeeting[size];
        }
    };
}
