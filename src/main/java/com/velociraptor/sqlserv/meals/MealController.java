package com.velociraptor.sqlserv.meals;

import com.velociraptor.sqlserv.meals.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MealController {

    @Autowired
    private MealService mealService;

    // ... Other controller endpoints ...

    @PostMapping("/api/addmeal")
    public ResponseEntity<String> addMeal(
            @RequestParam String username,
            @RequestParam String mealName,
            @RequestParam String mealType,
            @RequestParam String mealCal) {
        int newMealCal = Integer.parseInt(mealCal);

        // Create a new Meal object
        Meal newMeal = new Meal(mealName, mealType,newMealCal,username);

        // Save the meal using the MealService
        mealService.addMeal(newMeal);

        return ResponseEntity.ok("Meal added successfully");
    }

}