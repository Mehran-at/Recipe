package guru.springframework.RecipeService;

import guru.springframework.doamin.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
