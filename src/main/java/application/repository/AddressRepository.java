package application.repository;

import application.entity.skofnung.database.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AddressRepository extends CrudRepository<Address, String> {
    List<Address> findByLocation(String location);
}
