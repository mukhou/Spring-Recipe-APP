/* 
User: Urmi
Date: 12/29/2019 
Time: 8:31 PM
*/

package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.UnitOfMeasureRepository;
import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(RecipeService recipeService, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.recipeService = recipeService;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        log.info("Inside controller");
       model.addAttribute("recipes", recipeService.getRecipes());
       return "index";
    }

    @GetMapping(path="/unit", produces = "application/json")
    public UnitOfMeasure getCategory(){
        log.info("Inside controller");
        return unitOfMeasureRepository.findByDescription("Teaspoon").get();
    }

}
