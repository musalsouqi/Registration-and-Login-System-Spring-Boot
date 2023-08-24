package com.velociraptor.sqlserv.meals;
import java.util.List;

public class MealResponse {
    private List<Meal> data;

    public MealResponse(List<Meal> data) {
        this.data = data;
    }

    public List<Meal> getData() {
        return data;
    }

    public void setData(List<Meal> data) {
        this.data = data;
    }
}