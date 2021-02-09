package com.example.myapplication;

public class Contacts {

    private String date;
    private String meetingDesc;




    public Contacts(String date,String meetingDesc) {

        this.date = date;
        this.meetingDesc  = meetingDesc;

    }

    public Contacts() {

    }


    public String getDate() {
        return date;
    }

    public String getMeetingDesc() {
        return meetingDesc;
    }

    public void setNumber(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.meetingDesc = meetingDesc;
    }

}
