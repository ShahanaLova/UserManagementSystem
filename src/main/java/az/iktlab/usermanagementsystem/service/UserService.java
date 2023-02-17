package az.iktlab.usermanagementsystem.service;

import az.iktlab.usermanagementsystem.entity.UserEntity;
import az.iktlab.usermanagementsystem.model.User;
import az.iktlab.usermanagementsystem.model.UserDto;
import az.iktlab.usermanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(UserEntity entity){
     userRepository.save(entity);
    }

    public List<UserDto> getAll(){
        return userRepository.findAll()
                .stream()
                .map(this::buildUserDto)
                .collect(Collectors.toList());
    }

    public UserDto buildUserDto(UserEntity entity){
     return UserDto.builder()
             .id(entity.getId())
             .username(entity.getUsername())
             .personId(entity.getPerson().getId())
             .gender(entity.getGender())
             .build();

    }
}
