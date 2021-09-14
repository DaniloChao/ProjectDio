package ProjectDio.PersonAPI.repository;

import ProjectDio.PersonAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
