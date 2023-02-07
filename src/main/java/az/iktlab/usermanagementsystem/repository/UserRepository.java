package az.iktlab.usermanagementsystem.repository;

import az.iktlab.usermanagementsystem.entity.PersonEntity;
import az.iktlab.usermanagementsystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<UserEntity,Long> {
  //  Optional<List<PersonEntity>> findAllByName(String name);
}
