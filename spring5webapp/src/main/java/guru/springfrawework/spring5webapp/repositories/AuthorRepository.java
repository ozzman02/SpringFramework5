package guru.springfrawework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springfrawework.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
