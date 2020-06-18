package com.tvs.sms.service;

import java.util.List;

import com.tvs.sms.model.Recipe;

public interface RecipeServicable {
	List<Recipe> findAll();
	Recipe findByRecipeName(String recipeName);
	Recipe findByRecipeID(String id);
	List<Recipe> findAllByOrderByRecipeIDDesc();
	void saveOrUpdateRecipe(Recipe recipe);
	void deleteRecipe(String recipeID);

}
