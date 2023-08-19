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

    public Meal() {
    }

    public Meal(String mealName, String mealType, int mealCal, String username) {
        this.mealName = mealName;
        this.mealType = mealType;
        this.mealCal = mealCal;
        this.username = username;
    }

    public String getusername() {
        return username;
    }

    public void setUserId(int userId) {
        this.username = username;
    }
}
