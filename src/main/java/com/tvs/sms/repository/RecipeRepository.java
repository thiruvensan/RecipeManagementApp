package com.tvs.sms.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tvs.sms.model.Recipe;
@Repository()
public interface RecipeRepository extends MongoRepository<Recipe,String>{
	
	Recipe findByRecipeName(String recipeName);
	Recipe findByRecipeID(String recipeID);
	List<Recipe> findAllByOrderByRecipeIDDesc();

}
