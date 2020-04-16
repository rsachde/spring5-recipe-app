package guru.springframework.repository;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

//Created by risachde8

public interface RecipeRepository  extends CrudRepository<Recipe,Long> {
}
