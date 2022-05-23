package com.example.project;

public class JsonData {

    private String ID;
    private String type;
    private String company;
    private String name;
    private String size;
    private String cost;

    public JsonData(String id, String login, String temp1, String temp2, String temp3){
        this.ID = id;
        this.type = type;
        this.company = company;
        this.name = name;
        this.size = size;
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() { return size; }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
