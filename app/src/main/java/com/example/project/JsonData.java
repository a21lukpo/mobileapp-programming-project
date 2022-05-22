package com.example.project;

public class JsonData {

    private String id;
    private String login;
    private String temp1;
    private String temp2;
    private String temp3;

    public JsonData(String id, String login, String temp1, String temp2, String temp3){
        this.id = id;
        this.login = login;
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.temp3 = temp3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3;
    }
}
