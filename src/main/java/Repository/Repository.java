package Repository;

import Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Person, Integer> {

    @Override
    <S extends Person> S save(S entity);


}