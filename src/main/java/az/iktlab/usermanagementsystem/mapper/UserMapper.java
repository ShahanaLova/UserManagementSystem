package az.iktlab.usermanagementsystem.mapper;
import az.iktlab.usermanagementsystem.entity.UserEntity;
import az.iktlab.usermanagementsystem.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class UserMapper {
    public static final UserMapper Instance = Mappers.getMapper(UserMapper.class);

    public abstract UserEntity mapToEntity(UserDto userdto);

}
