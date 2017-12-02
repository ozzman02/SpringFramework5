package guru.springfrawework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springfrawework.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
