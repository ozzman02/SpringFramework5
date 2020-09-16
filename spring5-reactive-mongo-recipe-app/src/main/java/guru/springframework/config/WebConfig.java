package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class WebConfig {
	
	private static final String GET_RECIPES_ROUTE = "/api/recipes";
	
	@Bean
	public RouterFunction<?> routes(RecipeService recipeService) {
		return RouterFunctions.route(GET(GET_RECIPES_ROUTE), 
				serverRequest -> ServerResponse
					.ok()
					.contentType(MediaType.APPLICATION_JSON)
					.body(recipeService.getRecipes(), Recipe.class));
	}
	
}
