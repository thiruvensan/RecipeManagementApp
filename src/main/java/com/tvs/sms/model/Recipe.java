package com.tvs.sms.model;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="recipe")
public class Recipe {
	
	@Id
	private String recipeID;
	

	@Size(min=2, message="Name should have atleast 2 characters")
	private String recipeName;
	
	private String recipeDescription;
	private int recipePrice;
	private String recipeImagePath;
	
	public String getRecipeID() {
		return recipeID;
	}
	public void setRecipeID(String recipeID) {
		this.recipeID = recipeID;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getRecipeDescription() {
		return recipeDescription;
	}
	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}
	public int getRecipePrice() {
		return recipePrice;
	}
	public void setRecipePrice(int recipePrice) {
		this.recipePrice = recipePrice;
	}
	public String getRecipeImagePath() {
		return recipeImagePath;
	}
	public void setRecipeImagePath(String recipeImagePath) {
		this.recipeImagePath = recipeImagePath;
	}
	
	

}
