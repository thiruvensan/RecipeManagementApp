package com.tvs.sms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvs.sms.model.Recipe;
import com.tvs.sms.service.RecipeServicable;

@RestController()
@RequestMapping("/recipes")
public class RecipeController {

	@Autowired
	RecipeServicable recipeService;
	
	@GetMapping(path="/")
	public List<Recipe> getAllRecipes(){
		return recipeService.findAll();
		
	}
	
	@GetMapping(path="/{recipeName}")
	public Recipe getRecipeByName(@PathVariable String recipeName) {
		return recipeService.findByRecipeName(recipeName);
	}
	
	@GetMapping(path="/orderbyRecipeID")
	public List<Recipe> getRecipesOrderByRecipeID(){
		return recipeService.findAllByOrderByRecipeIDDesc();
	}
	
	@PostMapping(path="/")
	public ResponseEntity<?> saveOrUpdateRecipe(@Valid @RequestBody Recipe recipe) {
		
		System.out.println("recipeName: "+recipe.getRecipeName());
		
		recipeService.saveOrUpdateRecipe(recipe);
		
		return new ResponseEntity("Recipe Added/updated Successfully",HttpStatus.OK);
	}
	
	@DeleteMapping(path="/{recipeID}")
	public void deleteRecipe(@PathVariable String recipeID){
		String temp = recipeService.findByRecipeID(recipeID).getRecipeID();
		recipeService.deleteRecipe(temp);
	}
}
