package com.velociraptor.sqlserv.meals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class MealService {

    private final MealRepository mealRepository;

    @Autowired
    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    public Meal addMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public List<Meal> getMealsByUsernameAndDate(String username, String date) {
        return mealRepository.findByUsernameAndDate(username, date);
    }

    // ...
}