package com.tvs.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvs.sms.model.Recipe;
import com.tvs.sms.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeServicable {
	
	@Autowired
	RecipeRepository recipeRepository;

	@Override
	public List<Recipe> findAll() {
		
		return recipeRepository.findAll();
	}

	@Override
	public Recipe findByRecipeName(String recipeName) {
		
		return recipeRepository.findByRecipeName(recipeName);
	}

	@Override
	public List<Recipe> findAllByOrderByRecipeIDDesc() {
		
		return recipeRepository.findAllByOrderByRecipeIDDesc();
	}

	@Override
	public void saveOrUpdateRecipe(Recipe recipe) {
		recipeRepository.save(recipe);
		
	}

	@Override
	public void deleteRecipe(String recipeID) {
		recipeRepository.deleteById(recipeID);
		
	}

	@Override
	public Recipe findByRecipeID(String id) {
		
		return recipeRepository.findByRecipeID(id);
	}

}
