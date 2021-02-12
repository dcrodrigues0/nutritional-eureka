package com.br.nutrition.controller;

import com.br.nutrition.model.Food;
import com.br.nutrition.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping(value="/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public Page<Food> find(
            @RequestParam(required = false) Long id,
            @RequestParam int page,
            @RequestParam int amountItensPerPage
    ){
        Pageable pagination = PageRequest.of(page, amountItensPerPage);

        if(id == null){
            Page<Food> foods = foodRepository.findAll(pagination);
            return foods;
        }

        Page<Food> foods = foodRepository.findById(id,pagination);
        return foods;
    }

    @PutMapping("/{id}") @Transactional
    public ResponseEntity<Food> update(
            @PathVariable Long id,
            @RequestBody @Valid Food foodBodyData
    ){
        Optional<Food> optional = foodRepository.findById(id);
        if(optional.isPresent()){
            Food food = foodBodyData.update(id, foodRepository);
            return ResponseEntity.ok(food);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Food> create(@RequestBody Food food, UriComponentsBuilder uriBuilder){
        foodRepository.save(food);

        URI uri = uriBuilder.path("/food/{id}").buildAndExpand(food.getId()).toUri();
        return ResponseEntity.created(uri).body(food);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestParam Long id){
        Optional<Food> optional = foodRepository.findById(id);
        if(optional.isPresent()){
            foodRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}
