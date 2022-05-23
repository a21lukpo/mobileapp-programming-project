package com.example.project;

public class JsonData {

    private String ID;
    private String company;
    private String name;
    private int size;
    private int cost;

    public JsonData(String id, String company, String name, int size, int cost){
        this.ID = id;
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

    public int getSize() { return size; }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
