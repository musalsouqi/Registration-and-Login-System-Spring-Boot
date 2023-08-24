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


    @PostMapping("/api/addmeal")
    public ResponseEntity<String> addMeal(
            @RequestParam String username,
            @RequestParam String mealName,
            @RequestParam String mealType,
            @RequestParam String mealCal,
            @RequestParam String date) {
        int newMealCal = Integer.parseInt(mealCal);

        Meal newMeal = new Meal(username, mealName,mealType,newMealCal,date);

        mealService.addMeal(newMeal);

        return ResponseEntity.ok("Meal added successfully");
    }

    @PostMapping("/api/getmeal")
    public ResponseEntity<MealResponse> getMeal(
            @RequestParam String username,
            @RequestParam String date) {
        List<Meal> meals = mealService.getMealsByUsernameAndDate(username, date);

        // Create a MealResponse object and wrap the list of meals
        MealResponse mealResponse = new MealResponse(meals);

        // Return the response with the "data" key
        return ResponseEntity.ok(mealResponse);
    }


}