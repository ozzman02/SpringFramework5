package guru.springfrawework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springfrawework.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
