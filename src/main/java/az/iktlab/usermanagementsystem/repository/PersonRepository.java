package az.iktlab.usermanagementsystem.repository;

import az.iktlab.usermanagementsystem.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity,Long> {

   // Optional<List<PersonEntity>> find
}
