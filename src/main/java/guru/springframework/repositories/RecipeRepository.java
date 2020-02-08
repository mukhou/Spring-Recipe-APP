/* 
User: Urmi
Date: 1/2/2020 
Time: 1:02 PM
*/

package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
