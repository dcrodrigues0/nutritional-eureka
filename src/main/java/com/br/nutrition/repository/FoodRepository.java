package com.br.nutrition.repository;

import com.br.nutrition.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {

}