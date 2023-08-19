package com.velociraptor.sqlserv.meals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    // Additional custom query methods can be defined here
}
