/* 
User: Urmi
Date: 1/2/2020 
Time: 5:09 PM
*/

package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.info("In the recipe service");
        Set<Recipe> result = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(result::add);
        return result;
    }
}
