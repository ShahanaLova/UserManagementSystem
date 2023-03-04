package az.iktlab.usermanagementsystem.service;

import az.iktlab.usermanagementsystem.entity.UserEntity;
import az.iktlab.usermanagementsystem.mapper.UserMapper;
import az.iktlab.usermanagementsystem.model.UserDto;
import az.iktlab.usermanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(UserDto user) {

        UserEntity userEntity = UserMapper.Instance.mapToEntity(user);


        userRepository.save(userEntity);
    }

    public UserDto getUserById(Long id) {
        var entity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User id nor found"));

        return buildUserDto(entity);
    }

    public void UpdateUser(UserDto userdto) {
        var entity = userRepository.findById(userdto.getId())
                .orElseThrow(() -> new RuntimeException("User id not found"));

        entity = UserMapper.Instance.mapToEntity(userdto);
//        entity.setId(userdto.getId());
//        entity.setUsername(userdto.getUsername());
//        entity.setPassword(userdto.getPassword());
//        entity.setPerson(userdto.getPerson());

        userRepository.save(entity);

    }

    public List<UserDto> getAll() {
        return userRepository.findAll()
                .stream()
                .map(it -> {
                    UserDto dto =
                            UserDto.builder()
                                    .id(it.getId())
                                    .username(it.getUsername())
                                    .password(it.getPassword())
                                    .person(it.getPerson())
                                    .gender(it.getGender())
                                    .build();
                    return dto;

                })
                .collect(Collectors.toList());
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }


    public UserDto buildUserDto(UserEntity entity) {
        return UserDto.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .gender(entity.getGender())
                .person(entity.getPerson())
                .build();

    }
}
