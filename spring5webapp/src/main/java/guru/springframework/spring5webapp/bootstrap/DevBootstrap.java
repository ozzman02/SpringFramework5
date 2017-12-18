package guru.springframework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	private void initData() {
		
		Publisher publisher1 = new Publisher();
		publisher1.setName("publisher1");
		
		Publisher publisher2 = new Publisher();
		publisher2.setName("publisher2");
		
		publisherRepository.save(publisher1);
		publisherRepository.save(publisher2);
		
		Author eric = new Author("Erick", "Evans");
		Book ddd = new Book("Domain Driven Desing", "1234", publisher1);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "23444", publisher2);
		rod.getBooks().add(noEJB);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}
	
}
