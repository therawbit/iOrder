package com.example.iorder.model;

import java.util.ArrayList;

public class FoodItem {
    int id;
    String name;
    String description;
    ArrayList<FoodCatagory> fooditems;

    public FoodItem(int id, String name, String description, ArrayList<FoodCatagory> fooditems) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fooditems = fooditems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<FoodCatagory> getFooditems() {
        return fooditems;
    }

    public void setFooditems(ArrayList<FoodCatagory> fooditems) {
        this.fooditems = fooditems;
    }
}