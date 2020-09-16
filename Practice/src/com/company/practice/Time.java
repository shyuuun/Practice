package com.company.practice;

public class Time {
    //initialize variables
    private int hour;
    private int minutes;
    private int seconds;

    public Time(){
        this(0,0,0);
    }
    public Time(int h){
        this(h,0,0);
    }
    public Time(int h , int m){
        this(h, m, 0);
    }
    public Time(int h, int m, int s){
        setTime(h, m, s);
    }

    //getters and setters
    public void setHour(int h){
        hour = ((h >= 0 && h < 24) ? h : 0 );
    }
    public void setMinute(int m){
        minutes = ((m >= 0 && m < 60) ? m : 0 );
    }
    public void setSecond(int s){
        seconds = ((s >= 0 && s < 60) ? s : 0 );
    }

    public void setTime(int h, int m, int s){
      setHour(h);
      setMinute(m);
      setSecond(s);
    }

    public int getHour(){
        return hour;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    public String toMilitarize(){
        return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSeconds());
    }

    public String toStandard(){
        return String.format("%d:%02d:%02d %s", (hour == 0||hour == 12)?12 : hour%12, minutes, seconds, (hour < 12 ? "AM": "PM"));
    }


}
