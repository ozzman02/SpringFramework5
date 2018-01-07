package guru.springframework.controllers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;

public class IndexControllerTest {
	
	@Mock
	private RecipeService recipeService;
	
	@Mock
	private Model model;
	
	private IndexController indexController;
	
	@Before
	public void setUp() throws Exception {
	
		MockitoAnnotations.initMocks(this);
		
		indexController = new IndexController(recipeService);
		
	}

	@SuppressWarnings("unchecked")
	@Test
	public void getIndexPage() throws Exception {
		
		/*
		 * TDD ----> Given, When, Then
		 */
		
		/*
		 * Given
		 */
		Recipe recipe1 = new Recipe();
		recipe1.setId(1L);
		
		Recipe recipe2 = new Recipe();
		recipe2.setId(2L);
		
		Set<Recipe> recipes = new HashSet<Recipe>();
		recipes.add(recipe1);
		recipes.add(recipe2);
		
		when(recipeService.getRecipes()).thenReturn(recipes);
		
		ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
		
		/*
		 * When
		 */
		String viewName = indexController.getIndexPage(model);
		
		/*
		 * Then
		 */
		assertEquals("index", viewName);
		
		verify(recipeService, times(1)).getRecipes();
		
		verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
		
		Set<Recipe> setInController = argumentCaptor.getValue();
		
		assertEquals(2, setInController.size());
	}

}
