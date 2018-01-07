package guru.springframework.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	private Category category;
	
	@Before
	public void setup() {
		category = new Category();
	}
	
	@Test
	public void getId() throws Exception {
		
		Long idValue = 4L;
		
		category.setId(idValue);
		
		assertEquals(idValue, category.getId());
	}
	
	@Test
	public void getDescription() throws Exception {
		
	}
	
	@Test
	public void getRecipes() throws Exception {
		
	}

}
