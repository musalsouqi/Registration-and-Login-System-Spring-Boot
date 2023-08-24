package com.velociraptor.sqlserv.meals;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

@Entity
@Table(schema = "mealdb", name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "mealname")
    private String mealName;

    @Column(name = "mealtype")
    private String mealType;

    @Column(name = "mealcal")
    private int mealCal;

    @Column(name = "date")
    private String date;

    public Meal(String username, String mealName, String mealType, int mealCal, String date) {
        this.username = username;
        this.mealName = mealName;
        this.mealType = mealType;
        this.mealCal = mealCal;
        this.date = date;
    }

    // Default constructor (needed for JPA)
    public Meal() {
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getMealCal() {
        return mealCal;
    }

    public void setMealCal(int mealCal) {
        this.mealCal = mealCal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
