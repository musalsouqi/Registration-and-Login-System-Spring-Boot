package com.velociraptor.sqlserv.meals;

import com.velociraptor.sqlserv.meals.Meal;
import com.velociraptor.sqlserv.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
            @RequestParam String mealCal,
            @RequestParam String date) {
        int newMealCal = Integer.parseInt(mealCal);

        Meal newMeal = new Meal(mealName, mealType,newMealCal,username,date);

        mealService.addMeal(newMeal);

        return ResponseEntity.ok("Meal added successfully");
    }

    @PostMapping("/api/getmeal")
    public ResponseEntity<List<Meal>> getMeal(
            @RequestParam String username,
            @RequestParam String date) {
        List<Meal> meals = mealService.getMealsByUsernameAndDate(username, date); // Use service method
        return ResponseEntity.ok(meals);
    }


}